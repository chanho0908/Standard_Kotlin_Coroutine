package com.myproject.standard_kotlin_coroutine.chap5

import kotlinx.coroutines.*

/**
 * awaitAll : 여러 코루틴의 결과를 기다릴 때 사용, 모든 요청이 끝날 때까지 대기
 * */
fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    val participantDeferred1: Deferred<Array<String>> = async(Dispatchers.IO) {
        delay(1000L)
        arrayOf("James","Jason")
    }

    val participantDeferred2: Deferred<Array<String>> = async(Dispatchers.IO) {
        delay(1000L)
        arrayOf("Jenny")
    }

    val results: List<Array<String>> = awaitAll(participantDeferred1, participantDeferred2)

    println("[${getElapsedTime(startTime)}] 참여자 목록: ${listOf(*results[0], *results[1])}")
}
