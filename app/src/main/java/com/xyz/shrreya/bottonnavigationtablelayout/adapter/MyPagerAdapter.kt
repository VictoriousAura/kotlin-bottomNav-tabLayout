package com.xyz.shrreya.bottonnavigationtablelayout.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.xyz.shrreya.bottonnavigationtablelayout.ui.fragment.Fragment_home
import com.xyz.shrreya.bottonnavigationtablelayout.ui.fragment.Fragment_settings
import com.xyz.shrreya.bottonnavigationtablelayout.ui.fragment.HighlightsFragment

class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                Fragment_home()
            }

            1 -> HighlightsFragment()
            else -> {
               return Fragment_settings()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Home"
            1 -> "Highlights"
            else ->{
                return "Settings"
            }
        }
    }
}
