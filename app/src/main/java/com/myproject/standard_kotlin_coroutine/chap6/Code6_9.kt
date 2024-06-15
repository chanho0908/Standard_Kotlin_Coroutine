package com.myproject.standard_kotlin_coroutine.chap6

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.runBlocking

@OptIn(ExperimentalStdlibApi::class)
fun main() = runBlocking {
    val coroutineName = CoroutineName("MyCoroutine")
    val dispatcher = Dispatchers.IO
    val myJob = Job()
    val coroutineContext = coroutineName + dispatcher + myJob

    val deleteCoroutineContext = coroutineContext.minusKey(CoroutineName)
    println(deleteCoroutineContext[CoroutineName])
    println(deleteCoroutineContext[CoroutineDispatcher])
    println(deleteCoroutineContext[Job])
}

/**
 * 실행 결과
 * null
 * Dispatchers.IO
 * JobImpl{Active}@335eadca
 * */