package com.example.tajikenglish.Number.vm

import androidx.lifecycle.ViewModel
import com.encom.dynamicview.repository.AlphabetMainCviewRepository
import com.encom.dynamicview.repository.model.AlphabetButtonModel
import com.example.tajikenglish.Number.repository.NumberBottomRepository
import com.example.tajikenglish.Number.repository.NumberTopRepository

/**
 * Created by ABDUAHAD FAIZULLOEV on 26,сентябрь,2021
 * abduahad.fayzulloev@gmail.com
 * http://abduahad.com/
 *
 */
class NumberTopViewModel:ViewModel(){
   private val cviewRepositoryAlphabet: NumberTopRepository = NumberTopRepository()

   fun getAlphabets():ArrayList<AlphabetButtonModel>{
       return cviewRepositoryAlphabet.getAlphabet()
   }
}