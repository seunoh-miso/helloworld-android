package com.example.seunoh.helloworldandroid

/**
 * @author seunoh
 * @since 17/01/2018.
 */
object NativeUtil {

    init {
        System.loadLibrary("native-common")
    }

    external fun stringFromJNI(): String
}

