package com.example.revisao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.apprevisao.R
import com.example.apprevisao.Resposta


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNome: TextView = findViewById(R.id.edtNome)
        val edtEndereco: TextView = findViewById(R.id.edtEndereco)
        val edtBairro: TextView = findViewById(R.id.edtBairro)
        val edtCep: TextView = findViewById(R.id.edtCep)
        val btnCadastrar: Button = findViewById(R.id.btnCadastrar)


        btnCadastrar.setOnClickListener {
            val intent = Intent(this, Resposta::class.java)
            intent.putExtra("nome",edtNome.text.toString())
            intent.putExtra("endereco",edtEndereco.text.toString())
            intent.putExtra("bairro",edtBairro.text.toString())
            intent.putExtra("cep",edtCep.text.toString())
            startActivity(intent)
        }
    }
}