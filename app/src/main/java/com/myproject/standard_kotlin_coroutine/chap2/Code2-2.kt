package chap2

import kotlinx.coroutines.runBlocking

// -Dkotlinx.coroutines.debug
fun main() = runBlocking{
    println("[${Thread.currentThread().name} 실행]")
}


