import org.w3c.dom.ranges.Range

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
var hotDawgStand = arrayOf(
    arrayOf<Any>("Hotdog", "Ketchup Bottles", "Pickle Jars", "Onion", "Buns"),
    arrayOf<Any>(100, 8, 200, 100, 100)
)

fun stockMenu() {

    val itemCount = hotDawgStand[0].size - 1
    var input = ""

    for (i in 0..itemCount) {
        println("${i + 1}: ${hotDawgStand[0][i]}, Stock: ${hotDawgStand[1][i]}")
    }

    println("Enter Number to edit Stock\nEnter 'back' to go to main menu.")
    try {
        input = readlnOrNull().toString()
    } catch (ex: Exception) {
        println("Please enter a valid response.")
    }

    if (input != "back") {
        try {
            val inputInt = input.toInt() - 1
            println("Enter amount of stock to add or remove '${hotDawgStand[0][inputInt]}'")
            val stockAmount = readlnOrNull()?.toInt()
            if (stockAmount != null){
                hotDawgStand[1][inputInt] = hotDawgStand[1][inputInt].toString().toInt() + stockAmount
            }
            println("'${hotDawgStand[0][inputInt]}' now set to ${hotDawgStand[1][inputInt]}")
        } catch (ex: NumberFormatException) {
            println("Please enter a valid number.")
        }
    }
}

fun addItem() {
    println("Enter name of item to add, or type 'back' to go to main menu: ")
    val name = readlnOrNull().toString()
    if (name != "back") {
        hotDawgStand[0] = hotDawgStand[0] + name
        var number = true
        println("Enter the amount of stock: ")
        while (number) {
            try {
                val stock = readln().toInt()
                hotDawgStand[1] = hotDawgStand[1] + stock
                println("Added $stock $name to stock")
                number = false
            } catch (ex: NumberFormatException) {
                println("Please enter a number")
            }
        }
    }
}
fun mainMenu(): Boolean{
    println("1: Add Item\n2: View/edit Stock\n3: exit program")
    val input = readlnOrNull()?.toInt()
    if (input == 1) {
        addItem()
    } else if (input == 2) {
        stockMenu()
    } else if (input == 3) {
        println("Exiting Program...")
        return false
    } else {
        println("Please enter a valid number.")
    }
    return true
}

fun main() {
    var breaker = true
    while (breaker) {
        breaker = mainMenu()
    }

}