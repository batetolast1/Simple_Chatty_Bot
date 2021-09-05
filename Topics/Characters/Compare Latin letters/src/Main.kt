fun main() {
    val (letter1, letter2) = generateSequence(::readLine)
        .take(2)
        .map { it.single() }
        .toList()
    print(letter1.equals(letter2, ignoreCase = true))
}