package com.example.javakotlin

import android.app.Person
import android.content.res.Resources
import android.util.Log

object Repository {
      fun createObject(title: String, director: String) {
        val movie = Movies(title, director)
        val movieCopy = movie
        Log.d("Creation", movieCopy.toString())
    }
}