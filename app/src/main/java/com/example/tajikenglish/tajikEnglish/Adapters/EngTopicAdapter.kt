package com.example.tajikenglish.tajikEnglish.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tajikenglish.MainActivity
import com.example.tajikenglish.R
import com.example.tajikenglish.Topic.Adapters.TajikDictionaryAdapter
import com.example.tajikenglish.tajikEnglish.model.DictionaryModel
import java.util.*
import kotlin.collections.ArrayList


class EngTopicAdapter(private var dataSet: ArrayList<DictionaryModel>,
                      private val onClickListener: View.OnClickListener
) : RecyclerView.Adapter<EngTopicAdapter.MyViewHolder>()  {


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var id: TextView = view.findViewById(R.id.tajkdic)
        var topicname: TextView = view.findViewById(R.id.Englishdic)
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): MyViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.dictionary_item, parent, false)
        return MyViewHolder(view)    }

    override fun onBindViewHolder(holder: EngTopicAdapter.MyViewHolder, position: Int) {
        //  var animation : Animation=AnimationUtils.loadAnimation(Context,R.animator.up_from_bottom)
        val data: DictionaryModel = dataSet.get(position)
        //   holder.itemView.startAnimation(animation)
        holder.id.text = data.tajik
        holder.topicname.text = data.english
        holder.id.tag = position
//        holder.topicname.setOnClickListener(onClickListener)
        holder.itemView.setOnClickListener(onClickListener)
        holder.itemView.setTag(position)


//        holder.imageView.tag = position
//        holder.imageView.setOnClickListener(onClickListener)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }






}




