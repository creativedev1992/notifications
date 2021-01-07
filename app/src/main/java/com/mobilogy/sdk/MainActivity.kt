package com.mobilogy.sdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobilogy.mylibrary.BlankFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(
                R.id.container,
                BlankFragment(),
                "notificationFragment"
            )
            .addToBackStack(null).commitAllowingStateLoss()

    }
}