package com.mohammad.hasan.mahdavi.musix.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.mohammad.hasan.mahdavi.musix.R
import com.mohammad.hasan.mahdavi.musix.databinding.FragmentHomeBinding


class HomeFragment : Fragment(R.layout.fragment_home) {
    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHomeBinding.bind(view)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}