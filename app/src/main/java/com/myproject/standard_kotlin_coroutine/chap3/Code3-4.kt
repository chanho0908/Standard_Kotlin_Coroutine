package com.myproject.standard_kotlin_coroutine.chap3

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.newFixedThreadPoolContext
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val multiThreadDispatcher = newFixedThreadPoolContext(
        nThreads = 2,
        name = "MultiThread"
    )
    launch(context = multiThreadDispatcher) {
        println("[${Thread.currentThread().name}] 실행")
        delay(1000)
    }
    launch(context = multiThreadDispatcher) {
        println("[${Thread.currentThread().name}] 실행")
    }
}
