package com.example.bissaid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LayananCusetActivity2 : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layanan_cuset2)
        button = findViewById(R.id.button_next)
        button.setOnClickListener {
            startActivity(Intent(this, PesananCuset::class.java))
        }
    }
}