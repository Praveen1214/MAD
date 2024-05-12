package com.boxtime.praveen.Modules

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.boxtime.praveen.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class submition : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submition)

        val bottomNavigation : BottomNavigationView = findViewById(R.id.bottomNavigation)

        val btnNavigate: ImageView = findViewById(R.id.backbtn)
        btnNavigate.setOnClickListener {
            val intent = Intent(this,home::class.java)
            startActivity(intent)

        }

        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    true
                }
                R.id.note -> {
                    val intent = Intent(this, note::class.java)
                    startActivity(intent)
                    true
                }
                R.id.lead -> {
                    val intent = Intent(this, leader_board::class.java)
                    startActivity(intent)
                    true
                }
                R.id.profile -> {
                    val intent = Intent(this, profile::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }
}