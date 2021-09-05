fun main() {
    val (x, y, z) = generateSequence(::readLine)
        .take(3)
        .map { it.toBoolean() }
        .toList()
    print(!(x && y) || z)
}