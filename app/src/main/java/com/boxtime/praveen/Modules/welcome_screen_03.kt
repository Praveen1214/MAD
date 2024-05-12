package com.boxtime.praveen.Modules

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.RelativeLayout
import android.widget.TextView
import com.boxtime.praveen.R

class welcome_screen_03 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen03)

        val btnNavigate: RelativeLayout = findViewById(R.id.ntxbtn3)
        btnNavigate.setOnClickListener {
            val intent = Intent(this,sign_in::class.java)
            startActivity(intent)
        }

        val btnNavigate2: TextView = findViewById(R.id.skip3)
        btnNavigate2.setOnClickListener {
            val intent = Intent(this, sign_in::class.java)
            startActivity(intent)
        }

    }
}