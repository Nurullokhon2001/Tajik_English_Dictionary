package com.example.tajikenglish.tajikEnglish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tajikenglish.R
import com.example.tajikenglish.Topic.vm.tajikenglishvm
import com.example.tajikenglish.tajikEnglish.Adapters.EngTopicAdapter
import com.example.tajikenglish.tajikEnglish.model.DictionaryModel

class EnglishTajinDictioanry : AppCompatActivity(),View.OnClickListener {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModel: tajikenglishvm
    private lateinit var adapter: EngTopicAdapter
    lateinit var mTTS: TextToSpeech



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_english_tajin_dictioanry)
        recyclerView=findViewById(R.id.engrecyclerview)
        viewModel = ViewModelProvider(this).get(tajikenglishvm::class.java)
        recyclerView.layoutManager = LinearLayoutManager(this)
        viewModel.getEngTaj().observe(this, Observer {
            adapter = EngTopicAdapter(it, this)
            recyclerView.adapter = adapter
        })

    }

    override fun onClick(v: View?) {
        if (v!=null){
            //   var position = v.getTag() as DictionaryModel
            val alphabetModel: DictionaryModel = v.getTag() as DictionaryModel
            val toSpeak = alphabetModel.tajik

            Toast.makeText(this, toSpeak, Toast.LENGTH_SHORT).show()
            //if there is text in edit text
//            Toast.makeText(this, toSpeak, Toast.LENGTH_SHORT).show()
//            mTTS.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null)


        }
    }
}