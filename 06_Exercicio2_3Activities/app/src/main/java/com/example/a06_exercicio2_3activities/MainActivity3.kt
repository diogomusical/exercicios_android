package com.example.a06_exercicio2_3activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_exercicio2_3activities.databinding.ActivityMain3Binding
import kotlin.math.roundToInt

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent

        val numero_a = i.extras!!.getDouble("numero_a")
        val numero_b = i.extras!!.getDouble("numero_b")

        binding.textSoma.text = "${numero_a} + ${numero_b} = ${(numero_a + numero_b)}"
        binding.textDiferenca.text = "${numero_a} - ${numero_b} = ${(numero_a - numero_b)}"
        binding.textMultiplicacao.text = "${numero_a} x ${numero_b} = ${((numero_a * numero_b)*100).roundToInt().toDouble()/100}"
        binding.textDivisaoInteira.text = "${numero_a} / ${numero_b} = ${(numero_a / numero_b).toInt()}"



    }
}