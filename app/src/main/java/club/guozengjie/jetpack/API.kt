package club.guozengjie.jetpack

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface API {
    @GET("getWangYiNews")
    fun getNews(): Call<ResponseBody>
}