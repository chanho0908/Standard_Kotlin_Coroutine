package com.myproject.standard_kotlin_coroutine.chap6

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Job
import kotlin.coroutines.EmptyCoroutineContext
/*
fun main(){
    val emptyContext = EmptyCoroutineContext
    println(emptyContext[CoroutineName]) // null
    println(emptyContext[Job]) // null

    val ctxName = emptyContext + CoroutineName("감자")
    println(ctxName[CoroutineName]) // 감자

    val ctxName2 = ctxName + CoroutineName("고구마")
    println(ctxName2[CoroutineName]) // 고구마
}*/