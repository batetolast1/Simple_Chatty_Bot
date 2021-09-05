fun main() {
    val numOfParts = readLine()!!.toInt()
    var larger = 0
    var smaller = 0
    var perfect = 0

    repeat(numOfParts) {
        when (readLine()!!.toInt()) {
            -1 -> smaller++
            0 -> perfect++
            1 -> larger++
        }
    }

    print("$perfect $larger $smaller")
}