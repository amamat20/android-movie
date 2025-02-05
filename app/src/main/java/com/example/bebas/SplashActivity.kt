package com.example.bebas

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.postDelayed

class SplashActivity : AppCompatActivity() {

    private val delayScreen1: Long = 2000 // 2 detik
    private val delayScreen2: Long = 2000 // 2 detik
    private val delayScreen3: Long = 2000 // 2 detik

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.splash_screen1)


        Handler().postDelayed({
            setContentView(R.layout.splash_screen2)
        }, delayScreen1)

        Handler().postDelayed({
            setContentView(R.layout.splash_screen3)
        }, delayScreen1 + delayScreen2)

        Handler().postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, delayScreen1 + delayScreen2 + delayScreen3)


    }
}