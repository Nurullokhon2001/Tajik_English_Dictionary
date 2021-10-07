package com.encom.dynamicview.repository

import com.encom.dynamicview.repository.model.AlphabetButtonModel

class AlphabetMainCviewRepository {

    fun getAlphabet(): ArrayList<AlphabetButtonModel> {
        val array: ArrayList<AlphabetButtonModel> = ArrayList()


        array.add(AlphabetButtonModel(0, "A a"))
        array.add(AlphabetButtonModel(1, "B b"))
        array.add(AlphabetButtonModel(2, "C c"))
        array.add(AlphabetButtonModel(3, "D d"))
        array.add(AlphabetButtonModel(4, "E e"))
        array.add(AlphabetButtonModel(5, "F f"))
        array.add(AlphabetButtonModel(6, "G g"))
        array.add(AlphabetButtonModel(7, "H h"))
        array.add(AlphabetButtonModel(8, "I i"))
        array.add(AlphabetButtonModel(9, "J j"))
        array.add(AlphabetButtonModel(10, "K k"))
        array.add(AlphabetButtonModel(11, "L l"))
        array.add(AlphabetButtonModel(12, "M m"))
        array.add(AlphabetButtonModel(13, "N n"))
        array.add(AlphabetButtonModel(14, "O o"))
        array.add(AlphabetButtonModel(15, "P p"))
        array.add(AlphabetButtonModel(16, "Q q"))
        array.add(AlphabetButtonModel(17, "R r"))
        array.add(AlphabetButtonModel(18, "S s"))
        array.add(AlphabetButtonModel(19, "T t"))
        array.add(AlphabetButtonModel(20, "U u"))
        array.add(AlphabetButtonModel(21, "V v"))
        array.add(AlphabetButtonModel(22, "W w"))
        array.add(AlphabetButtonModel(23, "X x"))
        array.add(AlphabetButtonModel(24, "Y y"))
        array.add(AlphabetButtonModel(25, "Z z"))



        return array
    }
}