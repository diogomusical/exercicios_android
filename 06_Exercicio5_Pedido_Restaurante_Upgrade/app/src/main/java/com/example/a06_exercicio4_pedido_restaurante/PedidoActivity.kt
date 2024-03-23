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

        val i = intent

        val entradas = i.extras?.getBoolean("entradas")
        val prato_carne = i.extras?.getBoolean("prato_carne")
        val prato_peixe = i.extras?.getBoolean("prato_peixe")
        val prato_vegetariano = i.extras?.getBoolean("prato_vegetariano")
        val vinho = i.extras?.getBoolean("vinho")
        val refrigerante = i.extras?.getBoolean("refrigerante")
        val agua = i.extras?.getBoolean("agua")
        val sobremesa = i.extras?.getBoolean("sobremesa")
        val cafe = i.extras?.getBoolean("cafe")

        var message = ""
        if(entradas == true)  message += "\n 1 entrada"
        if(prato_carne == true)  message += "\n 1 prato de carne"
        if(prato_peixe == true)  message += "\n 1 prato de peixe"
        if(prato_vegetariano == true)  message += "\n 1 prato vegetariano"
        if(vinho == true)  message += "\n 1 garrafa de vinho"
        if(refrigerante == true)  message += "\n 1 garrafa de refrigerante"
        if(agua == true)  message += "\n 1 garrafa de água"
        if(sobremesa == true)  message += "\n 1 sobremesa"
        if(cafe == true)  message += "\n 1 café"

        binding.textPedido.text = message
    }
}