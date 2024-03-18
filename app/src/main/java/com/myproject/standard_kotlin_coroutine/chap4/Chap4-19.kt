package com.myproject.standard_kotlin_coroutine.chap4

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job: Job = launch {
        delay(1000L)
    }
    delay(2000L)
    printJobState(job)
}
/*
// 결과:
Job State
isActive >> false
isCancelled >> false
isCompleted >> true
*/
