// write your function here
fun isVowel(letter: Char) = letter.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u')

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
