package com.example.a06_exercicio4_pedido_restaurante

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_exercicio4_pedido_restaurante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPedido.setOnClickListener {
            val entradas = binding.checkboxEntradas.isChecked
            val prato_carne = binding.checkboxPratoCarne.isChecked
            val prato_peixe = binding.checkboxPratoPeixe.isChecked
            val prato_vegetariano = binding.checkboxPratoVegetariano.isChecked
            val vinho = binding.checkboxVinho.isChecked
            val refrigerante = binding.checkboxRefrigerante.isChecked
            val agua = binding.checkboxAgua.isChecked
            val sobremesa = binding.checkboxSobremesa.isChecked
            val cafe = binding.checkboxCafe.isChecked

            val qtd_entradas = binding.editQtdEntradas.text.toString().toInt()
           // val qtd_prato_carne = binding.editQtdPratoCarne.text.toString().toInt()


            Toast.makeText(applicationContext, "${qtd_entradas}", Toast.LENGTH_SHORT).show()

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