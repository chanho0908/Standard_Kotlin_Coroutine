package com.myproject.standard_kotlin_coroutine.chap4

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val longJob: Job = launch(Dispatchers.Default) {
        // 작업 실행
    }

    // 코루틴의 취소가 완료될 때 까지 호출부의 코루틴 suspend
    longJob.cancelAndJoin() // longJob 취소 요청
    executeAfterJobCancelled() // 코루틴 취소 후 실행돼야 하는 동작
}

fun executeAfterJobCancelled() {
    // 작업 실행
}