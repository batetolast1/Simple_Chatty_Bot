fun main() {
    val numOfStudents = readLine()!!.toInt()
    var aGradeCount = 0
    var bGradeCount = 0
    var cGradeCount = 0
    var dGradeCount = 0

    repeat(numOfStudents) {
        when (readLine()!!) {
            "5" -> aGradeCount++
            "4" -> bGradeCount++
            "3" -> cGradeCount++
            "2" -> dGradeCount++
        }
    }

    print("$dGradeCount $cGradeCount $bGradeCount $aGradeCount")
}