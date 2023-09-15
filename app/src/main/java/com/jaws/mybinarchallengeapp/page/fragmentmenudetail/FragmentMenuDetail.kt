package com.jaws.mybinarchallengeapp.page.fragmentmenudetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jaws.mybinarchallengeapp.R
import com.jaws.mybinarchallengeapp.databinding.FragmentMenuDetailBinding

class FragmentMenuDetail : Fragment() {

    private lateinit var binding: FragmentMenuDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMenuDetailBinding.inflate(inflater, container, false)
        return binding.root
    }
}