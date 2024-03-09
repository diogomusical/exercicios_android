package com.example.a03_exercicio1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a03_exercicio1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDizerOla.setOnClickListener {
            var nome: String = binding.editNome.text.toString()
            var apelido: String = binding.editApelido.text.toString()
            if (nome != "") {
                binding.textOlaNome.text = "Olá, " + nome + " " + apelido
            } else {
                binding.textOlaNome.text = "Nome não inserido"
            }
        }


    }
}