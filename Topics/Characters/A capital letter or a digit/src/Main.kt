fun main() {
    val character = readLine()!!.single()
    print(character.isUpperCase() || character.isDigit() && character.digitToInt() in 1..9)
}