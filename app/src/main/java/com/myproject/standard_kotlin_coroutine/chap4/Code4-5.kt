package com.myproject.standard_kotlin_coroutine.chap4

import kotlinx.coroutines.*

fun main() = runBlocking {
    val convertImageJob1: Job = launch(Dispatchers.Default) {
        Thread.sleep(1000L) // 이미지 변환 작업 실행 시간
        println("[${Thread.currentThread().name}] 이미지1 변환 완료")
    }
    val convertImageJob2: Job = launch(Dispatchers.Default) {
        Thread.sleep(1000L) // 이미지 변환 작업 실행 시간
        println("[${Thread.currentThread().name}] 이미지2 변환 완료")
    }

    joinAll(convertImageJob1, convertImageJob2) // 이미지1과 이미지2가 변환될 때까지 대기

    val uploadImageJob: Job = launch(Dispatchers.IO) {
        println("[${Thread.currentThread().name}] 이미지1,2 업로드")
    }
}
/*
// 결과:
[DefaultDispatcher-worker-2] 이미지2 변환 완료
[DefaultDispatcher-worker-1] 이미지1 변환 완료
[DefaultDispatcher-worker-1] 이미지1,2 업로드
*/