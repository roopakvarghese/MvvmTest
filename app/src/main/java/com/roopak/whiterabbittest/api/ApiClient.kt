package com.roopak.whiterabbittest.api



import com.roopak.whiterabbittest.BuildConfig
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object whiteRabbitApiClient{

    val getClient : Retrofit
        get() {
            val logging = HttpLoggingInterceptor()

            logging.level = if(BuildConfig.DEBUG){HttpLoggingInterceptor.Level.BODY}else{
                HttpLoggingInterceptor.Level.BASIC}

            val authInterceptor = object: Interceptor {
                override fun intercept(chain: Interceptor.Chain): Response {
                    val original = chain.request()
                    val requestBuilder: Request.Builder = original.newBuilder()
                            .header("Content-Type", "application/json")
                    val request = requestBuilder.build()
                    return chain.proceed(request)
                }
            }

            val httpClient = OkHttpClient.Builder()
            httpClient.addInterceptor(logging)
            httpClient.addInterceptor(authInterceptor)

            return Retrofit.Builder()
                    .baseUrl("http://www.mocky.io/v2/")
                    .client(httpClient.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
        }
}