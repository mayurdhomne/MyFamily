package com.example.myfamily

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)
        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_bar)
        bottomBar.setOnItemSelectedListener {
            if(it.itemId==R.id.nav_Guard){

                 inflateFregment(GuardFragment.newInstance())

            }else if(it.itemId == R.id.nav_home){

                inflateFregment(HomeFragment.newInstance())

            }

            true
        }
    }

    private fun inflateFregment(newInstance: Fragment) {
        val transaction =supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,newInstance)
        transaction.commit()
    }
}
