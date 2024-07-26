package com.example.fragment.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.FrameLayout
import com.example.fragment.R

class MainFragmentActivity : AppCompatActivity() {

    val fragment = MyFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        supportFragmentManager.beginTransaction()
            .add(R.id.msg_fragment_container, fragment)
            .commit()


        println("========onCreatePage2")
    }


    override fun onStart() {
        super.onStart()

        println("========onStartPage2")
    }

    override fun onResume() {
        super.onResume()

        println("========onResumePage2")
    }

    override fun onPause() {
        super.onPause()

        println("========onPausePage2")
    }

    override fun onStop() {
        super.onStop()

        println("========onStopPage2")
    }

    override fun onRestart() {
        super.onRestart()

        println("========onRestartPage2")
    }

    override fun onDestroy() {
        super.onDestroy()

        println("========onDestroyPage2")
    }
}