package com.xyz.shrreya.bottonnavigationtablelayout.ui.fragment

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.xyz.shrreya.bottonnavigationtablelayout.R
import com.xyz.shrreya.bottonnavigationtablelayout.adapter.MyPagerAdapter

class HomeFragment : Fragment() {

    private lateinit var viewPager: ViewPager
    private lateinit var tabs: TabLayout
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_fragment_home, container, false)
        viewPager = view.findViewById(R.id.ViewPager_main)
        tabs = view.findViewById(R.id.tab_main)

        val fragmentAdapter = MyPagerAdapter(childFragmentManager)
        viewPager.adapter= fragmentAdapter
        tabs.setupWithViewPager(viewPager)

        return view
    }
}
