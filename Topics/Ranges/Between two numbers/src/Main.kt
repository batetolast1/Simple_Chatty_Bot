fun main() {
    val number = readLine()!!.toInt()
    val range = readLine()!!.toInt()..readLine()!!.toInt()
    print(number in range)
}