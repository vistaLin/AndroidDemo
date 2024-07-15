package com.example.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityLifecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)

        val navigationBtn = findViewById<Button>(R.id.navigation_button)
        navigationBtn.setOnClickListener {
            println("========navigationBtn")
//            val intent = Intent(this@ActivityLifecycleActivity, NavigationActivity::class.java)
//            startActivity(intent)

        }

        println("========onCreate")
    }


    override fun onStart() {
        super.onStart()

        println("========onStart")
    }

    override fun onResume() {
        super.onResume()

        println("========onResume")
    }

    override fun onPause() {
        super.onPause()

        println("========onPause")
    }

    override fun onStop() {
        super.onStop()

        println("========onStop")
    }

    override fun onRestart() {
        super.onRestart()

        println("========onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()

        println("========onDestroy")
    }
}