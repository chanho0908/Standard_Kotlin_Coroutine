package com.myproject.standard_kotlin_coroutine.chap6

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val coroutineName = CoroutineName("MyCoroutine")

    if (coroutineName.key === CoroutineName.Key){
        println("동일하다!")
    }
}

/**
 * 실행 결과
 * 동일하다!
 * */