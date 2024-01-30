//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var userInput = 0

    do{
        println("Whats your favorite language?")
        println("1: Kotlin")
        println("2: Swift")
        println("3: Javascript")
        println("4: Spanish")
        println("5: Exit")
        userInput = readLine()!!.toInt()
        println("you selected: ${userInput}")

        when (userInput) {
            1 -> {
                println("You selected: Kotlin")
                break
            }
            2 -> {
                println("You selected: Swift")
                break
            }
            3 -> {
                println("You selected: Javascript")
                break
            }
            4 -> {
                println("You selected: Spanish")
                break
            }
            else -> {
                println("Invalid Entry. Please Try again.")
            }
        }
    } while (userInput != 5)


}