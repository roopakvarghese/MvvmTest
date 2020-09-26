package com.roopak.whiterabbittest

import android.app.Application
import com.roopak.whiterabbittest.api.whiteRabbitApiClient
import com.roopak.whiterabbittest.view.home.WhiteRabbitRepo
import com.roopak.whiterabbittest.view.home.WhiteViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initRetrofit()
        startKoin{
            modules(
                    module {
                        viewModel { WhiteViewModel(get()) }
                    },
                    module {
                        single {
                            whiteRabbitApiClient.getClient
                        }
                        single {
                            WhiteRabbitRepo(get())
                        }

                    }
            )
        }
    }

}

private fun initRetrofit(){

}

private fun initViewModel(){

}