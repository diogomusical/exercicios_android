package com.example.a05_exercicio3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a05_exercicio3.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonReal.setOnClickListener {
            val euros: Double = binding.editValoresEuros.text.toString().toDouble()
            val reais: Double = (euros*4.40*100).roundToInt().toDouble()/100
            binding.textFinal.text = reais.toString()
        }

        binding.buttonDollar.setOnClickListener {
            val euros: Double = binding.editValoresEuros.text.toString().toDouble()
            val dollares: Double = (euros*1.20*100).roundToInt().toDouble()/100
            binding.textFinal.text = dollares.toString()
        }

        binding.buttonPeso.setOnClickListener {
            val euros: Double = binding.editValoresEuros.text.toString().toDouble()
            val pesos: Double = (euros*31.5*100).roundToInt().toDouble()/100
            binding.textFinal.text = pesos.toString()
        }
    }
}