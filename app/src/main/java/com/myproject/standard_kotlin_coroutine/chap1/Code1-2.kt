package chap1

fun main(){
    println("메인 함수 시~작!")
    throw Exception("I am Exception")
    println("메인 스레드 종료")
}
/**
 * 실행 결과
 * 메인 함수 시~작!
 * Exception in thread "main" java.lang.Exception: I am Exception
 * 	at chap1.Code1_1Kt.main(Code1-1.kt:5)
 * 	at chap1.Code1_1Kt.main(Code1-1.kt)
 * */