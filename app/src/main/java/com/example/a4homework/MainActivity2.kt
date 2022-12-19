package com.example.a4homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val username = findViewById<EditText>(R.id.username)
        val pass = findViewById<EditText>(R.id.password)

        findViewById<EditText>(R.id.nextpg1).setOnClickListener {
            val username = username.text.toString()
            val pass = pass.text.toString()
            if (username == "") {
                Toast.makeText(this, "Please, enter your username", Toast.LENGTH_SHORT).show()
            }else if (pass == "") {
                Toast.makeText(this, "Please, create your password", Toast.LENGTH_SHORT).show()
            }else {
                findViewById<TextView>(R.id.nextpg1).setOnClickListener {
                    val intent = Intent(this, MainActivity3::class.java)
                    intent.putExtra("USERNAME", username)
                    startActivity(intent)
                }
            }
        }
    }
}