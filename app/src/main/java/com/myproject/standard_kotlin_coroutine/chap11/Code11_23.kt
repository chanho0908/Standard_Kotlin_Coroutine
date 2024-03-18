package com.myproject.standard_kotlin_coroutine.chap11

import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine


fun main() = runBlocking<Unit>{
    getUserName()
    printUserName("빨주노초홍맹보")
}

suspend fun getUserName(): String{
    return suspendCoroutine { continuation ->
        continuation.resume("빨주노초홍맹보")
    }
}

suspend fun printUserName(name: String){
    println(name)
}

