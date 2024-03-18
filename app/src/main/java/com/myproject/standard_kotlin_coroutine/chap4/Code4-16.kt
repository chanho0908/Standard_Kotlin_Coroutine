package com.myproject.standard_kotlin_coroutine.chap4

import kotlinx.coroutines.*

fun main() = runBlocking {
    val whileJob: Job = launch(Dispatchers.Default) {

        // 코루틴 취소 요청 -> isActive가 false로 변경
        // 코루틴을 잠시 멈추지 않고 스레드 사용을 양보하지 않아 효율적
        while(this.isActive) {
            println("작업 중")
        }
    }
    delay(100L)
    whileJob.cancel()
}