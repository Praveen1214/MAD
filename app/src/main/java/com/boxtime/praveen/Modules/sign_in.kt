package com.boxtime.praveen.Modules

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.TextView
import com.boxtime.praveen.R

class sign_in : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val btnNavigate: TextView = findViewById(R.id.textViewSignUp)
        btnNavigate.setOnClickListener {
            val intent = Intent(this,sign_up::class.java)
            startActivity(intent)

        }
        val btnNavigate2: RelativeLayout = findViewById(R.id.nextbtn4)
        btnNavigate2.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
    }
}