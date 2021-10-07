package com.example.tajikenglish.Topic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.example.tajikenglish.MainActivity
import com.example.tajikenglish.R
import com.example.tajikenglish.Topic.view.EnglishTopic
import com.example.tajikenglish.Topic.view.QuestionsTopic
import com.example.tajikenglish.Topic.view.TajikTopic
import com.example.tajikenglish.Topic.view.VocabularyTopic
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class TopicActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {
    lateinit var toolbar: Toolbar
    lateinit var BottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topic)
        toolbar = findViewById(R.id.toolbar)
        BottomNavigationView = findViewById(R.id.bottom_menu)
        BottomNavigationView.setOnItemSelectedListener(this)


        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
        var fragment=supportFragmentManager.beginTransaction()
        fragment.replace(R.id.fragment,EnglishTopic()).commit()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
       var fragment=supportFragmentManager.beginTransaction()
        when (item.itemId) {
            R.id.English -> {
                fragment.replace(R.id.fragment,EnglishTopic())
            }
            R.id.Tajik -> {
                fragment.replace(R.id.fragment,TajikTopic())
            }

            R.id.vocabulary -> {
                fragment.replace(R.id.fragment,QuestionsTopic())
            }
            R.id.question -> {
                fragment.replace(R.id.fragment,VocabularyTopic())
            }

        }
        fragment.commit()

        return true
    }
}
