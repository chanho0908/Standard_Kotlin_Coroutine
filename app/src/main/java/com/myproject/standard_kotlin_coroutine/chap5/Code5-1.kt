package com.myproject.standard_kotlin_coroutine.chap5

import kotlinx.coroutines.*

/**
 * 네트워크 요청 결과등 코루틴 실행 결과를 반환할 때 사용한다.
 * Deferred : 코루틴 실행 결과를 반환하는 Job
 * await : Deferred의 결과 수신 대기
 * */
fun main() = runBlocking {

    val networkDeferred: Deferred<String> = async(Dispatchers.IO) {
        delay(1000L) // 네트워크 요청
        return@async "네트워크 요청 완료" // 결과값 반환
    }
    val result = networkDeferred.await() // networkDeferred로부터 결과값이 반환될 때까지 runBlocking 일시 중단
    println(result)
}
/*
// 결과:
[DefaultDispatcher-worker-1 @coroutine#2] 토큰 업데이트 시작
[DefaultDispatcher-worker-3 @coroutine#3] 네트워크 요청 완료
[DefaultDispatcher-worker-1 @coroutine#2] 토큰 업데이트 완료
*/