package com.example.a06_exercicio1_extras_2activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_exercicio1_extras_2activities.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent

        val nome = i.extras?.getString("nome")
        val morada = i.extras?.getString("morada")
        val telefone = i.extras?.getString("telefone")
        val email = i.extras?.getString("email")
        val genero = i.extras?.getString("genero")

        binding.textTextoCompleto.text = "O/A ${nome} mora na ${morada}, tem o telefone ${telefone} e o email ${email}"



    }
}