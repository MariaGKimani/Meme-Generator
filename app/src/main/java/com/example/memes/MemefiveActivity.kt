package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemefiveActivity : AppCompatActivity() {
    lateinit var btn11: Button
    lateinit var btn12: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memefive)
        btn11 = findViewById(R.id.btn11)
        btn12 = findViewById(R.id.btn12)
        btn11.setOnClickListener {
            val intent = Intent(this,MemefourActivity::class.java)
            startActivity(intent)
        }
        btn12.setOnClickListener {
            val intent = Intent(this, MemesixActivity::class.java)
            startActivity(intent)

        }

    }
}