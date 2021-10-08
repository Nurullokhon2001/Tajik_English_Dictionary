package com.example.tajikenglish.Topic.view

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tajikenglish.R
import com.example.tajikenglish.Topic.Adapters.TajikDictionaryAdapter
import com.example.tajikenglish.Topic.vm.EnglishVM

class VocabularyTopic : Fragment(),View.OnClickListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModel: EnglishVM

    private lateinit var adapter: TajikDictionaryAdapter
    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel = ViewModelProvider(this).get(EnglishVM::class.java)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_vocabulary_topic, container, false)
        recyclerView = view.findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(context)
return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.fetchDictionaries().observe(viewLifecycleOwner, Observer {
            adapter= TajikDictionaryAdapter(it,this@VocabularyTopic)
            recyclerView.adapter=adapter
        })
    }

    override fun onClick(view: View?) {
        if(view!=null){
            var position = view.tag as Int
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragment,VocabularyFragment.newInstance(position)).addToBackStack(VocabularyFragment.javaClass.simpleName).commit()
        }
    }
}