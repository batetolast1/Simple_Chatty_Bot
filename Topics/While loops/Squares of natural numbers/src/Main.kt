fun main() {
    val n = readLine()!!.toInt()
    var counter = 1

    while (counter * counter <= n) {
        println(counter * counter)
        counter++
    }
}