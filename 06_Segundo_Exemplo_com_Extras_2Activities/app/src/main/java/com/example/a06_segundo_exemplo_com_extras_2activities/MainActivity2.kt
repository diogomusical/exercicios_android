package com.example.a06_segundo_exemplo_com_extras_2activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_segundo_exemplo_com_extras_2activities.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent

        binding.editNome.setText(i.getStringExtra("nome"))

        binding.buttonOk.setOnClickListener {
            i.putExtra("nome", binding.editNome.text.toString())
            setResult(1,i)
            finish()
        }

    }
}