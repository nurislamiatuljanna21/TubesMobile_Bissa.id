package com.example.bissaid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class PesananCuker : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesanan_cuker)
        button = findViewById(R.id.button_login)
        button.setOnClickListener {
            Toast.makeText(this, "Pesanan On Proses", Toast.LENGTH_SHORT).show()
        }
    }
}