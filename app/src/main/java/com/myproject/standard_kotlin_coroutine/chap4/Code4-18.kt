package com.myproject.standard_kotlin_coroutine.chap4

import kotlinx.coroutines.*

fun main() = runBlocking{
    val job: Job = launch { // 실행 중 상태의 코루틴 생성
        delay(1000L)
    }
    printJobState(job) // 코루틴 상태 출력
}
/*
// 결과:
Job State
isActive >> true
isCancelled >> false
isCompleted >> false
*/
