package com.example.a06_exercicio1_extras_2activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_exercicio1_extras_2activities.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonGravar.setOnClickListener {

            val nome = binding.editNome.text.toString()
            val morada = binding.editMorada.text.toString()
            val telefone = binding.editTelefone.text.toString()
            val email = binding.editEmail.text.toString()
            val genero = binding.editGenero.text.toString()

            val i: Intent = Intent(this, MainActivity2::class.java)

            i.putExtra("nome",nome)
            i.putExtra("morada",morada)
            i.putExtra("telefone",telefone)
            i.putExtra("email",email)
            i.putExtra("genero",genero)

            startActivity(i)


        }
    }
}