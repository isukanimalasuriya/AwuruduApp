package com.example.awuruduapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OnboardScreenOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard_screen_one)

        val backScreen: Button = findViewById(R.id.btnBack)
        val nextScreen: Button = findViewById(R.id.btnNext)

        backScreen.setOnClickListener{
            val intent = Intent(this, OnboardScreenThree::class.java)
            startActivity(intent)
            finish()
        }

        // Set an OnClickListener on the button
        nextScreen.setOnClickListener {
            // Start the HomeScreenActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()  // Optional: Close the current activity (OnBoardScreen)
        }
    }
}