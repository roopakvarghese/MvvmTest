package com.roopak.whiterabbittest.view.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.roopak.whiterabbittest.R
import com.roopak.whiterabbittest.adapter.ProfileAdapter
import com.roopak.whiterabbittest.databinding.FragmentHomeBinding
import com.roopak.whiterabbittest.view.BaseFragment
import com.roopak.whiterabbittest.view.utils.CustomDecorator
import org.koin.android.viewmodel.ext.android.viewModel

class HomeFragment: BaseFragment()  {
    val vm : WhiteViewModel by viewModel()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentHomeBinding = DataBindingUtil.inflate(inflater
            , R.layout.fragment_home
            ,container
            ,false)


        binding.clickHelper = this
        binding.vm = vm
        val adapter = ProfileAdapter()
        binding.adapter = adapter
        binding.decorator = CustomDecorator(10,0)

        vm.callApi()
        return binding.root
    }
}