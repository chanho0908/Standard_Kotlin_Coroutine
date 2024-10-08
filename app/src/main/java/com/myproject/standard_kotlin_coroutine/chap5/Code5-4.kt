package com.myproject.standard_kotlin_coroutine.chap5

import kotlinx.coroutines.*

/**
 * 5-3에서 사용한 코드의 순차 처리 문제를 병렬로 해결
 * */
fun main() = runBlocking {

    // 1. 시작 시간 기록
    val startTime = System.currentTimeMillis()

    // 2. 플랫폼1에서 등록한 관람객 목록을 가져오는 코루틴
    val participantDeferred1: Deferred<Array<String>> = async(Dispatchers.IO) {
        delay(1000L)
        return@async arrayOf("James","Jason")
    }

    // 3. 플랫폼2에서 등록한 관람객 목록을 가져오는 코루틴
    val participantDeferred2: Deferred<Array<String>> = async(Dispatchers.IO) {
        delay(1000L)
        return@async arrayOf("Jenny")
    }

    // 4. 결과 수신 대기
    val participants1 = participantDeferred1.await()
    // 5. 결과 수신 대기
    val participants2 = participantDeferred2.await()

    // 6. 지난 시간 기록 및 참여자 목록 병합
    println("[${getElapsedTime(startTime)}] 참여자 목록: ${listOf(*participants1, *participants2)}")
}

