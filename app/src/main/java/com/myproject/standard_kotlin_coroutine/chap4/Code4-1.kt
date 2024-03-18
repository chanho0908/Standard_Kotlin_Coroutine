package com.myproject.standard_kotlin_coroutine.chap4

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job: Job = launch(Dispatchers.IO) {
        println("[${Thread.currentThread().name}] 실행")
    }
}