package com.example.a05_activity_mais_splashscreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a05_activity_mais_splashscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}