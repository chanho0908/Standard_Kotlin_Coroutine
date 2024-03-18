package com.myproject.standard_kotlin_coroutine.chap4

import kotlinx.coroutines.*

fun main() = runBlocking {
    val whileJob: Job = launch(Dispatchers.Default) {
        while(true) {
            println("작업 중")
            delay(1L)
        }
    }
    delay(100L)

    // cancel 이 while 밖에 있어 무한루프
    whileJob.cancel()
}
/*
작업 중
작업 중
작업 중
*/