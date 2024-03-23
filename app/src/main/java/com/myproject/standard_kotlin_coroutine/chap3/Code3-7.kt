package com.myproject.standard_kotlin_coroutine.chap3

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit>{
    launch(Dispatchers.IO) {
        println("[${Thread.currentThread().name}] 실행")
    }
}