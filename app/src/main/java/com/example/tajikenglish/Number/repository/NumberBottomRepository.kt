package com.example.tajikenglish.Number.repository

import com.encom.dynamicview.repository.model.AlphabetImageWordModel

class NumberBottomRepository {

    fun getAlphabet(): ArrayList<AlphabetImageWordModel> {
        val array: ArrayList<AlphabetImageWordModel> = ArrayList()
        array.add(AlphabetImageWordModel(1, "0","Zero", "zero.png"))
        array.add(AlphabetImageWordModel(2, "1","One", "ball.png"))
        array.add(AlphabetImageWordModel(3, "2","Two","two.png"))
        array.add(AlphabetImageWordModel(4, "3","Three", "three.png"))
        array.add(AlphabetImageWordModel(5, "4","Four", "four.png"))
        array.add(AlphabetImageWordModel(6, "5","Five", "five.png"))
        array.add(AlphabetImageWordModel(7, "6","Six", "six.png"))
        array.add(AlphabetImageWordModel(8, "7","Seven", "seven.png"))
        array.add(AlphabetImageWordModel(9, "8","Eight", "eight.png"))
        array.add(AlphabetImageWordModel(10, "9","Nine", "nine.png"))

        return array
    }
}
