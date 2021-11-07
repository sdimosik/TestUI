package com.sdimosikvip.testui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sdimosikvip.testui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        with(binding) {
            setContentView(root)

            activityMainPurpleBtn.setOnClickListener {
                binding.activityMainText.setBackgroundColor(resources.getColor(R.color.purple_200));
            }

            activityMainWhiteBtn.setOnClickListener {
                binding.activityMainText.setBackgroundColor(resources.getColor(R.color.white));
            }
        }
    }
}