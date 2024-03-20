package com.example.a06_exercicio3_aplicacao_de_registo_login_sobre

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_exercicio3_aplicacao_de_registo_login_sobre.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonRegisto.setOnClickListener {
            val i: Intent = Intent(this, RegistoActivity::class.java)
            startActivity(i)
        }

        binding.buttonLogin.setOnClickListener {
            val i: Intent = Intent(this, LoginActivity::class.java)
            startActivity(i)
        }

        binding.buttonSobre.setOnClickListener {
            val i: Intent = Intent(this, SobreActivity::class.java)
            startActivity(i)
        }
    }
}