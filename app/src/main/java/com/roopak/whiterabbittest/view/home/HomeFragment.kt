package com.roopak.whiterabbittest.view.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.roopak.whiterabbittest.R
import com.roopak.whiterabbittest.databinding.FragmentHomeBinding
import com.roopak.whiterabbittest.view.BaseFragment

class HomeFragment: BaseFragment()  {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentHomeBinding = DataBindingUtil.inflate(inflater
            , R.layout.fragment_home
            ,container
            ,false)

        return binding.root
    }
}