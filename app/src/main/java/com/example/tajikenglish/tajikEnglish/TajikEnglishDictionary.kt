package com.example.tajikenglish.tajikEnglish

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech

import android.view.View
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.encom.dynamicview.repository.model.AlphabetImageWordModel
import com.example.tajikenglish.R

import com.example.tajikenglish.Topic.vm.tajikenglishvm
import com.example.tajikenglish.tajikEnglish.Adapters.EngTopicAdapter
import com.example.tajikenglish.tajikEnglish.model.DictionaryModel
import java.util.*

class TajikEnglishDictionary : AppCompatActivity(), View.OnClickListener {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModel: tajikenglishvm
    private lateinit var adapter: EngTopicAdapter
    lateinit var mTTS: TextToSpeech


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tajik_english_dictionary)
        recyclerView=findViewById(R.id.tajikrecyclerview)
        viewModel = ViewModelProvider(this).get(tajikenglishvm::class.java)
        recyclerView.layoutManager = LinearLayoutManager(this)
        viewModel.fetchDictionaries().observe(this, Observer {
            adapter = EngTopicAdapter(it, this)
            recyclerView.adapter = adapter
        })

        mTTS = TextToSpeech(this, TextToSpeech.OnInitListener { status ->
            if (status != TextToSpeech.ERROR){
                //if there is no error then set language
                mTTS.language = Locale.UK
            }
        })




    }











    override fun onClick(v: View?) {
        if (v!=null){

            //   var position = v.getTag() as DictionaryModel
            val alphabetModel: DictionaryModel = v.getTag() as DictionaryModel
            val toSpeak = alphabetModel.english


            //if there is text in edit text
            Toast.makeText(this, toSpeak, Toast.LENGTH_SHORT).show()
            mTTS.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null)
        }
    }

}