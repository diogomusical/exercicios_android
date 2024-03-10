package com.example.a04_exercicio4

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.a04_exercicio4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {
            var username: String = binding.editUsername.text.toString()
            var password: String = binding.editPassword.text.toString()

            if(username == "diogo" && password == "123"){
                Toast.makeText(applicationContext, "Login válido", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext, "Login inválido", Toast.LENGTH_SHORT).show()
            }
        }

    }
}