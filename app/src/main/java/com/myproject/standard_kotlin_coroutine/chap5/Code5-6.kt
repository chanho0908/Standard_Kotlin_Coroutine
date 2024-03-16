package com.myproject.standard_kotlin_coroutine.chap5

import kotlinx.coroutines.*

/**
 * 컬렉션에 대해서도 awaitAll 사용이 가능하다!
 * */

fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    val participantDeferred1: Deferred<Array<String>> = async(Dispatchers.IO) {
        delay(1000L)
        arrayOf("James", "Jason")
    }

    val participantDeferred2: Deferred<Array<String>> = async(Dispatchers.IO) {
        delay(1000L)
        arrayOf("Jenny")
    }

    val results: List<Array<String>> =
        listOf(participantDeferred1, participantDeferred2).awaitAll()

    println("[${getElapsedTime(startTime)}] 참여자 목록: ${listOf(*results[0], *results[1])}")
}