package com.example.a04_exercicio3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a04_exercicio3.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonReal.setOnClickListener {
            var euro: Double = binding.editValorEuros.text.toString().toDouble()
            var real: Double = (euro*4.4*100).roundToInt().toDouble()/100

            binding.textConversao.text = real.toString()
        }

        binding.buttonDolar.setOnClickListener {
            var euro: Double = binding.editValorEuros.text.toString().toDouble()
            var dolar: Double = (euro*1.20*100).roundToInt().toDouble()/100

            binding.textConversao.text = dolar.toString()
        }

        binding.buttonPeso.setOnClickListener {
            var euro: Double = binding.editValorEuros.text.toString().toDouble()
            var peso: Double = (euro*31.5*100).roundToInt().toDouble()/100

            binding.textConversao.text = peso.toString()
        }

    }
}