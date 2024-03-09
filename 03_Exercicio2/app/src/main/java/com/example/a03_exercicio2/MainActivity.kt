package com.example.a03_exercicio2

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.a03_exercicio2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDizerOla.setOnClickListener {
            var nome: String = binding.editNome.text.toString()
            var apelido: String = binding.editApelido.text.toString()

            if(nome!=""){
                Toast.makeText(applicationContext, "Olá ${nome} ${apelido}", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(applicationContext, "Introduza o nome", Toast.LENGTH_SHORT).show()
            }
        }

    }
}