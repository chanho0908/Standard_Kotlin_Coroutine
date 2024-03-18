package com.myproject.standard_kotlin_coroutine.chap4

import kotlinx.coroutines.*

fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    val immediateJob: Job = launch {
        println("[${getElapsedTime(startTime)}]") // 지난 시간 측정
    }
}
/*
// 결과:
[지난 시간: 2ms] 즉시 실행
*/

private fun getElapsedTime(startTime: Long): String = "지난 시간: ${System.currentTimeMillis() - startTime}ms"