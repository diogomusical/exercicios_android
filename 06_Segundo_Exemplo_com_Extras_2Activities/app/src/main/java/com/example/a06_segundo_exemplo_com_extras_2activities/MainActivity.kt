package com.example.a06_segundo_exemplo_com_extras_2activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_segundo_exemplo_com_extras_2activities.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var result: ActivityResultLauncher<Intent>
    private var nome = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonMudarNome.setOnClickListener {
            val i = Intent(this, MainActivity2::class.java)
            i.putExtra("nome",nome)
            result.launch(i)
        }

        result = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            if(it.data != null && it.resultCode == 1){
                nome = it.data?.getStringExtra("nome").toString()
                binding.textOlaNome.text = "Olá ${nome}"
            }
        }

    }
}