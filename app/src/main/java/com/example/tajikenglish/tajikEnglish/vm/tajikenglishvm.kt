package com.example.tajikenglish.Topic.vm

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.tajikenglish.tjDictionary.Sports
import com.example.tajikenglish.tajikEnglish.model.DictionaryModel
import com.example.tajikenglish.tajikEnglish.repository.MainRepository

class tajikenglishvm(application: Application) : AndroidViewModel(application) {

    val repository: MainRepository

    init {
        repository = MainRepository(application)
    }


    var   myDataSet = repository.getDictionaries()
        fun fetchDictionaries(): LiveData<ArrayList<DictionaryModel>> {
            val result: MutableLiveData<ArrayList<DictionaryModel>> = MutableLiveData()
                result.postValue(myDataSet)
            return result
            }



    var   myDataEngTaj = repository.getEngTaj()
    fun getEngTaj(): LiveData<ArrayList<DictionaryModel>> {
        val result: MutableLiveData<ArrayList<DictionaryModel>> = MutableLiveData()
        result.postValue(myDataEngTaj)
        return result
    }


    var   myDataSet2 = repository.getFilter()
    fun getEngTaj2(): List<Sports> {
        var result: List<Sports>
        result = myDataSet2
        return result
    }
}