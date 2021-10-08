package com.example.tajikenglish.Topic.view

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.tajikenglish.R
import com.example.tajikenglish.Topic.vm.EnglishVM

class TajikFragment : Fragment() {

    lateinit var infotextname: TextView
    lateinit var infotext : TextView
    private lateinit var viewModel: EnglishVM
    var itemTopic: Int = 0
    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel = ViewModelProvider(this).get(EnglishVM::class.java)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view= inflater.inflate(R.layout.fragment_info, container, false)
        infotextname=view.findViewById(R.id.infotextname)
        infotext=view.findViewById(R.id.infotext)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getTopic(itemTopic).observe(viewLifecycleOwner, Observer {
            infotextname.text=it.topicnametj
            infotext.text=it.topictajik

        })
    }

    companion object{
        fun newInstance(itemContact : Int): TajikFragment  {
            val fragment = TajikFragment()
            fragment.itemTopic=itemContact
            return fragment
        }
    }
}