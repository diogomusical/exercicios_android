package com.example.a06_exercicio3_aplicacao_de_registo_login_sobre

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_exercicio3_aplicacao_de_registo_login_sobre.databinding.ActivityRegistoBinding

class RegistoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistoBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}