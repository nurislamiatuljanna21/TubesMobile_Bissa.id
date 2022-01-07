package com.example.bissaid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.Button

class HomeActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        button4 = findViewById(R.id.setrika)
        button3 = findViewById(R.id.cuset)
        button2 = findViewById(R.id.culit)
        button = findViewById(R.id.cuker)

        button4.setOnClickListener {
            startActivity(Intent(this, LayananSetrikaActivity::class.java))
        }
        button3.setOnClickListener {
            startActivity(Intent(this, LayananCusetActivity2::class.java))
        }
        button.setOnClickListener {
            startActivity(Intent(this, LayananCukerActivity::class.java))
        }
        button2.setOnClickListener {
            startActivity(Intent(this, LayananCulitActivity::class.java))
        }
    }
}