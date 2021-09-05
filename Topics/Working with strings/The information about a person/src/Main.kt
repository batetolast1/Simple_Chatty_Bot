fun main() {
    val (firstName, lastName, age) = readLine()!!.split(" ")
    print("${firstName.first()}. $lastName, $age years old")
}