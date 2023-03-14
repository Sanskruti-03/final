package com.example.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonMainActivity: Button = findViewById(R.id.button)
        buttonMainActivity.setOnClickListener {
            val mainActivityIntent = Intent(applicationContext, select_test::class.java)
            startActivity(mainActivityIntent)
        }
    }
}