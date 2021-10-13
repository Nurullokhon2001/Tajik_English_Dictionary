package com.example.tajikenglish.EngDictionary

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.RecognizerIntent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.widget.doOnTextChanged
import androidx.recyclerview.widget.RecyclerView
import com.example.tajikenglish.R
import com.example.tajikenglish.tjDictionary.DetailActivity
import java.util.*
import kotlin.collections.ArrayList

class EngActivity : AppCompatActivity(), EngSearchAdapter.SportsAdapterListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var searchAdapter: EngSearchAdapter
    private lateinit var editText: AppCompatEditText
    private lateinit var noSearchResultsFoundText: TextView
    private lateinit var sportsList: List<EngSports>
    private lateinit var clearQueryImageView: ImageView
    private lateinit var voiceSearchImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eng)
        recyclerView = findViewById(R.id.search_list)
        editText = findViewById(R.id.search_edit_text)
        noSearchResultsFoundText = findViewById(R.id.no_search_results_found_text)
        clearQueryImageView = findViewById(R.id.clear_search_query)
        voiceSearchImageView = findViewById(R.id.voice_search_query)

        sportsList = sportsList(applicationContext)
        attachAdapter(sportsList)

        editText.doOnTextChanged { text, _, _, _ ->
            val query = text.toString().toLowerCase(Locale.getDefault())
            filterWithQuery(query)
            toggleImageView(query)
        }

        voiceSearchImageView.setOnClickListener {
            val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
                putExtra(
                    RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                    RecognizerIntent.LANGUAGE_MODEL_FREE_FORM
                )
            }
            startActivityForResult(intent, SPEECH_REQUEST_CODE)
        }

        clearQueryImageView.setOnClickListener {
            editText.setText("")
        }
    }

    private fun attachAdapter(list: List<EngSports>) {
        searchAdapter = EngSearchAdapter(list, this)
        recyclerView.adapter = searchAdapter
    }

    private fun filterWithQuery(query: String) {
        if (query.isNotEmpty()) {
            val filteredList: List<EngSports> = onFilterChanged(query)
            attachAdapter(filteredList)
            toggleRecyclerView(filteredList)
        } else if (query.isEmpty()) {
            attachAdapter(sportsList)
        }
    }

    private fun onFilterChanged(filterQuery: String): List<EngSports> {
        val filteredList = ArrayList<EngSports>()
        for (currentSport in sportsList) {
            if (currentSport.originated!!.toLowerCase(Locale.getDefault()).contains(filterQuery)) {
                filteredList.add(currentSport)
            }
        }
        return filteredList
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == SPEECH_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            val spokenText: String? =
                data?.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS).let { results ->
                    results?.get(0)
                }
            // Do something with spokenText
            editText.setText(spokenText)
        }
        super.onActivityResult(requestCode, resultCode, data)
    }

    private fun toggleRecyclerView(sportsList: List<EngSports>) {
        if (sportsList.isEmpty()) {
            recyclerView.visibility = View.INVISIBLE
            noSearchResultsFoundText.visibility = View.VISIBLE
        } else {
            recyclerView.visibility = View.VISIBLE
            noSearchResultsFoundText.visibility = View.INVISIBLE
        }
    }

    private fun toggleImageView(query: String) {
        if (query.isNotEmpty()) {
            clearQueryImageView.visibility = View.VISIBLE
            voiceSearchImageView.visibility = View.INVISIBLE
        } else if (query.isEmpty()) {
            clearQueryImageView.visibility = View.INVISIBLE
            voiceSearchImageView.visibility = View.VISIBLE
        }
    }

    override fun onSportSelected(sports: EngSports?) {

        val intent = Intent(applicationContext, EngDetail::class.java)
        // intent.putExtra("DETAIL_SPORTS_DATA", sports)

        intent.putExtra("DETAIL_SPORTS_DATA",sports?.originated)

        intent.putExtra("DETAIL_SPORTS_DATAA",sports?.title)
        startActivity(intent)

      //  Toast.makeText(this, "${sports?.originated}", Toast.LENGTH_SHORT).show()
    }

    companion object {
        const val SPEECH_REQUEST_CODE = 0
    }
}