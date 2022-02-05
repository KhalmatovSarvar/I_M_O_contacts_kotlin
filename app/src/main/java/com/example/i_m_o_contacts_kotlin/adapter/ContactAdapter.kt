package com.example.i_m_o_contacts_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.i_m_o_contacts_kotlin.R
import com.example.i_m_o_contacts_kotlin.model.Contact
import com.google.android.material.imageview.ShapeableImageView

class ContactAdapter(var context:Context,var  contacts: ArrayList<Contact>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_layout,parent,false)
        return ContactsViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            val contact = contacts[position]

        if(holder is ContactsViewHolder){
          var iv_profile = holder.iv_profile
          var iv_online = holder.iv_isOnline
          var tv_fullName = holder.tv_fullname

          iv_profile.setImageResource(contact.image)
            tv_fullName.text = contact.fullName
            if(contact.isOnline){
            iv_online.visibility = View.VISIBLE
            }else{
                iv_online.visibility = View.GONE
            }
        }
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

}

class ContactsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    var iv_profile: ShapeableImageView
    var tv_fullname: TextView
    var iv_isOnline: ImageView

    init {
        iv_profile = view.findViewById(R.id.img_profile)
        tv_fullname = view.findViewById(R.id.full_name)
        iv_isOnline = view.findViewById(R.id.online)
    }

}
