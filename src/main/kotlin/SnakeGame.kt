import SnakeGame.Companion.println
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.Scanner



class SnakeGame {

    companion object {
        val wall = '■'
        val map_size = 15
        val blank_size = map_size*2

        val rows = mutableListOf<DrawRow>().apply {
            repeat(map_size) {
                add(DrawRow())
            }
        }

        fun horizontal() {
            repeat(map_size + 2) { "$wall ".print() }
        }


        fun printAll() {
            repeat(10) { println() }

            horizontal()
            println()

            var blank = ""
            repeat(blank_size) {
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