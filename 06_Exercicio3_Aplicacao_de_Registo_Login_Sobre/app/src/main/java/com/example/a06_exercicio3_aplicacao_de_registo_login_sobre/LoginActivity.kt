package com.example.a06_exercicio3_aplicacao_de_registo_login_sobre

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_exercicio3_aplicacao_de_registo_login_sobre.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}