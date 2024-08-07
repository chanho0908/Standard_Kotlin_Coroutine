package com.myproject.standard_kotlin_coroutine.chap7
import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    delay(5000L)
    println("[${Thread.currentThread().name}] 코루틴 종료")
}
/*
// 결과:
[main @coroutine#1] 코루틴 종료
*/