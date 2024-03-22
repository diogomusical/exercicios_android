package com.example.a06_exercicio4_pedido_restaurante

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_exercicio4_pedido_restaurante.databinding.ActivitySplashScreenPedidoBinding

class SplashScreenPedidoActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenPedidoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenPedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}