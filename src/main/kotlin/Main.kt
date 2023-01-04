import java.lang.NumberFormatException
import choose
import selection

fun main() {

    val n = choose()

    if (n != null) {
        selection(n)
    } else println("It's not possible to continue")


}