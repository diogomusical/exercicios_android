package com.example.a06_exercicio3_aplicacao_de_registo_login_sobre

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_exercicio3_aplicacao_de_registo_login_sobre.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent

        val username = i.extras?.getString("username")
        val password = i.extras?.getString("password")


        binding.buttonLogin.setOnClickListener {

            val usernameIntroduzida: String = binding.editUsername.text.toString()
            val passwordIntroduzida: String = binding.editPassword.text.toString()

            if(usernameIntroduzida == username && passwordIntroduzida == password){
                val i: Intent = Intent(this, SobreActivity::class.java)
                startActivity(i)
            } else {
                Toast.makeText(applicationContext, "Password Errada", Toast.LENGTH_SHORT).show()
            }

        }



    }
}