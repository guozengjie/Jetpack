package club.guozengjie.jetpack

import retrofit2.Retrofit

object RetrofitManage {
    var retrofit: Retrofit? = null

    private fun newInstance(): Retrofit? {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(NetConfig.BASE_URL) //网络请求完整的URL = 通过实例化时.baseUrl()设置+网络请求接口的注解设置
                .build()
        }
        return retrofit
    }

    fun createAPI(): API? {
        return newInstance()?.create(API::class.java)
    }
}
