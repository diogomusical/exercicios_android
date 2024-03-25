package com.example.a06_exercicio4_pedido_restaurante

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_exercicio4_pedido_restaurante.databinding.ActivitySplashScreenPedidoBinding

class SplashScreenPedidoActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenPedidoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenPedidoBinding.inflate(layoutInflater)
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


        Handler(Looper.getMainLooper()).postDelayed({
            val i: Intent = Intent(this, PedidoActivity::class.java)
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
            finish()
        },4000)
    }
}