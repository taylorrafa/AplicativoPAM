package com.example.aplicativopam

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.exercicio_nota)
        /*

val botaoExec1 = findViewById<Button>(R.id.btnExec1)
val edtExec1 = findViewById<EditText>(R.id.edtExec1)

val txtExec1 = findViewById<TextView>(R.id.txtExec1)

botaoExec1.setOnClickListener {
    var numero = edtExec1.text.toString().toInt() * 2
    txtExec1.text = numero.toString()
}


}
*/
/*
        val botaoExec5 = findViewById<Button>(R.id.btnExec5)
        val edtNota1 = findViewById<EditText>(R.id.edtNota1)
        val edtNota2 = findViewById<EditText>(R.id.edtNota2)
        val txtExec5 = findViewById<TextView>(R.id.txtExec5)


        botaoExec5.setOnClickListener {
            val numero = (edtNota1.text.toString().toFloat() + edtNota2.text.toString().toFloat() ) / 2
            txtExec5.text = numero.toString()
        }

 */
        val botaoExec6 = findViewById<Button>(R.id.btnExec6)
        val edtIdade = findViewById<EditText>(R.id.edtIdade)
        val txtExec6 = findViewById<TextView>(R.id.txtExec6)

        botaoExec6.setOnClickListener {
            val numero = edtIdade.text.toString().toInt()
                    if ( numero < 12) {
                        txtExec6.text = "CRIANÇA"
                    } else if (numero > 12 and numero < 17) {
                        txtExec6.text = "ADOLESCENTE"
                    } else{
                        txtExec6.text = "ADULTO"
                    }



            }

    }
}

