package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.apprevisao.db.DBHelper

class Resposta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resposta)

        val edtNome: TextView = findViewById(R.id.edtNome)
        val edtEndereco: TextView = findViewById(R.id.edtEndereco)
        val edtBairro: TextView = findViewById(R.id.edtBairro)
        val edtCep: TextView = findViewById(R.id.edtCep)

        val bntConfirmar: Button = findViewById(R.id.bntConfirmar)

        edtNome.setText(intent.getStringExtra("nome"))
        edtEndereco.setText(intent.getStringExtra("endereco"))
        edtBairro.setText(intent.getStringExtra("bairro"))
        edtCep.setText(intent.getStringExtra("cep"))

        val db = DBHelper(this, null)

         bntConfirmar.setOnClickListener {
            db.addPessoa(edtNome.text.toString(), edtEndereco.text.toString(), edtBairro.text.toString(), edtCep.text.toString())
            finish()
        }
    }
}