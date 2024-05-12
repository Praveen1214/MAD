package com.boxtime.praveen.Modules

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.boxtime.praveen.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class note : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)

        val bottomNavigation : BottomNavigationView = findViewById(R.id.bottomNavigation)
        bottomNavigation.selectedItemId = R.id.note


        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val intent = Intent(this, home::class.java)
                    startActivity(intent)
                    true
                }
                R.id.note -> {

                    true
                }
                R.id.lead -> {
                    val intent = Intent(this, leader_board::class.java)
                    startActivity(intent)
                    true
                }
                R.id.profile -> {

                    val intent = Intent(this, leader_board::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }
}