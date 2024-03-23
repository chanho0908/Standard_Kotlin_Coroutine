package chap1

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

// Executor 사용해보기!
// Executor : 스레드 풀을 생성할 수 있는 프레임워크
fun main() {
    val startTime = System.currentTimeMillis()
    // ExecutorService 생성
    // 스레드를 생성하고 관리하는 객체
    val executorService: ExecutorService = Executors.newFixedThreadPool(2)

    // 작업1 제출
    executorService.submit {
        println("[${Thread.currentThread().name}][${getElapsedTime(startTime)}]작업1 시작")
        Thread.sleep(1000L) // 1초간 대기
        println("[${Thread.currentThread().name}][${getElapsedTime(startTime)}]작업1 완료")
    }
    // 작업2 제출
    executorService.submit {
        println("[${Thread.currentThread().name}][${getElapsedTime(startTime)}]작업2 시작")
        Thread.sleep(1000L) // 1초간 대기
        println("[${Thread.currentThread().name}][${getElapsedTime(startTime)}]작업2 완료")
    }

    // 작업2 제출
//    executorService.submit {
//        println("[${Thread.currentThread().name}][${getElapsedTime(startTime)}]작업2 시작")
//        Thread.sleep(1000L)
//        println("[${Thread.currentThread().name}][${getElapsedTime(startTime)}]작업2 완료")
//    }
//    // 작업3 제출
//    executorService.submit {
//        println("[${Thread.currentThread().name}][${getElapsedTime(startTime)}]작업3 시작")
//        Thread.sleep(1000L)
//        println("[${Thread.currentThread().name}][${getElapsedTime(startTime)}]작업3 완료")
//    }

    // ExecutorService 종료
    executorService.shutdown()
}
/*
항상 작업 순서가 달라진다
왜 ? 두 개의 스레드가 병렬로 실행되고 있기 때문!
*/

fun getElapsedTime(startTime: Long): String =
    "지난 시간: ${System.currentTimeMillis() - startTime}ms"