package com.example.a06_exercicio4_pedido_restaurante

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_exercicio4_pedido_restaurante.databinding.ActivityPedidoBinding

class PedidoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPedidoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}