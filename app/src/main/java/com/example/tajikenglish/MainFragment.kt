package com.example.tajikenglish

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.tajikenglish.Alphabet.AlphabetActivity
import com.example.tajikenglish.Number.NumberActivity
import com.example.tajikenglish.Topic.TopicActivity


class MainFragment : Fragment() {
//   lateinit var  topicfragment : RelativeLayout
        lateinit var  alphabetFragment : LinearLayout
    lateinit var  numberlayout : LinearLayout
    lateinit var  topiclayout : LinearLayout
//    lateinit var wordsFragment: RelativeLayout
//    lateinit var phrasesFragment: RelativeLayout
//    lateinit var speechFragment: RelativeLayout



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
        return view

    }


    }
