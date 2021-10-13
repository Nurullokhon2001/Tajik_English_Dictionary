package com.example.tajikenglish.EngDictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.tajikenglish.R

class EngDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eng_detail)


        val sports: String? = intent.getStringExtra("DETAIL_SPORTS_DATA")
        val sportss: String? = intent.getStringExtra("DETAIL_SPORTS_DATAA")


        findViewById<TextView>(R.id.detail_about_text).text = sportss
        findViewById<TextView>(R.id.detail_about_textt).text = sports
    }
}