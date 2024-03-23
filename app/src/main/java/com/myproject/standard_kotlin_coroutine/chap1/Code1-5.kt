package chap1

import kotlin.concurrent.thread

fun main(){
    println("[${Thread.currentThread().name}] 메인 스레드 시작")
    thread(isDaemon = false) {
        println("[${Thread.currentThread().name}] 새로운 스레드 시작")
        Thread.sleep(2000L)// 2초 대기
        println("[${Thread.currentThread().name}] 새로운 스레드 종료")
    }

    Thread.sleep(1000)
    println("[${Thread.currentThread().name}] 새로운 스레드 종료")
}