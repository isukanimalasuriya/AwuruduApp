package com.example.awuruduapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OnboardScreenThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard_screen_three)

        val backScreen: Button = findViewById(R.id.btnBack)
        val nextScreen: Button = findViewById(R.id.btnNext)

        backScreen.setOnClickListener{
            val intent = Intent(this, OnboardScreenTwo::class.java)
            startActivity(intent)
            finish()
        }

        nextScreen.setOnClickListener{
            val intent = Intent(this, OnboardScreenOne::class.java)
            startActivity(intent)
            finish()
        }
    }
}