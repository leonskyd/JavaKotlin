package com.example.javakotlin

import android.content.res.Resources
import android.util.Log

class Cycling {

        fun doIt() {
            for (i in 10 downTo 1 step 2) {
                Log.d("Creation","Hello Kotlin! $i")
            }

        }

}