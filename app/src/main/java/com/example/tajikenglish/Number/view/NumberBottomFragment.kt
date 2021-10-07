package com.example.tajikenglish.Number.view
import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.speech.tts.TextToSpeech
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.encom.dynamicview.repository.model.AlphabetButtonModel
import com.encom.dynamicview.repository.model.AlphabetImageWordModel
import com.encom.dynamicview.vm.AlphabetCviewViewModel
import com.example.tajikenglish.Number.vm.NumberBottomViewModel
import com.example.tajikenglish.R
import java.io.InputStream
import java.util.*


class NumberBottomFragment : Fragment(), View.OnClickListener {
    private lateinit var linearLayout: LinearLayout
    private lateinit var viewModel: NumberBottomViewModel
    lateinit var mTTS: TextToSpeech
    var itemAlphabet: Int = 0

    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel = ViewModelProvider(this).get(NumberBottomViewModel::class.java)
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
            setOnClickListener(this@NumberBottomFragment)
            setTag(alphabets)
        }
        itemView.findViewById<ImageView>(R.id.ImageView).apply {
            val inputStream: InputStream = requireContext().getAssets().open("rasmho/" +alphabets.ImageVIew)
            val image = Drawable.createFromStream(inputStream, null)
            setImageDrawable(image)
            setOnClickListener(this@NumberBottomFragment)
            setTag(alphabets)
        }
        itemView.findViewById<TextView>(R.id.wordtView).apply {
            text = alphabets.word
            setTag(alphabets)
        }
        linearLayout.addView(itemView)
    }



    companion object {
        fun newInstance(itemContact: AlphabetButtonModel): NumberBottomFragment {

            val fragment = NumberBottomFragment()
            fragment.itemAlphabet = itemContact.id
            return fragment
        }

    }



//  override fun  onBackPressed() {
//      if (viewPager.currentItem == 0) {
//          // If the user is currently looking at the first step, allow the system to handle the
//          // Back button. This calls finish() on this activity and pops the back stack.
//          super.onBackPressed()
//      } else {
//          // Otherwise, select the previous step.
//          viewPager.currentItem = viewPager.currentItem - 1
//      }
//  }


/**
 * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
 * sequence.
 */



    }












