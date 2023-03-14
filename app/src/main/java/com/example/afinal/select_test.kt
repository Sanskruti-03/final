package com.example.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class select_test : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_test)

        val buttonMainActivity: Button = findViewById(R.id.button5)
        buttonMainActivity.setOnClickListener {
            val mainActivityIntent = Intent(applicationContext, camera::class.java)
            startActivity(mainActivityIntent)
        }

        val buttonMainActivity1: Button = findViewById(R.id.button6)
        buttonMainActivity1.setOnClickListener {
            val mainActivityIntent = Intent(applicationContext, camera::class.java)
            startActivity(mainActivityIntent)
        }

        val buttonMainActivity2: Button = findViewById(R.id.button7)
        buttonMainActivity2.setOnClickListener {
            val mainActivityIntent = Intent(applicationContext, camera::class.java)
            startActivity(mainActivityIntent)
        }

        val buttonMainActivity3: Button = findViewById(R.id.button8)
        buttonMainActivity3.setOnClickListener {
            val mainActivityIntent = Intent(applicationContext, camera::class.java)
            startActivity(mainActivityIntent)
        }

        val buttonMainActivity4: Button = findViewById(R.id.button9)
        buttonMainActivity4.setOnClickListener {
            val mainActivityIntent = Intent(applicationContext, camera::class.java)
            startActivity(mainActivityIntent)
        }

        val buttonMainActivity5: Button = findViewById(R.id.button10)
        buttonMainActivity5.setOnClickListener {
            val mainActivityIntent = Intent(applicationContext, camera::class.java)
            startActivity(mainActivityIntent)
        }
    }
}