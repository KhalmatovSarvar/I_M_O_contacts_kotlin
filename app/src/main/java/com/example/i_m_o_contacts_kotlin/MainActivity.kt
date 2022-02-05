package com.example.i_m_o_contacts_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.i_m_o_contacts_kotlin.adapter.ContactAdapter
import com.example.i_m_o_contacts_kotlin.model.Contact

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = GridLayoutManager(this,1)

        refreshAdapter(getContacts())

    }

    private fun refreshAdapter(contacts: ArrayList<Contact>) {
        val adapter = ContactAdapter(this,contacts)
        recyclerView.adapter = adapter

    }

    private fun getContacts(): ArrayList<Contact> {
     val contacts : ArrayList<Contact> = ArrayList()
        contacts.add(Contact("sarvar Khalmatov Shukhratovich",R.drawable.sarvar,false))
        contacts.add(Contact("sarvar Khalmatov Shukhratovich",R.drawable.sarvar,true))
        contacts.add(Contact("sarvar Khalmatov Shukhratovich",R.drawable.sarvar,true))
        contacts.add(Contact("sarvar Khalmatov Shukhratovich",R.drawable.sarvar,false))
        contacts.add(Contact("sarvar Khalmatov Shukhratovich",R.drawable.sarvar,true))
        contacts.add(Contact("sarvar Khalmatov Shukhratovich",R.drawable.sarvar,true))
        contacts.add(Contact("sarvar Khalmatov Shukhratovich",R.drawable.sarvar,false))
        contacts.add(Contact("sarvar Khalmatov Shukhratovich",R.drawable.sarvar,false))
        contacts.add(Contact("sarvar Khalmatov Shukhratovich",R.drawable.sarvar,true))
        contacts.add(Contact("sarvar Khalmatov Shukhratovich",R.drawable.sarvar,false))
        contacts.add(Contact("sarvar Khalmatov Shukhratovich",R.drawable.sarvar,true))
        contacts.add(Contact("sarvar Khalmatov Shukhratovich",R.drawable.sarvar,true))
        contacts.add(Contact("sarvar Khalmatov Shukhratovich",R.drawable.sarvar,true))
        contacts.add(Contact("sarvar Khalmatov Shukhratovich",R.drawable.sarvar,false))
        contacts.add(Contact("sarvar Khalmatov Shukhratovich",R.drawable.sarvar,true))
        contacts.add(Contact("sarvar Khalmatov Shukhratovich",R.drawable.sarvar,true))
        return contacts

    }
}