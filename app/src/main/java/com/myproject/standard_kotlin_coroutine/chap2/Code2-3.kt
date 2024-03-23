package com.myproject.standard_kotlin_coroutine.chap2

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit>{
    println("[${Thread.currentThread().name} 실행]")

    // 추가 코루틴 생성
    launch {
        println("[${Thread.currentThread().name} 실행]")
    }

    launch {
        println("[${Thread.currentThread().name} 실행]")
    }
}

