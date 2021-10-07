package com.example.tajikenglish.Topic.Adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tajikenglish.R
import com.example.tajikenglish.Topic.repository.model.topicModel

class EnglishTopicAdapter(
    private val dataSet: ArrayList<topicModel>,
    private val onClickListener: View.OnClickListener
) : RecyclerView.Adapter<EnglishTopicAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.topic_layout, parent, false)
        return MyViewHolder(view)
    }

    @SuppressLint("ResourceType")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
      //  var animation : Animation=AnimationUtils.loadAnimation(Context,R.animator.up_from_bottom)
        val data: topicModel = dataSet.get(position)
     //   holder.itemView.startAnimation(animation)
        holder.id.text = data.id.toString()
        holder.topicname.text = data.topicname
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



    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var id: TextView = view.findViewById(R.id.idtopic)
        var topicname: TextView = view.findViewById(R.id.topicname)
    }

}