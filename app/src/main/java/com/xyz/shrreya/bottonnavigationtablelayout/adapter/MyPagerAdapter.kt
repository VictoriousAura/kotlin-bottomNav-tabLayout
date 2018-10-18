package com.xyz.shrreya.bottonnavigationtablelayout.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.xyz.shrreya.bottonnavigationtablelayout.ui.fragment.*

class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                Tab1Fragment()
            }

            1 -> Tab2Fragment()
            else -> {
               return Tab3Fragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Tab1"
            1 -> "Tab2"
            else ->{
                return "Tab3"
            }
        }
    }
}
