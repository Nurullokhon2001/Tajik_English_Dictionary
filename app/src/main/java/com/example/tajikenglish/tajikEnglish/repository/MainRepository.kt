package com.example.tajikenglish.tajikEnglish.repository

import android.annotation.SuppressLint
import android.content.Context
import com.example.alifboitj.repository.sqllite.MySQLiteOpenHelper

import com.example.tajikenglish.tajikEnglish.model.DictionaryModel


class MainRepository(context: Context) : MySQLiteOpenHelper(context) {


    @SuppressLint("Range")
    fun getDictionaries(): ArrayList<DictionaryModel> {
        val array: ArrayList<DictionaryModel> = ArrayList()
        val sql = "SELECT * FROM tj2en"
        val mCursor = Query(sql)
        if (mCursor != null) {
            if (mCursor.moveToFirst()) {
                do {
                    val field1 = mCursor.getString(mCursor.getColumnIndex("field1"))
                    val field2 = mCursor.getString(mCursor.getColumnIndex("field2"))

                    array.add(DictionaryModel(field1,  field2 ))
                } while (mCursor.moveToNext())
            }
            mCursor.close()
        }
        return array
    }
    @SuppressLint("Range")
    fun getEngTaj():ArrayList<DictionaryModel> {
        val array : ArrayList<DictionaryModel> = ArrayList()
        val sql = "SELECT * FROM entj"
       val mCursor = Query(sql)
        if (mCursor != null) {
            if (mCursor.moveToFirst()) {
                do {
                    val field1 = mCursor.getString(mCursor.getColumnIndex("en"))
                    val field2 = mCursor.getString(mCursor.getColumnIndex("tj"))

                    array.add(DictionaryModel(field1,  field2 ))
                } while (mCursor.moveToNext())
            }
            mCursor.close()
        }
        return array

    }

 //   @SuppressLint("Range")
//    fun getPhrases(): ArrayList<PhrasesItemData> {
//        val array: ArrayList<PhrasesItemData> = ArrayList()
//        val sql = "SELECT * FROM table_themes"
//        val mCursor: Cursor? = Query(sql)
//        if (mCursor != null) {
//            if (mCursor.moveToFirst()) {
//                do {
//                    val id = mCursor.getInt(mCursor.getColumnIndex("id"))
//                    val theme_tr = mCursor.getString(mCursor.getColumnIndex("theme_rus"))
//                    val theme_tj = mCursor.getString(mCursor.getColumnIndex("theme_tj"))
//                    array.add(PhrasesItemData(id, theme_tr, theme_tj))
//                } while (mCursor.moveToNext())
//            }
//            mCursor.close()
//        }
//        return array
//    }

//    @SuppressLint("Range")
//    fun getPhrasesByID(id: Int): ArrayList<DefaultItemData> {
//        val array: ArrayList<DefaultItemData> = ArrayList()
//        val sql = "SELECT * FROM table_words WHERE theme=$id"
//        val mCursor = Query(sql)
//        if (mCursor != null) {
//            if (mCursor.moveToFirst()) {
//                do {
//                    val id = mCursor.getInt(mCursor.getColumnIndex("id"))
//                    val phrase_tr = mCursor.getString(mCursor.getColumnIndex("rus"))
//                    val phrase_tj = mCursor.getString(mCursor.getColumnIndex("tj"))
//                    val isFavorite = mCursor.getInt(mCursor.getColumnIndex("favorite")) == 1
//                    array.add(DefaultItemData(id, phrase_tj, phrase_tr, isFavorite))
//                } while (mCursor.moveToNext())
//            }
//            mCursor.close()
//        }
//        return array
//    }

//    fun getFavorites(isDictionary: Boolean): ArrayList<DefaultItemData> {
//        if (isDictionary)
//            return getFavoriteWords()
//        else
//            return getFavoritePhrases()
//    }
//
//    // Гирифтани фразахои мавзуи интихобшуда
//    @SuppressLint("Range")
//    fun getFavoriteWords(): java.util.ArrayList<DefaultItemData> {
//        val arrayList = java.util.ArrayList<DefaultItemData>()
//        val sql = "SELECT * FROM table_words WHERE favorite = 1"
//        val mCursor = Query(sql)
//        if (mCursor != null) {
//            if (mCursor.moveToFirst()) {
//                do {
//                    val id = mCursor.getInt(mCursor.getColumnIndex("id"))
//                    val word_ru = mCursor.getString(mCursor.getColumnIndex("rus"))
//                    val word_tj = mCursor.getString(mCursor.getColumnIndex("tj"))
//                    val isFavorite = mCursor.getInt(mCursor.getColumnIndex("favorite")) == 1
//                    arrayList.add(DefaultItemData(id, word_tj, word_ru, isFavorite))
//                } while (mCursor.moveToNext())
//            }
//            mCursor.close()
//        }
//        return arrayList
//    }
//
//    @SuppressLint("Range")
//    fun getFavoritePhrases(): java.util.ArrayList<DefaultItemData> {
//        val arrayList = java.util.ArrayList<DefaultItemData>()
//        val sql = "SELECT * FROM table_words WHERE favorite = 1"
//        val mCursor = Query(sql)
//        if (mCursor != null) {
//            if (mCursor.moveToFirst()) {
//                do {
//                    val id = mCursor.getInt(mCursor.getColumnIndex("id"))
//                    val phrase_ru = mCursor.getString(mCursor.getColumnIndex("rus"))
//                    val phrase_tj = mCursor.getString(mCursor.getColumnIndex("tj"))
//                    val isFavorite = mCursor.getInt(mCursor.getColumnIndex("favorite")) == 1
//                    arrayList.add(DefaultItemData(id, phrase_tj, phrase_ru, isFavorite))
//                } while (mCursor.moveToNext())
//            }
//            mCursor.close()
//        }
//        return arrayList
//    }
//
//    fun setFavoriteForDictionary(id: Int, status: Boolean) {
//        val favorite = if (status) 1 else 0
//        val sql = "UPDATE table_words SET favorite = $favorite WHERE  id=" + id
//        Execute(sql)
//    }
}