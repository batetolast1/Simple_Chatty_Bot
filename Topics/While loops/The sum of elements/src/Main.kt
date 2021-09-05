fun main() {
    var sum = 0

    while (true) {
        val nextInt = readLine()!!.toInt()

        if (nextInt != 0) {
            sum += nextInt
        } else {
            break
        }
    }

    print(sum)
}