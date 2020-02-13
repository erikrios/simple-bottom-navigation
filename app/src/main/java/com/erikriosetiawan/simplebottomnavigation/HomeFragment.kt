package com.erikriosetiawan.simplebottomnavigation

import android.app.Activity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.erikriosetiawan.simplebottomnavigation.databinding.FragmentMenuBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentMenuBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = DataBindingUtil.setContentView(activity as Activity, view.id)
    }
}