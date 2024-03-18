package com.myproject.standard_kotlin_coroutine.chap4
import kotlinx.coroutines.*

fun main() = runBlocking {

    // 코루틴은 일시 중지 되었을 때 취소가 가능
    // 이 방법은 매번 while을 지연시킨다.
    val whileJob: Job = launch(Dispatchers.Default) {
        while(true) {
            println("작업 중")
            delay(1L)
        }
    }
    delay(100L)
    whileJob.cancel()
}