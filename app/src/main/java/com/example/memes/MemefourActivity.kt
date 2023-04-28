package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemefourActivity : AppCompatActivity() {
    lateinit var btn21: Button
    lateinit var btn22: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memefour)
        btn21 = findViewById(R.id.btn21)
        btn21.setOnClickListener {
            val intent = Intent(this,MemethreeActivity ::class.java)
            startActivity(intent)
        }

        btn22 = findViewById(R.id.btn22)
        btn22.setOnClickListener {
            val intent = Intent(this, MemefiveActivity::class.java)
            startActivity(intent)
        }
    }
}