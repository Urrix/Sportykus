package com.example.sportycus.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.sportycus.Fragment.CalendarioFragment
import com.example.sportycus.Fragment.DesafiosFragment
import com.example.sportycus.Fragment.InicioFragment
import com.example.sportycus.Fragment.MasFragment
import com.example.sportycus.Fragment.NoticiasFragment
import com.example.sportycus.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        // Cargar el fragmento inicial
        loadFragment(InicioFragment())

        bottomNavigationView.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null
            when (item.itemId) {
                R.id.nav_home -> fragment = InicioFragment()
                R.id.nav_challenges -> fragment = DesafiosFragment()
                R.id.nav_calendar -> fragment = CalendarioFragment()
                R.id.nav_news -> fragment = NoticiasFragment()
                R.id.nav_more -> fragment = MasFragment()
            }
            if (fragment != null) {
                loadFragment(fragment)
            }
            true
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}