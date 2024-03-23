package com.example.a06_exercicio4_pedido_restaurante

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_exercicio4_pedido_restaurante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPedido.setOnClickListener {

            val entradas = binding.checkboxEntradas.isActivated
            val prato_carne = binding.checkboxPratoCarne.isActivated
            val prato_peixe = binding.checkboxPratoPeixe.isActivated
            val prato_vegetariano = binding.checkboxPratoVegetariano.isActivated
            val vinho = binding.checkboxVinho.isActivated
            val refrigerante = binding.checkboxRefrigerante.isActivated
            val agua = binding.checkboxAgua.isActivated
            val sobremesa = binding.checkboxSobremesa.isActivated
            val cafe = binding.checkboxCafe.isActivated

            val i: Intent = Intent(this, SplashScreenPedidoActivity::class.java)
            i.putExtra("entradas",entradas)
            i.putExtra("prato_carne", prato_carne)
            i.putExtra("prato_peixe", prato_peixe)
            i.putExtra("prato_vegetariano", prato_vegetariano)
            i.putExtra("vinho", vinho)
            i.putExtra("refrigerante", refrigerante)
            i.putExtra("agua", agua)
            i.putExtra("sobremesa", sobremesa)
            i.putExtra("cafe", cafe)
            startActivity(i)
        }
    }
}