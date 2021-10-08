package com.example.tajikenglish.tajikEnglish

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.widget.ThemedSpinnerAdapter
import androidx.core.view.contains
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tajikenglish.R

import com.example.tajikenglish.Topic.vm.tajikenglishvm
import com.example.tajikenglish.tajikEnglish.Adapters.EngTopicAdapter
import com.example.tajikenglish.tajikEnglish.model.DictionaryModel
import java.util.Locale.filter

class TajikEnglishDictionary : AppCompatActivity(), View.OnClickListener {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModel: tajikenglishvm
    private lateinit var adapter: EngTopicAdapter


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



    }










    override fun onClick(v: View?) {
        if (v!=null){
            var position = v.tag as Int
            Toast.makeText(this, "$position", Toast.LENGTH_SHORT).show()
        }
    }

}