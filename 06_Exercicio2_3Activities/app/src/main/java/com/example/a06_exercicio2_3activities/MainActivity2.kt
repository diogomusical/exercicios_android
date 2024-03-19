package com.example.a06_exercicio2_3activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_exercicio2_3activities.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent

        val numero_a = i.extras!! .getDouble("numero_a")

        binding.buttonContinuar2.setOnClickListener {
            val numero_b = binding.editNumeroB.text.toString().toDouble()
            val i: Intent = Intent(this, MainActivity3::class.java)

            i.putExtra("numero_a", numero_a)
            i.putExtra("numero_b", numero_b)

            startActivity(i)
        }

    }
}