fun main() {
    // write your code here
    val hour = readLine()!!
    val date = readLine()!!
    print("${hour.replace(" ", ":")} ${date.replace(" ", "/")}")
}