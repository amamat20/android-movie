package com.example.bebas

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val constrainLayout = findViewById<ConstraintLayout>(R.id.mainLayout)
        val animationDrawable = constrainLayout.background as AnimationDrawable
        animationDrawable.setEnterFadeDuration(2500)
        animationDrawable.setExitFadeDuration(5000)
        animationDrawable.start()

        val btnDashboard = findViewById<Button>(R.id.btnDashboard)
        val tvRegister = findViewById<TextView>(R.id.tvRegister)

        tvRegister.setOnClickListener {
            val intent = Intent(
                this@LoginActivity,
                RegisterActivity::class.java
            )
            startActivity(intent)
        }

    }
}