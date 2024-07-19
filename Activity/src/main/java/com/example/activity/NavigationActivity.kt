package com.example.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class NavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)
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