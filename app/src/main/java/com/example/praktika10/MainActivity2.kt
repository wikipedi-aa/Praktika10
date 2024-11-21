package com.example.praktika10

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
    }
        fun goTo3(view: View){
            val intent : Intent = Intent(this@MainActivity2, MainActivity3::class.java)
            startActivity(intent)
        }

        fun backTo1 (view: View){
            val intent : Intent = Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(intent)
        }
    fun giveOrientationAndGravity(view: View){
        val textViewOrient : TextView = findViewById(R.id.textView2)
        val textViewGravity : TextView = findViewById(R.id.textView4)
        val button1 : Button = findViewById(R.id.button1)
        val button2 : Button = findViewById(R.id.button2)
        val button3 : Button = findViewById(R.id.button3)
        val button4 : Button = findViewById(R.id.button4)
        val button5 : Button = findViewById(R.id.button5)
        val button6 : Button = findViewById(R.id.button6)

        when(view.id) {
            R.id.button1 -> {
                textViewOrient.text = "Вертикальная"
            }

            R.id.button2 -> {
                textViewGravity.text = "По левой границе"
            }

            R.id.button3 -> {
                textViewOrient.text = "Горизонтальная"
            }

            R.id.button4 -> {
                textViewGravity.text = "По центру"
            }

            R.id.button5 -> {
                textViewOrient.text = "Вертикальная"
            }

            R.id.button6 -> {
                textViewGravity.text = "По правой границе"
            }
        }

    }

}