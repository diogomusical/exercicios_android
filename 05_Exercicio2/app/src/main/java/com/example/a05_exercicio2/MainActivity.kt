package com.example.a05_exercicio2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a05_exercicio2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {
            val username: String = binding.editUsername.text.toString()
            val password: String = binding.editPassword.text.toString()

            if(username == "user" && password == "pass"){
                val intent =  Intent(this,LoginOkActivity::class.java)
                startActivity(intent)
                finish()
            } else {
               val intent = Intent(this, LoginErradoActivity::class.java)
               startActivity(intent)
               finish()
            }
        }

    }
}