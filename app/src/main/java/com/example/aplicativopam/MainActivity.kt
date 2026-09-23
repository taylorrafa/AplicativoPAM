package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.aplicativopam.R


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

     setContentView(R.layout.exercicio_nota)
        val botaoexec1 = findViewById<Button>(R.id.btnExec1)
        val edtExec1 = findViewById<EditText>(R.id.edtexec1)
        val txtexec1 = findViewById<TextView>(R.id.txtexec1)

        botaoexec1.setOnClickListener {
            var numero = edtExec1.text.toString().toInt() * 2
            txtexec1.text = numero.toString()
        }


    }}