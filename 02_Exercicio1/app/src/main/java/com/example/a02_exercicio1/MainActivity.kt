package com.example.a02_exercicio1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a02_exercicio1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            val euros: Double = binding.editValoresEuros.text.toString().toDouble()
            val dolares: Double = euros*1.09
            binding.textValorDolares.text =  dolares.toString()
        }

    }
}