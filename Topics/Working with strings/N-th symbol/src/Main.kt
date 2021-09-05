fun main() {
    val string = readLine()!!
    val n = readLine()!!.toInt()
    print("Symbol # $n of the string \"$string\" is '${string[n - 1]}'")
}