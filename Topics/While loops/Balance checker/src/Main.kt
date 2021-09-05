fun main() {
    var totalBalance = readLine()!!.toInt()
    val purchases = readLine()!!.split(" ").map { it.toInt() }
    var isPaymentAllowed = true

    for (purchase in purchases) {
        if (totalBalance >= purchase) {
            totalBalance -= purchase
        } else {
            isPaymentAllowed = false
            print("Error, insufficient funds for the purchase. You have $totalBalance, but you need $purchase.")
            break
        }
    }

    if (isPaymentAllowed) {
        print("Thank you for choosing us to manage your account! You have $totalBalance money.")
    }
}