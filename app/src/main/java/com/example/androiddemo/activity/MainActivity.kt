package com.example.androiddemo.activity

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androiddemo.R
import com.example.androiddemo.adapter.MyBaseAdapter
import com.example.databinding.DataBindingActivity


class MainActivity : AppCompatActivity(), MyBaseAdapter.OnItemClickListener {

    private var listView: RecyclerView? = null
    private  val list = listOf<String>("ViewDataBinding")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        if (getSupportActionBar() != null) {
            getSupportActionBar()?.setTitle("Demo");
        }

        listView = findViewById(R.id.home_list)
        listView?.layoutManager = LinearLayoutManager(this)
        val adapter = MyBaseAdapter(datas = list, this)
        listView?.adapter = adapter

    }



    override fun onItemClick(position: Int) {

        when (position) {
            0 -> {
                println("=========$position")
                val intent = Intent(this@MainActivity, DataBindingActivity::class.java)
                startActivity(intent)
            }
        }
    }
}