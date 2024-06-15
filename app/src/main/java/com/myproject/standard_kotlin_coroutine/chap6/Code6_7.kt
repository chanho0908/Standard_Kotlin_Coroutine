package com.myproject.standard_kotlin_coroutine.chap6

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val coroutineName = CoroutineName("MyCoroutine")
    val dispatcher = Dispatchers.IO
    val coroutineContext = coroutineName + dispatcher

    println(coroutineContext[coroutineName.key])
    CoroutineName("MyCoroutine")
    println(coroutineContext[dispatcher.key])
}

/**
 * 실행 결과
 * CoroutineName(MyCoroutine)
 * Dispatchers.IO
 * */