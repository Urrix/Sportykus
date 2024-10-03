package com.example.sportycus

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    // Manejar la acción de "Inicio"
                    true
                }
                R.id.nav_challenges -> {
                    // Manejar la acción de "Desafíos"
                    true
                }
                R.id.nav_calendar -> {
                    // Manejar la acción de "Calendario"
                    true
                }
                R.id.nav_news -> {
                    // Manejar la acción de "Noticias"
                    true
                }
                R.id.nav_more -> {
                    // Manejar la acción de "Más"
                    true
                }
                else -> false
            }
        }
    }
}
