package club.guozengjie.jetpack

import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainPresenter(val mainCallBack: MainCallBack) {
    fun onClickBtn(btn: View) {
        (btn as Button).text = "古天乐"
    }

    fun onClickIv() {
        println("单击了图片")
    }

    fun getNews() {
        RetrofitManage.createAPI()?.getNews()?.enqueue(object : Callback<ResponseBody> {
            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                mainCallBack.error()
            }

            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                mainCallBack.message(response.body()?.string())
            }

        })
    }
}