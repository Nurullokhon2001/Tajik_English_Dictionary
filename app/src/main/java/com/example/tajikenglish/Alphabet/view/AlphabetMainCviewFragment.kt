package com.example.tajikenglish
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.encom.dynamicview.repository.model.AlphabetButtonModel
import com.encom.dynamicview.vm.AlphabetMainCviewViewModel
import com.example.tajikenglish.R


class AlphabetMainCviewFragment : Fragment(), View.OnClickListener {
    private lateinit var linearLayout: LinearLayout
    private lateinit var cviewViewModelAlphabet: AlphabetMainCviewViewModel



    var indexarray: Int = 0

    override fun onAttach(context: Context) {
        super.onAttach(context)
        cviewViewModelAlphabet = ViewModelProvider(this).get(AlphabetMainCviewViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_alphabet_main_view_fragment, container, false)
        linearLayout = view.findViewById<LinearLayout>(R.id.linearLayout)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initializeViews(cviewViewModelAlphabet.getAlphabets())
    }

    override fun onClick(v: View?) {
        v?.let {
            val alphabetCviewModel: AlphabetButtonModel = it.getTag() as AlphabetButtonModel
            var index: Int = indexarray - alphabetCviewModel.id









var fragment = requireActivity().supportFragmentManager.beginTransaction()
            fragment.setCustomAnimations(R.animator.slide_in_left, R.animator.slide_in_right);
            fragment .replace(R.id.fragment, AlphabetCviewFragment.newInstance(alphabetCviewModel))
            fragment.commit()









        }
    }

    fun initializeViews(alphabetCviewModels: ArrayList<AlphabetButtonModel>) {
        alphabetCviewModels.forEachIndexed { index, alphabetModel ->
            val itemView: View =
                layoutInflater.inflate(R.layout.item_alphabet_main_cview_fragment_view, linearLayout, false)
            itemView.findViewById<TextView>(R.id.textView).text = alphabetModel.alphabet
            itemView.setOnClickListener(this)
            itemView.setTag(alphabetModel)
            indexarray = index
            linearLayout.addView(itemView)

        }
    }

}