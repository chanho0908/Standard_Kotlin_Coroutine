package com.myproject.standard_kotlin_coroutine.chap5

import kotlinx.coroutines.*

/**
 * Deffeted는 Job 인터페이스의 서브 타입으로 선언된 인터페이스
 * 즉, Job 객체의 모든 함수와 프로퍼티를 사용할 수 있다.
 * */
fun main() = runBlocking {
    val networkDeferred: Deferred<String> = async(Dispatchers.IO) {
        delay(1000L) // 네트워크 요청
        "끝났숑~"
    }
    networkDeferred.join() // networkDeferred 실행 완료  대기
    printJobState(networkDeferred)
}

fun printJobState(job: Job) {
    println(
        "Job State\n" +
                "isActive >> ${job.isActive}\n" +
                "isCancelled >> ${job.isCancelled}\n" +
                "isCompleted >> ${job.isCompleted} "
    )
}