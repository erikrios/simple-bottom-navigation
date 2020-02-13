package com.erikriosetiawan.simplebottomnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.erikriosetiawan.simplebottomnavigation.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.bottomNavigationView.setOnNavigationItemSelectedListener(menuClickListener)
        binding.bottomNavigationView.selectedItemId = R.id.menu_home
    }

    private val menuClickListener = BottomNavigationView.OnNavigationItemSelectedListener {
        val fragment: Fragment = when (it.itemId) {
            R.id.menu_home -> HomeFragment()
            R.id.menu_menu -> MenuFragment()
            else -> FavoriteFragment()
        }
        supportFragmentManager.beginTransaction().replace(binding.frameContainer.id, fragment).commit()
        return@OnNavigationItemSelectedListener true
    }
}
