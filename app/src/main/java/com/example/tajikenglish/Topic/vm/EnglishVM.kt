package com.example.tajikenglish.Topic.vm

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.tajikenglish.Topic.repository.EnglishRepository
import com.example.tajikenglish.Topic.repository.model.topicModel

class EnglishVM(application: Application) : AndroidViewModel(application) {

var EnglishRepository = EnglishRepository()

    var   myDataSet = EnglishRepository.getDictionaries()
        fun fetchDictionaries(): LiveData<ArrayList<topicModel>> {
            val result: MutableLiveData<ArrayList<topicModel>> = MutableLiveData()
                result.postValue(myDataSet)
            return result
            }


    fun getTopic(position:Int): LiveData<topicModel> {
        var result: MutableLiveData<topicModel> = MutableLiveData()
        result.postValue(myDataSet[position])
        return result
    }



}