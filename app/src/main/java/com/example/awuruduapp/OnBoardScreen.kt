package com.example.awuruduapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OnBoardScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_on_board_screen)

        val goHomeButton: Button = findViewById(R.id.button2)

        // Set an OnClickListener on the button
        goHomeButton.setOnClickListener {
            // Start the HomeScreenActivity
            val intent = Intent(this, OnboardScreenTwo::class.java)
            startActivity(intent)
            finish()  // Optional: Close the current activity (OnBoardScreen)
        }
    }
}