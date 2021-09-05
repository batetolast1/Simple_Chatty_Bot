fun main() {
    val length = readLine()!!.toInt()
    var positiveCount = 0

    repeat(length) {
        if (readLine()!!.toInt() > 0) {
            positiveCount++
        }
    }

    print(positiveCount)
}