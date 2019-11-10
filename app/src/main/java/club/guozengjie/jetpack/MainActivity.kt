package club.guozengjie.jetpack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.BindingMethod
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import club.guozengjie.jetpack.databinding.ActivityMainBinding
import com.alibaba.fastjson.JSON
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainCallBack {
    private var arrayList: ArrayList<New> = ArrayList()
    override fun message(message: String?) {
        arrayList.addAll(
            JSON.parseArray(
                JSON.parseObject(message).getJSONArray("result").toJSONString(),
                New::class.java
            )
        )
        mRecyclerView.adapter?.notifyDataSetChanged()
    }

    override fun error() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.mainPresenter = MainPresenter(this)
        binding.user = User()
        binding.user?.firstName?.set("文川雪")
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.adapter = NewsAdapter(arrayList)
        binding.mainPresenter!!.getNews()
    }
}
