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
        println("========onCreateNavigationActivity")
    }

    override fun onStart() {
        super.onStart()

        println("========onStartNavigationActivity")
    }

    override fun onResume() {
        super.onResume()

        println("========onResumeNavigationActivity")
    }

    override fun onPause() {
        super.onPause()

        println("========onPauseNavigationActivity")
    }

    override fun onStop() {
        super.onStop()

        println("========onStopNavigationActivity")
    }

    override fun onRestart() {
        super.onRestart()

        println("========onRestartNavigationActivity")
    }

    override fun onDestroy() {
        super.onDestroy()

        println("========onDestroyNavigationActivity")
    }
}