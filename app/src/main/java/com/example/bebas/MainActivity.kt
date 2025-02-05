package com.example.bebas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        // Data Dummy Film
        val movieList = listOf(
            Movie("Shrimp Game", "Durasi 60 menit", R.drawable.squid),
            Movie("Interstellar", "Durasi 120 menit", R.drawable.poster1),
            Movie("Joker", "Durasi 115 menit", R.drawable.poster2),
            Movie("Top Gun Maverick", "Durasi 130 menit", R.drawable.poster3),
            Movie("Dawn of the Dead", "Durasi 105 menit", R.drawable.poster4),
            Movie("You dont get to 500 Million Friend Without Making a few Enemies", "Durasi 85 menit", R.drawable.poster5),
            Movie("Django Unchained", "Durasi 125 menit", R.drawable.poster6),
            Movie("The Green Knight", "Durasi 100 menit", R.drawable.poster7),
            Movie("The Martian", "Durasi 110 menit", R.drawable.poster8),
            Movie("Ghostbuster", "Durasi 90 menit", R.drawable.poster9)
        )

        val adapter = MovieAdapter(movieList) { selectedMovie ->
            // Navigasi ke DetailActivity saat item diklik
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("title", selectedMovie.title)
                putExtra("description", selectedMovie.description)
                putExtra("imageResId", selectedMovie.imageResId)
            }
            startActivity(intent)
        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

}