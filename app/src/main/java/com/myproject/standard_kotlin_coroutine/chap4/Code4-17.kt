package com.myproject.standard_kotlin_coroutine.chap4
import kotlinx.coroutines.*

fun main() = runBlocking{
    val job: Job = launch(start = CoroutineStart.LAZY) { // 생성 상태의 Job 생성
        delay(1000L)
    }
    printJobState(job)
}
/*
// 결과:
Job State
isActive >> false
isCancelled >> false
isCompleted >> false
*/

public fun printJobState(job: Job) {
    println(
        "Job State\n" +
        "isActive >> ${job.isActive}\n" +
        "isCancelled >> ${job.isCancelled}\n" +
        "isCompleted >> ${job.isCompleted} "
    )
}