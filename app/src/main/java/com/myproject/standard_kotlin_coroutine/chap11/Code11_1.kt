package com.myproject.standard_kotlin_coroutine.chap11

import kotlinx.coroutines.*
// 1만개의 코루틴을 만드는 코드
var count = 0

fun main() = runBlocking<Unit> {
    withContext(Dispatchers.Default) {
        repeat(10_000) {
            launch {
                count += 1
            }
        }
    }
    println("count = ${count}")
}

/*
// 결과1:
count = 9062 // 매번 다른 값이 나온다.
// 결과2:
count = 9019 // 매번 다른 값이 나온다.
// 결과3:
count = 8644 // 매번 다른 값이 나온다.
*/