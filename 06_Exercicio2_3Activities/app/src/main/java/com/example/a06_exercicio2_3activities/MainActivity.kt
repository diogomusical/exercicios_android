package com.example.a06_exercicio2_3activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_exercicio2_3activities.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonContinuar1.setOnClickListener {
            val numero_a = binding.editNumeroA.text.toString().toDouble()
            val i: Intent = Intent(this, MainActivity2::class.java)
            i.putExtra("numero_a",numero_a)
            startActivity(i)
        }
    }
}