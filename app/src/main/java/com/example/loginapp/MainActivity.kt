package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.name)
        val surName = findViewById<EditText>(R.id.surName)
        val password = findViewById<EditText>(R.id.password)
        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            if (name.text.toString() == "xd"
                && surName.text.toString() == "xd"
            ) {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            } else if (name.text.isNullOrBlank()
                && surName.text.isNullOrBlank()
                && password.text.isNullOrBlank()) {
                val intent = Intent(this, RegisterActivity::class.java)
                startActivity(intent)
            }
        }
    }
}