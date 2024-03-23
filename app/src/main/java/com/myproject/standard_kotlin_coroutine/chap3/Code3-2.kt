package com.myproject.standard_kotlin_coroutine.chap3

import kotlinx.coroutines.newFixedThreadPoolContext

fun main(){
    val multiDispatcher = newFixedThreadPoolContext(
        nThreads = 2,
        name = "감자 스레드"
    )
}