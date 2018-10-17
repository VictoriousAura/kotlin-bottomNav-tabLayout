package com.xyz.shrreya.bottonnavigationtablelayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v4.view.PagerAdapter
import com.xyz.shrreya.bottonnavigationtablelayout.adapter.MyPagerAdapter
import com.xyz.shrreya.bottonnavigationtablelayout.ui.fragment.HighlightsFragment
import com.xyz.shrreya.bottonnavigationtablelayout.ui.fragment.Fragment_home
import com.xyz.shrreya.bottonnavigationtablelayout.ui.fragment.Fragment_settings

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener= BottomNavigationView.OnNavigationItemSelectedListener {
        item -> when(item.itemId){
        R.id.menu_highlight->{
            replaceFragment(HighlightsFragment())
            return@OnNavigationItemSelectedListener true
        }
        R.id.menu_home->{
            replaceFragment(Fragment_home())

            return@OnNavigationItemSelectedListener true
        }
        R.id.menu_settings->{
            replaceFragment(Fragment_settings())

            return@OnNavigationItemSelectedListener true
        }
    }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        replaceFragment(Fragment_home())

        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)
        ViewPager_main.adapter= fragmentAdapter
        tab_main.setupWithViewPager(ViewPager_main)
    }

    private fun replaceFragment(fragment: Fragment)
    {
        val fragmentTransaction= supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentHolder,fragment)
        fragmentTransaction.commit()
    }


}
