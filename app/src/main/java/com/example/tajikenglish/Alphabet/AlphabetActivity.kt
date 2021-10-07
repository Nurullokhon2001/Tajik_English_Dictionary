package com.example.tajikenglish.Alphabet


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.FragmentActivity
import com.example.tajikenglish.AlphabetCviewFragment
import com.example.tajikenglish.AlphabetMainCviewFragment
import com.example.tajikenglish.MainActivity
import com.example.tajikenglish.R
class AlphabetActivity : FragmentActivity() {
    lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabet)

        toolbar = findViewById(R.id.toolbar)

        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer,
                AlphabetMainCviewFragment())
            .commit()
        supportFragmentManager.beginTransaction().replace(R.id.fragment, AlphabetCviewFragment())
            .commit()

          }

    }





