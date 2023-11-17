import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.*

suspend fun main(args: Array<String>) = runBlocking {

    launch(Dispatchers.IO) {
        while (true) {
            SnakeGame.printAll()
            delay(500)
        }
    }
    launch {
        while (true) {
            val content = System.`in`.read()

            println(content)

        }
    }



    Unit
}