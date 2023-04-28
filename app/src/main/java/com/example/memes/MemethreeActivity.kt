package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemethreeActivity : AppCompatActivity() {
    lateinit var btn4: Button
    lateinit var btn5: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memethree)
        btn4 = findViewById(R.id.btn4)
        btn4.setOnClickListener {
            val intent = Intent(this, MemefourActivity::class.java)
            startActivity(intent)
        }
        btn5 = findViewById(R.id.btn5)
        btn5.setOnClickListener {
            val intent = Intent(this, MemeTwoActiivity::class.java)
            startActivity(intent)

        }


    }
}