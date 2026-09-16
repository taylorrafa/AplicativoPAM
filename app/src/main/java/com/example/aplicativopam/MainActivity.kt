package com.example.aplicativopam

import android.R.attr.button
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aulaid)

        val botao = findViewById<Button>(R.id.btnproxima)
        val texto = findViewById<EditText>(R.id.editValor)

        botao.text = "novo texto"

        botao.setOnClickListener {
            botao.text = texto.text

        }




    }
}