package com.example.awuruduapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OnboardScreenTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard_screen_two)

        val nextScreen: Button = findViewById(R.id.btnNext)
        val backScreen: Button = findViewById(R.id.btnBack)

        nextScreen.setOnClickListener{
            val intent = Intent(this, OnboardScreenThree::class.java)
            startActivity(intent)
            finish()
        }

        backScreen.setOnClickListener{
            val intent = Intent(this, OnBoardScreen::class.java)
            startActivity(intent)
            finish()
        }
    }
}