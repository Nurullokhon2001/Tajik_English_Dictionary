package com.example.tajikenglish.Alphabet.repository

import com.encom.dynamicview.repository.model.AlphabetImageWordModel

class AlphabetRepository {

    fun getAlphabet(): ArrayList<AlphabetImageWordModel> {
        val array: ArrayList<AlphabetImageWordModel> = ArrayList()
        array.add(AlphabetImageWordModel(1, "A","Apple", "apple.png"))
        array.add(AlphabetImageWordModel(2, "B","Bird", "bird.png"))
        array.add(AlphabetImageWordModel(3, "C","Cat","cat.png"))
        array.add(AlphabetImageWordModel(4, "D","Dog", "dog.png"))
        array.add(AlphabetImageWordModel(5, "E","Egg", "egg.png"))
        array.add(AlphabetImageWordModel(6, "F","Flowers", "flowers.png"))
        array.add(AlphabetImageWordModel(7, "G","Girl", "girl.png"))
        array.add(AlphabetImageWordModel(8, "H","House", "house.png"))
        array.add(AlphabetImageWordModel(9, "I","Ice", "ice.png"))
        array.add(AlphabetImageWordModel(10, "J","Juice", "juice.png"))
        array.add(AlphabetImageWordModel(11, "K","Key", "key.png"))
        array.add(AlphabetImageWordModel(12, "L","Letter", "letter.png"))
        array.add(AlphabetImageWordModel(13, "M","Money", "money.png"))
        array.add(AlphabetImageWordModel(14, "N","Nurse", "nurse.png"))
        array.add(AlphabetImageWordModel(15, "O","Orange", "orange.png"))
        array.add(AlphabetImageWordModel(16, "P","Pineapple", "pineapple.png"))
        array.add(AlphabetImageWordModel(17, "Q","Queen", "queen.png"))
        array.add(AlphabetImageWordModel(18, "R","Rabbit", "rabbit.png"))
        array.add(AlphabetImageWordModel(19, "S","Smile", "smile.png"))
        array.add(AlphabetImageWordModel(20, "T","Table", "table.png"))
        array.add(AlphabetImageWordModel(21, "U","Umbrella", "umbrella.png"))
        array.add(AlphabetImageWordModel(22, "V","Violin", "violin.png"))
        array.add(AlphabetImageWordModel(23, "w","Window", "window.png"))
        array.add(AlphabetImageWordModel(24, "X","Xerox", "xerox.png"))
        array.add(AlphabetImageWordModel(25, "Y","Yogurt", "yogurt.png"))
        array.add(AlphabetImageWordModel(26, "Z","Zebra", "zebra.png"))

        return array
    }
}
