fun main() {
    val (a, b, c) = generateSequence(::readLine)
        .take(3)
        .map { it.single() }
        .toList()
    print(a.inc() == b && b.inc() == c)
}