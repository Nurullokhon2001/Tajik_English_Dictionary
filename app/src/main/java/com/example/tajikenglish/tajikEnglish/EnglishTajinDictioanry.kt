package com.example.tajikenglish.tajikEnglish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tajikenglish.R
import com.example.tajikenglish.Topic.vm.tajikenglishvm
import com.example.tajikenglish.tajikEnglish.Adapters.EngTopicAdapter

class EnglishTajinDictioanry : AppCompatActivity(),View.OnClickListener {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModel: tajikenglishvm
    private lateinit var adapter: EngTopicAdapter



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

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}