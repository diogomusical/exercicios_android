package com.example.a06_exercicio3_aplicacao_de_registo_login_sobre

import android.content.Intent
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_exercicio3_aplicacao_de_registo_login_sobre.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var result: ActivityResultLauncher<Intent>
    private var username = ""
    private var password = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonRegisto.setOnClickListener {
            val i: Intent = Intent(this, RegistoActivity::class.java)
            i.putExtra("username", username)
            i.putExtra("password", password)
            result.launch(i)
        }

        result = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            if(it.data != null && it.resultCode == 1){
                username = it.data?.getStringExtra("username").toString()
                password = it.data?.getStringExtra("password").toString()
            }

       }

        binding.buttonLogin.setOnClickListener {
            val i: Intent = Intent(this, LoginActivity::class.java)
            startActivity(i)
        }

        binding.buttonSobre.setOnClickListener {
            val i: Intent = Intent(this, SobreActivity::class.java)
            startActivity(i)
        }
    }
}