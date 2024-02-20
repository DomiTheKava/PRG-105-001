import java.text.DecimalFormat

var totalDue = 0.0

fun main() {
    askInput()
}

fun askInput() {
    var count = 0
    while (true) {
        count++
        println("Enter '0' to see total.")
        println("Enter cost of item $count: ")
        try {
            val input = readln().toFloat()
            if (input.toInt() != 0) {
                totalDue += input
            } else { // done - print stuff
                val twoDigits = DecimalFormat("0.00")
                val taxes = totalDue * .025
                val totalAndTax = totalDue + taxes
                val tip = totalAndTax * 0.175

                print("taxes: \$${twoDigits.format(taxes)} \nTotal: \$${twoDigits.format(totalDue)}\nDue: \$${twoDigits.format(totalAndTax)} \nTotal with tip: \$${twoDigits.format(tip)}")

                break
            }
        } catch (ex: NumberFormatException) {
            println("please enter a valid number.")
            count--
        }

    }

}