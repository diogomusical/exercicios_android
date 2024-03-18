package com.example.a06_primeiro_exemplo_com_extras_2activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_primeiro_exemplo_com_extras_2activities.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent

        val nome = i.extras?.getString("nome")

        binding.textNome.text = "Olá ${nome}"
    }
}