package com.xyz.shrreya.bottonnavigationtablelayout.ui.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.xyz.shrreya.bottonnavigationtablelayout.R
import com.xyz.shrreya.bottonnavigationtablelayout.adapter.UsersAdapter

class HighlightsFragment : Fragment() {

    private var users: ArrayList<String> = ArrayList()
    //private lateinit var recyclerViewMenu : RecyclerView


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_fragment_highlights, container, false)

        val recyclerViewMenu = view.findViewById(R.id.recyclerViewHighlight) as RecyclerView

        for(i in 1..100)
        {
            users.add("View $i")
        }
        recyclerViewMenu.layoutManager= LinearLayoutManager(context)
        recyclerViewMenu.adapter= UsersAdapter(users)
        return view

    }


}
