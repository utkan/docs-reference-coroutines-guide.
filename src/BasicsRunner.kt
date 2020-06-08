import kotlinx.coroutines.*
import kotlin.concurrent.thread

//suspend fun main() {
//    //<editor-fold desc="Your first coroutine">
////    GlobalScope.launch { // launch a new coroutine in background and continue
////        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
////        println("World!") // print after delay
////    }
////    println("Hello,") // main thread continues while coroutine is delayed
////    Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive
////
////
////    thread {
////        Thread.sleep(1000) // non-blocking delay for 1 second (default time unit is ms)
////        println("World!") // print after delay
////    }
////    println("Hello,") // main thread continues while coroutine is delayed
////    Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive
//    //</editor-fold>
//
//    //<editor-fold desc="Bridging blocking and non-blocking worlds">
////    GlobalScope.launch { // launch a new coroutine in background and continue
////        delay(1000L)
////        println("World!")
////    }
////    println("Hello,") // main thread continues here immediately
////    runBlocking {     // but this expression blocks the main thread
////        delay(2000L)  // ... while we delay for 2 seconds to keep JVM alive
////    }
//////    delay(2000L)      // delaying for 2 seconds to keep JVM alive
//    //</editor-fold>
//
//    //<editor-fold desc="Waiting for a job">
////    val job = GlobalScope.launch { // launch a new coroutine and keep a reference to its Job
////        delay(1000L)
////        println("World!")
////    }
////    println("Hello,")
////    job.join() // wait until child coroutine completes
////    println("...")
//
//}
//    //</editor-fold>

//<editor-fold desc="Structured concurrency">
//fun main() = runBlocking { // this: CoroutineScope
//    launch { // launch a new coroutine in the scope of runBlocking
//        delay(1000L)
//        println("World!")
//    }
//    println("Hello,")
//}
//</editor-fold>

//<editor-fold desc="Scope builder">
//fun main() = runBlocking { // this: CoroutineScope
//    launch {
//        delay(200L)
//        println("Task from runBlocking")
//    }
//
//    coroutineScope {
//        launch {
//            delay(500L)
//            println("Task from nested launch")
//        }
//        delay(100L)
//        println("Task from coroutine scope") // This line will be printed before the nested launch
//    }
//    println("Coroutine scope is over") // This line is not printed until the nested launch completes
//}
//</editor-fold>

//<editor-fold desc="Extract function refactoring">
//fun main() = runBlocking {
//    launch { doWorld() }
//    println("Hello, ")
//}
//
//suspend fun doWorld() {
//    delay(1000L)
//    println("World!")
//}
//</editor-fold>

//<editor-fold desc="Coroutines ARE light-weight">
//fun main() = runBlocking {
//    repeat(100_000) {// launch a lot of coroutines
//        launch {
//            delay(1000L)
//            print(".")
//        }
//    }
//}
//</editor-fold>

//<editor-fold desc="Global coroutines are like daemon threads">
//fun main() = runBlocking {
//    GlobalScope.launch {
//        repeat(1000) {i->
//            println("I'm sleeping $i ...")
//            delay(500L)
//        }
//    }
//    delay(1300L)
//}
//</editor-fold>