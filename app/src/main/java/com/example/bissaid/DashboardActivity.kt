package com.example.bissaid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DashboardActivity : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        button = findViewById(R.id.button_bissa)
        button.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}