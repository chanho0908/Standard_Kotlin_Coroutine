package com.myproject.standard_kotlin_coroutine.chap6

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit>{

    val coroutineContext = newSingleThreadContext("MyThread") + CoroutineName("oldCoroutine")
    val coroutineContext2 = coroutineContext + CoroutineName("NewCoroutine")

    launch(context = coroutineContext2) {
        println("${Thread.currentThread().name} 실행")
    }
}

/**
 * 결과
 * MyThread @NewCoroutine2 실행
 * */