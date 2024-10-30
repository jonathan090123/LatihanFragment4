package com.example.latihanfragment4

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi fragment pertama
        replaceFragment(Fragment1())

        // Set onClickListener untuk tiap tombol
        findViewById<Button>(R.id.btnHal1).setOnClickListener {
            replaceFragment(Fragment1())
        }
        findViewById<Button>(R.id.btnHal2).setOnClickListener {
            replaceFragment(Fragment2())
        }
        findViewById<Button>(R.id.btnHal3).setOnClickListener {
            replaceFragment(Fragment3())
        }
    }

    // Fungsi untuk mengganti fragment
    private fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainer, fragment)
        transaction.commit()
    }
}
