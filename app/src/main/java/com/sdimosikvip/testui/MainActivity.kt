package com.sdimosikvip.testui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sdimosikvip.testui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.purpleBtn.setOnClickListener {
            binding.textView.setBackgroundColor(resources.getColor(R.color.purple_200));
        }

        binding.whiteBtn.setOnClickListener {
            binding.textView.setBackgroundColor(resources.getColor(R.color.white));
        }
    }
}