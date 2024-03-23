package chap1

import java.util.concurrent.*

fun main() {
    // 2개의 스레드풀 생성
    val executorService: ExecutorService = Executors.newFixedThreadPool(2)
    // 스레드가 결과값을 반환할 때 까지 bloking
    val future: Future<String> = executorService.submit<String> {
        Thread.sleep(2000)
        return@submit "작업 1완료"
    }

    // 메인 스레드가 블로킹 됨
    val result = future.get()
    println(result)
    executorService.shutdown()
}