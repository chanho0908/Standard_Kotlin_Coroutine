package com.myproject.standard_kotlin_coroutine.chap6

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit>{
    val coroutineContext1 = CoroutineName("MyCoroutine1") + newSingleThreadContext("MyThread1")
    val coroutineContext2 = CoroutineName("MyCoroutine2") + newSingleThreadContext("MyThread2")
    val combinedCoroutineContext = coroutineContext1 + coroutineContext2

    println("${combinedCoroutineContext}")
}