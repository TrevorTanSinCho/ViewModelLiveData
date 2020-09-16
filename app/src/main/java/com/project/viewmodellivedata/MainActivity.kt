package com.project.viewmodellivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import javax.security.auth.login.LoginException

class MainActivity : AppCompatActivity() {

    lateinit var data: MainActivityDataGenerator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        data = MainActivityDataGenerator()
        val myRandomNumber = data.getNumber()
        tvNumber.text = myRandomNumber
        Log.i(TAG, "Random Number Set")
    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }
}