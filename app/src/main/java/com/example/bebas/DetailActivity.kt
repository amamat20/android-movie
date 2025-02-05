package com.example.bebas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageView
import android.widget.TextView


class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imgMovie: ImageView = findViewById(R.id.imgMovieDetail)
        val tvTitle: TextView = findViewById(R.id.tvTitleDetail)
        val tvDescription: TextView = findViewById(R.id.tvDescriptionDetail)

        // Ambil data dari Intent
        val title = intent.getStringExtra("title")
        val description = intent.getStringExtra("description")
        val imageResId = intent.getIntExtra("imageResId", R.drawable.squid)

        // Tampilkan data
        tvTitle.text = title
        tvDescription.text = description
        imgMovie.setImageResource(imageResId)
    }
}