package com.project.viewmodellivedata

import android.util.Log
import java.util.*

class MainActivityDataGenerator {
    private lateinit var myRandomNumber: String

    fun getNumber(): String {
        Log.i(TAG, "getNumber: ")

        if(!::myRandomNumber.isInitialized) {
            this.createNumber()
        }
        return myRandomNumber
    }

    private fun createNumber() {
        Log.i(TAG, "Create New Number")
        val random = Random()
        myRandomNumber = "Number: " + (random.nextInt(10 - 1) + 1)
    }

    companion object{
        private val TAG = MainActivityDataGenerator::class.java.simpleName
    }
}