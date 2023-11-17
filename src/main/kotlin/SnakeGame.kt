import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking



suspend fun main(args: Array<String>) = runBlocking {
    while (true) {
        SnakeGame.printAll()
        delay(500)
    }
}

class SnakeGame {

    companion object {
        val wall = '■'
        val map_size = 15
        val blank_size = map_size*2

        fun horizontal() {
            repeat(map_size + 2) { "$wall ".print() }
        }


        fun printAll() {
            repeat(10) { println() }

            horizontal()
            println()

            var blank = ""
            repeat(blank_size + 1) {
                blank += " "
            }

            repeat(map_size) { "$wall$blank$wall".println() }

            horizontal()
        }

        fun String.print() = print(this)
        fun Char.print() = print(this)
        fun String.println() = println(this)
        fun Char.println() = println(this)

    }
}