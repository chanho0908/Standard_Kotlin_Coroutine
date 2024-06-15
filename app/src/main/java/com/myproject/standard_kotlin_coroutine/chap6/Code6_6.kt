package com.myproject.standard_kotlin_coroutine.chap6

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{
    val coroutineContext = CoroutineName("MyCoroutine")
    val nameFromContext = coroutineContext[CoroutineName]
    println(nameFromContext)
}

/**
 * 실행 결과
 * CoroutineName(MyCoroutine)
 * */