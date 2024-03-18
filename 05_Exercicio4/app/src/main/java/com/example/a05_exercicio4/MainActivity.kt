package com.example.a05_exercicio4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a05_exercicio4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonVerificador.setOnClickListener {
            val numero: Int = binding.editNumero.text.toString().toInt()

            if(numero%2 == 0){
                binding.textValorParImpar.text = "O ${numero} é par."
            }else{
                binding.textValorParImpar.text = "O ${numero} é ímpar."
            }

            var counting: Int = 0

            for (i in 2..<numero){
                if(numero % i == 0) {
                    counting++
                }
            }

            if(counting==0){
                binding.textValorPrimo.text = "O ${numero} é um número primo."
            }else{
                binding.textValorPrimo.text = "O ${numero} não é um número primffo."
            }
        }
    }
}