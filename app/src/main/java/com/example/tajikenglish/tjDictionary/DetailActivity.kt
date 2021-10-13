package com.example.tajikenglish.tjDictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.tajikenglish.R

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val sports: String? = intent.getStringExtra("DETAIL_SPORTS_DATA")
        val sportss: String? = intent.getStringExtra("DETAIL_SPORTS_DATAA")


        findViewById<TextView>(R.id.detail_about_text).text = sportss
        findViewById<TextView>(R.id.detail_about_textt).text = sports



    }
}