package com.myproject.standard_kotlin_coroutine.chap3

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.newFixedThreadPoolContext
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit>{
    val multiThreadDispatcher = newFixedThreadPoolContext(
        nThreads = 3,
        name = "멀티 스레드"
        )

    launch(context = multiThreadDispatcher) {
        println("부모 코루틴 : [${Thread.currentThread().name}] 실행")

        launch {
            println("자식 코루틴1 : [${Thread.currentThread().name}] 실행")
            delay(1000)
        }

        launch {
            println("자식 코루틴2 : [${Thread.currentThread().name}] 실행")
        }
    }
}