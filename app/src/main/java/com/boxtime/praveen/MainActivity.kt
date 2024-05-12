package com.boxtime.praveen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.boxtime.praveen.Modules.welcome_sceen_01

class MainActivity : AppCompatActivity() {


    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        handler.postDelayed({
            startActivity(Intent(this, welcome_sceen_01::class.java))
            finish()
        }, 2500L)
    }
}

