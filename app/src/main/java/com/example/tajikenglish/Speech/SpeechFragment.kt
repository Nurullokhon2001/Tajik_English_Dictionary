package com.example.tajikenglish.Speech

import android.os.Bundle
import android.speech.tts.TextToSpeech
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.tajikenglish.R
import java.util.*

class SpeechFragment : Fragment() {

    lateinit var mTTS: TextToSpeech

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_speech, container, false)
        mTTS = TextToSpeech(requireContext(), TextToSpeech.OnInitListener { status ->
            if (status != TextToSpeech.ERROR){
                //if there is no error then set language
                mTTS.language = Locale.UK
            }
        })
  val speakBtn : Button = view.findViewById(R.id.speakBtn)
      val textEt : TextView = view.findViewById(R.id.textEt)
        var   stopBtn : TextView = view.findViewById(R.id.stopBtn)



        //speak button click
        speakBtn.setOnClickListener {
            //get text from edit text
            val toSpeak = textEt.text.toString()
            if (toSpeak == ""){
                //if there is no text in edit text
                Toast.makeText(requireContext(), "Cуханро ворид кунед", Toast.LENGTH_SHORT).show()
            }
            else{
                //if there is text in edit text
                Toast.makeText(requireContext(), toSpeak, Toast.LENGTH_SHORT).show()
                mTTS.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null)
            }
        }

        //stop speaking button click
        stopBtn.setOnClickListener {
            if (mTTS.isSpeaking){
                //if speaking then stop
                mTTS.stop()
                //mTTS.shutdown()
            }
            else{
                //if not speaking
                Toast.makeText(requireContext(), "Хомуши", Toast.LENGTH_SHORT).show()
            }
        }

            return  view
    }


}