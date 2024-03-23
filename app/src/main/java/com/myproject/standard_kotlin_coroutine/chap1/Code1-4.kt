package chap1

fun main(){
    println("[${Thread.currentThread().name}] 메인 쓰레드 시작")
    ExampleThread().apply {
        isDaemon = true
    }.start()
    Thread.sleep(1000)
    println("[${Thread.currentThread().name}] 메인 쓰레드 종료")
}

class ExampleThread: Thread(){
    override fun run() {
        super.run()
        println("[${Thread.currentThread().name}] 새로운 쓰레드 시작")
        sleep(2000)
        println("[${Thread.currentThread().name}] 새로운 쓰레드 종료")
    }
}