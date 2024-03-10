package com.example.a04_exercicio1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a04_exercicio1.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            var euros: Double = binding.editValorEuros.text.toString().toDouble()
            var dolares: Double = (euros*1.09*100).roundToInt().toDouble()/100

            binding.textValorDolares.text = "Dólares: ${dolares.toString()}$"
        }

    }
}