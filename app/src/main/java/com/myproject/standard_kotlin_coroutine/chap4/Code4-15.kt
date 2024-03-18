package com.myproject.standard_kotlin_coroutine.chap4

import kotlinx.coroutines.*

fun main() = runBlocking {
    val whileJob: Job = launch(Dispatchers.Default) {
        while(true) {
            println("작업 중")

            // yield(양보하다)를 호출하여 스레드를 양보해 코루틴을 일시 중지
            yield()
        }
    }
    delay(100L)
    whileJob.cancel()
}