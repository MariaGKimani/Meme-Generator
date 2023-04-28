package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemefiveActivity : AppCompatActivity() {
    lateinit var btn12: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memefive)
        btn12 = findViewById(R.id.btn12)
        btn12.setOnClickListener {
            val intent = Intent(this,MemefourActivity::class.java)
            startActivity(intent)
        }


    }
}