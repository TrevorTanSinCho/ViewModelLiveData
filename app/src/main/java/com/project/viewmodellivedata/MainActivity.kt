package com.project.viewmodellivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*
import javax.security.auth.login.LoginException

class MainActivity : AppCompatActivity() {

    lateinit var data: MainActivityDataGenerator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //data = MainActivityDataGenerator()

        data = ViewModelProviders.of(this).get(MainActivityDataGenerator::class.java)
        val myRandomNumber = data.getNumber()

        myRandomNumber.observe(this, Observer<String> { number ->
            tvNumber.text = number
            Log.i(TAG, "Random Number Set")
        })

        bRandom.setOnClickListener { data.createNumber() }

    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }
}