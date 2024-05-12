package com.boxtime.praveen.Modules

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.boxtime.praveen.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class leader_board : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leader_board)

        val bottomNavigation : BottomNavigationView = findViewById(R.id.bottomNavigation)
        bottomNavigation.selectedItemId = R.id.lead

        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val intent = Intent(this, home::class.java)
                    startActivity(intent)
                    true
                }
                R.id.note -> {
                    val intent = Intent(this, note::class.java)
                    startActivity(intent)
                    true
                }
                R.id.lead -> {
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