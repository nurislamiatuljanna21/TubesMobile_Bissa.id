package com.example.bissaid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LayananSetrikaActivity : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layanan_setrika)

        button = findViewById(R.id.button_next)
        button.setOnClickListener {
            startActivity(Intent(this, PesananSetrika::class.java))
        }
    }
}