package com.boxtime.praveen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.boxtime.praveen.Modules.leader_board
import com.boxtime.praveen.Modules.note
import com.boxtime.praveen.Modules.profile
import com.boxtime.praveen.Modules.welcome_sceen_01
import com.google.android.material.bottomnavigation.BottomNavigationView

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

