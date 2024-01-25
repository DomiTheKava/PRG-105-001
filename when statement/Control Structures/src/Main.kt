import kotlin.system.exitProcess

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    var numEntered = 0

    while (true) {
        print("Enter a number between 1 and 10 to translate to italian: ")
        try {
            numEntered = readln()!!.toInt()
            when (numEntered) {
                1 -> {
                    println("1 is uno")
                    break
                }
                2 -> {
                    println("2 is due")
                    break
                }
                3 -> {
                    println("3 is tre")
                    break
                }
                4 -> {
                    println("4 is quattro")
                    break
                }
                5 -> {
                    println("5 is cinque")
                    break
                }
                6 -> {
                    println("6 is sei")
                    break
                }
                7 -> {
                    println("7 is sette")
                    break
                }
                8 -> {
                    println("8 is otto")
                    break
                }
                9 -> {
                    println("9 is nove")
                    break
                }
                10 -> {
                    println("10 is dieci")
                    break
                }
                else -> {
                    println("Not a valid number!")
                    continue
                }



            }

        } catch (ex: Exception) {
            println("error")
        }

    }

}