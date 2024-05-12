package com.boxtime.praveen.Modules

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.TextView
import com.boxtime.praveen.R

class sign_up : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btnNavigate: TextView = findViewById(R.id.textViewSignIn)
        btnNavigate.setOnClickListener {
            val intent = Intent(this,sign_in::class.java)
            startActivity(intent)

        }
        val btnNavigate2: RelativeLayout = findViewById(R.id.nextbtn5)
        btnNavigate2.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
    }
}