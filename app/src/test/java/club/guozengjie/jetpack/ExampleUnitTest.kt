package club.guozengjie.jetpack

import android.util.Log
import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import org.junit.Assert.assertEquals
import org.junit.Test
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun aaa() {
        val client = OkHttpClient.Builder().build()
        val retrofit = Retrofit.Builder()
            .baseUrl(NetConfig.BASE_URL) //网络请求完整的URL = 通过实例化时.baseUrl()设置+网络请求接口的注解设置
            .client(client)
            .build()
        val mApi = retrofit.create(API::class.java)
        val call = mApi.getNews(1, 10)
        call.enqueue(object : Callback<ResponseBody> {
            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                println("============")
                Log.i("TAG","=============")
            }

            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                println("==================")
                Log.i("TAG","=============")
            }
        })
    }
}
