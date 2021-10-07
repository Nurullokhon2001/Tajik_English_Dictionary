package com.example.tajikenglish.Number


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.widget.Toolbar

import androidx.fragment.app.FragmentActivity
import com.example.tajikenglish.AlphabetCviewFragment
import com.example.tajikenglish.AlphabetMainCviewFragment

import com.example.tajikenglish.MainActivity
import com.example.tajikenglish.Number.view.NumberBottomFragment
import com.example.tajikenglish.Number.view.NumberTopFragment
import com.example.tajikenglish.R


class NumberActivity : FragmentActivity() {
    lateinit var toolbar: Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number)

        toolbar = findViewById(R.id.toolbar)

        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer,
                NumberTopFragment())
            .commit()
        supportFragmentManager.beginTransaction().replace(R.id.fragment, NumberBottomFragment())
            .commit()


    }
}