package com.example.a06_exercicio4_pedido_restaurante

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_exercicio4_pedido_restaurante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}