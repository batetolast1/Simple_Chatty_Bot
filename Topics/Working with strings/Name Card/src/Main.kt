fun main() {
    val (firstName, lastName) = generateSequence(::readLine)
        .take(2)
        .toList()
    print(generateShortName(firstName, lastName))
}

private fun generateShortName(firstName: String, lastName: String) = "${firstName.first()}. $lastName"