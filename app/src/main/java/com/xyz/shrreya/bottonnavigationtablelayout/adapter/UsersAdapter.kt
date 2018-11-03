package com.xyz.shrreya.bottonnavigationtablelayout.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.xyz.shrreya.bottonnavigationtablelayout.R

class UsersAdapter(val users: ArrayList<String>) :RecyclerView.Adapter<UsersAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userName: TextView= itemView.findViewById(R.id.userName )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        val view :View =LayoutInflater.from(parent.context).inflate(R.layout.user_row,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount()= users.size

    override fun onBindViewHolder(holder: UsersAdapter.ViewHolder, position: Int) {
        holder.userName.text= users[position]
    }
}