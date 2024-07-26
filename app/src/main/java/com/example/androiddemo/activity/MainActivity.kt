package com.example.androiddemo.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.activity.ActivityLifecycleActivity
import com.example.androiddemo.R
import com.example.androiddemo.adapter.MyBaseAdapter
import com.example.databinding.DataBindingActivity
import com.example.fragment.ui.MainFragmentActivity
import com.example.mvvm.ui.MVVMDemoActivity
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


class MainActivity : AppCompatActivity(), MyBaseAdapter.OnItemClickListener {

    private var listView: RecyclerView? = null
    private val list by lazy {
        mutableListOf<String>(
            "${getString(R.string.data_binding)}",
            "${getString(R.string.activity_lifecycle)}",
            "${getString(R.string.mvvm)}",
            "${getString(R.string.fragment)}"
        )
    }

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

        main()
    }

    fun main() = runBlocking {
        doWorld()
        println("===Done")
    }

    suspend fun doWorld() = coroutineScope {
//        launch {
//            delay(2000L)
//            println("===world 2")
//        }
        launch {
            delay(1000)
            println("===World!")
        }
        println("===Hello")
    }


    override fun onItemClick(position: Int, item: String) {
        when (item) {
            getString(R.string.data_binding) -> {
                println("===R.string.data_binding")
                val intent = Intent(this@MainActivity, DataBindingActivity::class.java)
                startActivity(intent)
            }

            getString(R.string.activity_lifecycle) -> {
                val intent = Intent(this@MainActivity, ActivityLifecycleActivity::class.java)
                startActivity(intent)
            }

            getString(R.string.mvvm) -> {
                println("===R.string.mvvm")
                val intent = Intent(this@MainActivity, MVVMDemoActivity::class.java)
                startActivity(intent)
            }
            getString(R.string.fragment) -> {
                val intent = Intent(this@MainActivity, MainFragmentActivity::class.java)
                startActivity(intent)
            }
        }
    }
}