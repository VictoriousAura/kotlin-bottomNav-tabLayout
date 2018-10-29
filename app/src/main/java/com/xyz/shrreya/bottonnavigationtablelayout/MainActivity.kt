package com.xyz.shrreya.bottonnavigationtablelayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.xyz.shrreya.bottonnavigationtablelayout.adapter.UsersAdapter
import com.xyz.shrreya.bottonnavigationtablelayout.ui.fragment.HighlightsFragment
import com.xyz.shrreya.bottonnavigationtablelayout.ui.fragment.HomeFragment
import com.xyz.shrreya.bottonnavigationtablelayout.ui.fragment.SettingsFragment

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_fragment_highlights.*

class MainActivity : AppCompatActivity() {


    private val mOnNavigationItemSelectedListener= BottomNavigationView.OnNavigationItemSelectedListener {
        item -> when(item.itemId){
        R.id.menu_highlight->{
            Log.d("MainActivity","onCLick:HighlightMenu")
            replaceFragment(HighlightsFragment())
            return@OnNavigationItemSelectedListener true
        }
        R.id.menu_home->{
            replaceFragment(HomeFragment())

            return@OnNavigationItemSelectedListener true
        }
        R.id.menu_settings->{
            replaceFragment(SettingsFragment())

            return@OnNavigationItemSelectedListener true
        }
    }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val recyclerViewHighLight =findViewById<RecyclerView>(R.id.recyclerViewHighlight)
        BottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        replaceFragment(HomeFragment())

    }

    private fun replaceFragment(fragment: Fragment)
    {
        val fragmentTransaction= supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentHolder,fragment)
        fragmentTransaction.commit()
    }




}