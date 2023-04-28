package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemeTwoActiivity : AppCompatActivity() {
    lateinit var btn3: Button
    lateinit var bttn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_two)
        btn3 = findViewById(R.id.btn3)
        btn3.setOnClickListener {
            val intent = Intent(this, MemethreeActivity::class.java)
            startActivity(intent)
        }
        bttn = findViewById(R.id.bttn)
        bttn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}