package com.example.a05_exercicio5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a05_exercicio5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConversor.setOnClickListener {
            val total_horas: Double = binding.editHoras.text.toString().toDouble()
            val semanas: Int = (total_horas/(7*24)).toInt()
            val dias: Int = ((total_horas - (semanas*7*24) ) / 24).toInt()
            val horas: Int = (total_horas - (semanas*7*24) - dias*24).toInt()

            binding.textSemanas.text = "Semanas: " + semanas.toString()
            binding.textDias.text = "Dias: " + dias.toString()
            binding.textHoras.text = "Horas: " + horas.toString()
        }
    }
}