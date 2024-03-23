package com.myproject.standard_kotlin_coroutine.chap3

import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit>{
    val dispatcher = newSingleThreadContext(name = "감자 코루틴")

    launch(context = dispatcher) {
        println("[${Thread.currentThread().name}] 실행")
    }
}