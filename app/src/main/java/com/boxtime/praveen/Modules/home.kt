package com.boxtime.praveen.Modules

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.TextView
import com.boxtime.praveen.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val bottomNavigation : BottomNavigationView = findViewById(R.id.bottomNavigation)

        bottomNavigation.selectedItemId = R.id.home

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

        val btnNavigate: RelativeLayout = findViewById(R.id.assignment_01)
        btnNavigate.setOnClickListener {
            val intent = Intent(this,submition::class.java)
            startActivity(intent)

        }
    }
}