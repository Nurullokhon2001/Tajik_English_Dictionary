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
import com.example.tajikenglish.Topic.Adapters.EnglishTopicAdapter
import com.example.tajikenglish.Topic.vm.EnglishVM


class QuestionsTopic : Fragment(),View.OnClickListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModel: EnglishVM

    private lateinit var adapter: EnglishTopicAdapter
    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel = ViewModelProvider(this).get(EnglishVM::class.java)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_questions_topic, container, false)
        recyclerView = view.findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(context)

        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.fetchDictionaries().observe(viewLifecycleOwner, Observer {
            adapter = EnglishTopicAdapter(it, this@QuestionsTopic)
            recyclerView.adapter = adapter
        })
    }

    override fun onClick(itemView: View?) {
        if(itemView!=null){
            var position = itemView.tag as Int
            // Toast.makeText(requireContext(), "${position}", Toast.LENGTH_SHORT).show()
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragment,QuestionsFragment.newInstance(position)).addToBackStack(QuestionsFragment.javaClass.simpleName).commit()


        }

    }


}