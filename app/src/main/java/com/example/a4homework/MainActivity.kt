package com.example.a4homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mail = findViewById<EditText>(R.id.email)
        val numb = findViewById<EditText>(R.id.number)

        findViewById<TextView>(R.id.nextpg).setOnClickListener {
            val mail = mail.text.toString()
            val numb = numb.text.toString()
            if (mail == "") {
                Toast.makeText(this, "Please, enter your email", Toast.LENGTH_SHORT).show()
            } else if (numb == "") {
                Toast.makeText(this, "Please, enter your number.", Toast.LENGTH_SHORT).show()
            } else if (mail == "" && numb == "") {
                Toast.makeText(this, "Please, enter your mail and number", Toast.LENGTH_LONG).show()
            } else {
                findViewById<TextView>(R.id.nextpg).setOnClickListener {
                    val intent = Intent(this, MainActivity2::class.java)
                    startActivity(intent)

                }
            }
        }
    }
}