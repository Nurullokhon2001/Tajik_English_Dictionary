package com.example.tajikenglish

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.tajikenglish.Alphabet.AlphabetActivity
import com.example.tajikenglish.EngDictionary.EngActivity
import com.example.tajikenglish.tjDictionary.TJDictionary
import com.example.tajikenglish.Number.NumberActivity
import com.example.tajikenglish.Phrases.PhraseTest
import com.example.tajikenglish.Topic.TopicActivity
import com.example.tajikenglish.Words.TetsWords


class MainFragment : Fragment() {
   lateinit var  tjkenglayout : LinearLayout
        lateinit var  alphabetFragment : LinearLayout
    lateinit var  numberlayout : LinearLayout
    lateinit var  topiclayout : LinearLayout
    lateinit var engtajLayout: LinearLayout
        lateinit var wordstest: LinearLayout
    lateinit var phrasetest: LinearLayout



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_main, container, false)
        alphabetFragment = view.findViewById(R.id.alphabetlayout)
        alphabetFragment.setOnClickListener {
            val intent = Intent(context, AlphabetActivity::class.java)
            startActivity(intent)
        }
        numberlayout = view.findViewById(R.id.numberlayout)
        numberlayout.setOnClickListener {
            val intent = Intent(context, NumberActivity::class.java)
            startActivity(intent)
        }
        topiclayout = view.findViewById(R.id.topiclayout)
        topiclayout.setOnClickListener {
            val intent = Intent(context, TopicActivity::class.java)
            startActivity(intent)
        }
        tjkenglayout = view.findViewById(R.id.tjkenglayout)
        tjkenglayout.setOnClickListener {
            val intent = Intent(context, TJDictionary::class.java)
            startActivity(intent)
        }
        engtajLayout = view.findViewById(R.id.engtajLayout)
        engtajLayout.setOnClickListener {
            val intent = Intent(context, EngActivity::class.java)
            startActivity(intent)
        }

        wordstest = view.findViewById(R.id.wordstest)
        wordstest.setOnClickListener {
            val intent = Intent(context, TetsWords::class.java)
            startActivity(intent)
        }

        phrasetest = view.findViewById(R.id.phrasetest)
        phrasetest.setOnClickListener {
            val intent = Intent(context, PhraseTest::class.java)
            startActivity(intent)
        }





        return view

    }


    }
