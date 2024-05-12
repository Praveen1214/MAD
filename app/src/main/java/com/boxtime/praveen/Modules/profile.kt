package com.boxtime.praveen.Modules

import android.content.Intent
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.boxtime.praveen.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val bottomNavigation : BottomNavigationView = findViewById(R.id.bottomNavigation)
        bottomNavigation.selectedItemId = R.id.profile

        val btnNavigate2: RelativeLayout = findViewById(R.id.component_5)
        btnNavigate2.setOnClickListener {
            val intent = Intent(this, sign_in::class.java)
            startActivity(intent)

            val toast = Toast.makeText(applicationContext, "Hello ", Toast.LENGTH_SHORT)
            toast.setMargin(50f, 0f)
            toast.show()

        }


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
                    val intent = Intent(this, leader_board::class.java)
                    startActivity(intent)
                    true
                }
                R.id.profile -> {
                    true
                }
                else -> false
            }
        }
    }
}