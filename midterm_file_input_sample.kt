import java.util.Scanner
import java.io.FileReader

fun main(args: Array<String>) {
    // Use a scanner to read words from "words.txt"
    val sc = Scanner(FileReader("words.txt"))

    // print first 10 words
    for (i in 1..10) {
        if (sc.hasNext()) {
            val word = sc.next()
            println("Word $i: $word")
        }
    }
}