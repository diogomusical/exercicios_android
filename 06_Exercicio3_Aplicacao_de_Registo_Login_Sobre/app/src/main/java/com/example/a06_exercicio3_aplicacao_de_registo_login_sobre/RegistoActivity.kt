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

        val i = intent

        binding.editUsername.setText(i.getStringExtra("username"))
        binding.editPassword.setText(i.getStringExtra("password"))

        binding.buttonRegisto.setOnClickListener {
            i.putExtra("username", binding.editUsername.text.toString())
            i.putExtra("password", binding.editPassword.text.toString())
            setResult(1,i)
            finish()
        }
    }
}