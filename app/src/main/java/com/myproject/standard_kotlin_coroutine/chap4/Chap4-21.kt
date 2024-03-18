package com.myproject.standard_kotlin_coroutine.chap4

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job: Job = launch {
        delay(5000L)
    }
    // 코루틴 취소 요청 + 취소가 완료될 때까지 대기
    job.cancelAndJoin()
    printJobState(job) // Job 상태 출력
}
/*
// 결과:
Job State
isActive >> false
isCancelled >> true
isCompleted >> true
*/