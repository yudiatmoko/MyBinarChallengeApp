package com.jaws.mybinarchallengeapp.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.flexbox.FlexDirection
import com.google.android.flexbox.FlexboxLayoutManager
import com.google.android.flexbox.JustifyContent
import com.jaws.mybinarchallengeapp.R
import com.jaws.mybinarchallengeapp.adapter.RecyclerViewAdapterCategory
import com.jaws.mybinarchallengeapp.adapter.RecyclerViewAdapterMenu
import com.jaws.mybinarchallengeapp.databinding.ActivityMainBinding
import com.jaws.mybinarchallengeapp.model.Category
import com.jaws.mybinarchallengeapp.model.Menu


class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}