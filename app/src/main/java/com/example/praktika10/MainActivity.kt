package com.example.praktika10

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        setTitle("LinearLayout")
    }

    fun goTo2 (view : View){
        val intent : Intent = Intent(this@MainActivity, MainActivity2::class.java )
        startActivity(intent)
    }

    
        fun clickBt1(view: View) {

            val bt1: Button = findViewById(R.id.button1)
            val bt2: Button = findViewById(R.id.button2)

            when (view.id) {
                R.id.button1 -> {
                    bt1.visibility = View.GONE
                    bt2.visibility = View.VISIBLE
                }

                R.id.button2 -> {
                    bt2.visibility = View.GONE
                    bt1.visibility = View.VISIBLE
                }

            }
        }


}