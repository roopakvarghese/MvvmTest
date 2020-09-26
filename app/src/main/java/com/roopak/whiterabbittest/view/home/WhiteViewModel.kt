package com.roopak.whiterabbittest.view.home

import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableField
import androidx.databinding.ObservableList
import androidx.lifecycle.viewModelScope
import com.roopak.whiterabbittest.models.RvCompanyProfile
import com.roopak.whiterabbittest.view.BaseViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class WhiteViewModel(private val repo: WhiteRabbitRepo)  : BaseViewModel() {
    var rvShopViewModel: ObservableList<RvCompanyProfile>? = ObservableArrayList()

    fun callApi(){
        rvShopViewModel?.clear()
        viewModelScope.launch(Dispatchers.IO+handler) {
            val response = repo.getDataFromCloud()
            response?.let { apiResponse ->
                val name = apiResponse.name
               /* query.forEach{
                    val shop = RvCompanyProfile(profileImage = ObservableField(it.title)
                        , name = ObservableField(it.title)
                        ,comapnyName = ObservableField(it.pageid.toString())
                    )
                   // rvShopViewModel?.add(shop)
                }*/

            }

        }
    }

    private val handler = CoroutineExceptionHandler { _, exception ->
        println("CoroutineExceptionHandler got $exception")
    }
}