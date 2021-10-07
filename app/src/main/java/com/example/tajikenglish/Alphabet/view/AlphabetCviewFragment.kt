package com.example.tajikenglish
import android.content.Context
import android.content.res.AssetFileDescriptor
import android.graphics.drawable.Drawable
import android.media.MediaPlayer
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.encom.dynamicview.repository.model.AlphabetButtonModel
import com.encom.dynamicview.repository.model.AlphabetImageWordModel
import com.encom.dynamicview.vm.AlphabetCviewViewModel
import java.io.InputStream
import java.util.*


class AlphabetCviewFragment : Fragment(), View.OnClickListener {
    private lateinit var linearLayout: LinearLayout
    private lateinit var viewModel: AlphabetCviewViewModel
    var mp:MediaPlayer? = null
    lateinit var mTTS: TextToSpeech

    var itemAlphabet: Int = 0

    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel = ViewModelProvider(this).get(AlphabetCviewViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_alphabet_main_view_bottom, container, false)
        linearLayout = view.findViewById<LinearLayout>(R.id.linearLayout)

        mTTS = TextToSpeech(requireContext(), TextToSpeech.OnInitListener { status ->
            if (status != TextToSpeech.ERROR){
                //if there is no error then set language
                mTTS.language = Locale.UK
            }
        })


        return view
    }







    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        initializeViews(viewModel.getAlphabets(itemAlphabet))
    }














    override fun onClick(v: View?) {
        v?.let {
            val alphabetModel: AlphabetImageWordModel = it.getTag() as AlphabetImageWordModel
            when(it.id){
                R.id.ImageView->{

                }
                R.id.alpabetView->{



                    val toSpeak = alphabetModel.alphabet
                        mTTS.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null)

                }
                R.id.wordtView->{

                }
                else->{}
            }

        }
    }

    fun initializeViews(alphabets: AlphabetImageWordModel) {
        val itemView: View = layoutInflater.inflate(R.layout.item_view_alphabet_cview, linearLayout, false)
        itemView.findViewById<TextView>(R.id.alpabetView).apply {
            text = alphabets.alphabet
            setOnClickListener(this@AlphabetCviewFragment)
            setTag(alphabets)
        }
        itemView.findViewById<ImageView>(R.id.ImageView).apply {
            val inputStream: InputStream = requireContext().getAssets().open("rasmho/" +alphabets.ImageVIew)
            val image = Drawable.createFromStream(inputStream, null)
            setImageDrawable(image)
            setOnClickListener(this@AlphabetCviewFragment)
            setTag(alphabets)
        }
        itemView.findViewById<TextView>(R.id.wordtView).apply {
            setOnClickListener(this@AlphabetCviewFragment)
            text = alphabets.word
            setTag(alphabets)
        }
        linearLayout.addView(itemView)
    }



    companion object {
        fun newInstance(itemContact: AlphabetButtonModel): AlphabetCviewFragment {

            val fragment = AlphabetCviewFragment()
            fragment.itemAlphabet = itemContact.id
            return fragment
        }
    }




    fun audioPlayer(fullPath:String){
        try {
            if (mp!=null){
                mp?.stop()
                mp?.release()
                mp= null
            }
            mp = MediaPlayer()
            val decs: AssetFileDescriptor = requireContext().resources.assets.openFd(fullPath)
            mp?.setDataSource(decs.fileDescriptor,decs.startOffset,decs.length)
            decs.close()
            mp?.prepare()
            mp?.setVolume(1f,1f)
            mp?.isLooping=false

            mp?.start()
        }catch (ex:Exception){
            Log.i("",ex.message!!)
        }
    }


    }












