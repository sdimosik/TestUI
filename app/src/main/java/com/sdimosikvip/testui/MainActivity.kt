package com.sdimosikvip.testui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sdimosikvip.testui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupListener()
    }

    private fun setupListener() {
        with(binding) {

            activityMainPurpleBtn.setOnClickListener {
                binding.activityMainText.setBackgroundColor(resources.getColor(R.color.purple_200));
            }

            activityMainWhiteBtn.setOnClickListener {
                binding.activityMainText.setBackgroundColor(resources.getColor(R.color.white));
            }
        }
    }
}
