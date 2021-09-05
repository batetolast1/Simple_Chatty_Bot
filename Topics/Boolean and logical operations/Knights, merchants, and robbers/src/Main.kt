fun main() {    
    val firstAnswer = readLine().toBoolean()
    val secondAnswer = readLine().toBoolean()
    val confession = readLine().toBoolean()
    val sameProfession = firstAnswer == secondAnswer
    println(sameProfession && !confession)
}