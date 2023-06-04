package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager

import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity(), NewsItemClicked {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView: RecyclerView =findViewById(R.id.recyclerview)
        recyclerView.layoutManager=LinearLayoutManager(this)
        val item=fetchdata()
        val adapter=NewsListAdapter(item,this)
        recyclerView.adapter=adapter

    }
    private  fun fetchdata():ArrayList<String>
    {
        val list=ArrayList<String>()

            for (i in 0 until 100)
            {
                list.add("items $i")
            }
        return list
    }

    override fun onItemClicked(item: String) {
        Toast.makeText(this,"Item clicked is $item",Toast.LENGTH_SHORT).show()
    }
}