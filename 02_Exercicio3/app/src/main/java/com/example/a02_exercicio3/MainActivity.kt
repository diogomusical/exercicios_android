package com.example.a02_exercicio3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a02_exercicio3.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConversor.setOnClickListener {
            val celsius: Double = binding.editCelsius.text.toString().toDouble()
            val fahreneit: Double = ((celsius*1.8)+32).roundToInt().toDouble()/100
            binding.textFahreneit.text = fahreneit.toString() + " F"
        }

    }
}