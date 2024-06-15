package com.myproject.standard_kotlin_coroutine.chap6

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{
    val coroutineContext = CoroutineName("MyCoroutine") + Dispatchers.IO
    val nameFromContext = coroutineContext[CoroutineName.Key]
    println(nameFromContext)
}

/**
 * 실행 결과
 * CoroutineName(MyCoroutine)
 * */