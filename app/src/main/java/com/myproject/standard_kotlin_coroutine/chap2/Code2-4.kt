package com.myproject.standard_kotlin_coroutine.chap2

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit>{
    println("[${Thread.currentThread().name} 실행]")

    // 추가 코루틴 생성
    // 코루틴 이름 부여
    launch(context = CoroutineName("감자 코루틴")) {
        println("[${Thread.currentThread().name} 실행]")
    }

    // 코루틴 이름 부여
    launch(context = CoroutineName("고구마 코루틴")) {
        println("[${Thread.currentThread().name} 실행]")
    }


}