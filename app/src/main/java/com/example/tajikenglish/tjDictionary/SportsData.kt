package com.example.tajikenglish.tjDictionary

import android.content.Context
import com.example.tajikenglish.tajikEnglish.repository.MainRepository

fun sportsList(context: Context): List<Sports> {


      var viewModel: MainRepository =   MainRepository(context)




      return viewModel.getFilter()





//    return listOf(
//        Sports(
//            R.drawable.ic_rugby,
//            context.getString(R.string.title_rugby),
//            context.getString(R.string.subtitle_rugby),
//            context.getString(R.string.about_rugby)
//        ),
//        Sports(
//            R.drawable.ic_cricket,
//            context.getString(R.string.title_cricket),
//            context.getString(R.string.subtitle_cricket),
//            context.getString(R.string.about_cricket)
//        ),
//        Sports(
//            R.drawable.ic_hockey,
//            context.getString(R.string.title_hockey),
//            context.getString(R.string.subtitle_hockey),
//            context.getString(R.string.about_hockey)
//        ),
//        Sports(
//            R.drawable.ic_basketball,
//            context.getString(R.string.title_basketball),
//            context.getString(R.string.subtitle_basketball),
//            context.getString(R.string.about_basketball)
//        ),
//        Sports(
//            R.drawable.ic_volleyball,
//            context.getString(R.string.title_volleyball),
//            context.getString(R.string.subtitle_volleyball),
//            context.getString(R.string.about_volleyball)
//        ),
//        Sports(
//            R.drawable.ic_esports,
//            context.getString(R.string.title_esports),
//            context.getString(R.string.subtitle_esports),
//            context.getString(R.string.about_esports)
//        ),
//        Sports(
//            R.drawable.ic_kabaddi,
//            context.getString(R.string.title_kabbadi),
//            context.getString(R.string.subtitle_kabbadi),
//            context.getString(R.string.about_kabbadi)
//        ),
//        Sports(
//            R.drawable.ic_baseball,
//            context.getString(R.string.title_baseball),
//            context.getString(R.string.subtitle_baseball),
//            context.getString(R.string.about_baseball)
//        ),
//        Sports(
//            R.drawable.ic_mma,
//            context.getString(R.string.title_mma),
//            context.getString(R.string.subtitle_mma),
//            context.getString(R.string.about_mma)
//        ),
//        Sports(
//            R.drawable.ic_soccer,
//            context.getString(R.string.title_soccer),
//            context.getString(R.string.subtitle_soccer),
//            context.getString(R.string.about_soccer)
//        ),
//        Sports(
//            R.drawable.ic_handball,
//            context.getString(R.string.title_handball),
//            context.getString(R.string.subtitle_handball),
//            context.getString(R.string.about_handball)
//        ),
//        Sports(
//            R.drawable.ic_tennis,
//            context.getString(R.string.title_tennis),
//            context.getString(R.string.subtitle_tennis),
//            context.getString(R.string.about_tennis)
//        )

}