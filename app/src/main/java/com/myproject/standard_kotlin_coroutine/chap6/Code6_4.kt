package com.myproject.standard_kotlin_coroutine.chap6

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val myJob = Job()
    val coroutineContext = Dispatchers.IO + myJob
}

