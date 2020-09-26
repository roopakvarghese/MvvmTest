package com.roopak.whiterabbittest.utils

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.roopak.whiterabbittest.adapter.ProfileAdapter
import com.roopak.whiterabbittest.models.RvCompanyProfile
import com.roopak.whiterabbittest.view.utils.CustomDecorator


@BindingAdapter("setAdapter")
fun setAdapter(rv : RecyclerView, adapter : RecyclerView.Adapter<*>){
    rv.adapter = adapter
}

@BindingAdapter("setData")
fun setData(rv : RecyclerView, data : List<RvCompanyProfile>?){
    val adapter = rv.adapter
    if(adapter is ProfileAdapter){
        adapter.setProfileData(data)
    }
}

@BindingAdapter("setDecorator")
fun setDecorator(rv: RecyclerView, decorator: CustomDecorator){
    rv.addItemDecoration(decorator)
}
