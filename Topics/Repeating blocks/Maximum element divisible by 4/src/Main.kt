fun main() {
    val numOfElements = readLine()!!.toInt()
    var biggestDivisibleBy4 = 0

    repeat(numOfElements) {
        val num = readLine()!!.toInt()
        if (num % 4 == 0 && num > biggestDivisibleBy4) {
            biggestDivisibleBy4 = num
        }
    }

    print(biggestDivisibleBy4)
}