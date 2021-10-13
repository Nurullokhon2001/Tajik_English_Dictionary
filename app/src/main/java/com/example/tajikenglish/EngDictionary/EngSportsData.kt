package com.example.tajikenglish.EngDictionary

import android.content.Context
import com.example.tajikenglish.R
import com.example.tajikenglish.tajikEnglish.repository.MainRepository

fun sportsList(context: Context): List<EngSports> {

    var viewModel: MainRepository =   MainRepository(context)

    return viewModel.getFilter2()
}