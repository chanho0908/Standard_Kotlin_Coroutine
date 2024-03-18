package com.myproject.standard_kotlin_coroutine.chap4

import kotlinx.coroutines.*

fun main() = runBlocking {
    val whileJob: Job = launch(Dispatchers.Default) { // 취소를 확인할 수 있는 시점이 없는 코루틴 생성
        while(true) {
            // 작업 실행
        }
    }
    whileJob.cancel() // 코루틴 취소 요청
    // 취소가 요청됐으나 무한 로프로 인해 취소 되지 않은 코루틴의 상태 출력
    printJobState(whileJob)
}
/*
// 결과:
Job State
isActive >> false
isCancelled >> true
isCompleted >> false
*/