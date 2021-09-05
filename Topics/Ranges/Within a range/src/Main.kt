fun main() {
    val range1 = readLine()!!.toInt()..readLine()!!.toInt()
    val range2 = readLine()!!.toInt()..readLine()!!.toInt()
    val num = readLine()!!.toInt()

    print(num in range1 || num in range2)
}