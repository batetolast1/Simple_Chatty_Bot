import java.lang.Math.max

fun main() {
    var max = Int.MIN_VALUE

    do {
        val nextInt = readLine()!!.toInt()

        max = max.coerceAtLeast(nextInt)
    } while (nextInt != 0)

    print(max)
}