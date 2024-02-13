fun main() {
    val customerType: Boolean = typeOfUser() // true is residential, false is buisness
    val customerInfo: Array<String> = information(customerType)
    displayInfo(customerInfo, customerType)
}

fun displayInfo(info: Array<String>, typeofCustomer: Boolean) {
    println(" ")
    if (typeofCustomer) {
        println("Residential")
        for (i in info) {
            println(i)
        }
    } else {
        println("Business")
        for (i in info) {
            println(i)
        }
    }
}

fun information(type: Boolean): Array<String> {
    var phoneNumber = "000 000 0000"
    if (type) {
        // residential
        println("Enter your Contact Name")
        val contactName = readln()
        while (true) {
            try {
                println("Enter your Phone Number")
                phoneNumber = readln()
                var test = phoneNumber.toInt()
                break
            } catch (ex: NumberFormatException) {
                //
                println("Enter a phone number")
            }
        }
        val customerInfoStuff: Array<String> = arrayOf(contactName, phoneNumber)
        return customerInfoStuff
    } else {
        // business
        println("Enter your business's name")
        val buisName = readln()
        println("Enter your Contact Name")
        val contactName = readln()
        while (true) {
            try {
                println("Enter your Phone Number")
                phoneNumber = readln()
                var test = phoneNumber.toInt()
                break
            } catch (ex: NumberFormatException) {
                //
                println("Enter a phone number")
            }
        }
        val customerInfoStuff: Array<String> = arrayOf(contactName, phoneNumber, buisName)
        return customerInfoStuff
    }
}

fun typeOfUser(): Boolean {
    while (true) {
        println("What kind of customer are you?")
        println("1: residential")
        println("2: business")
        try {
            val input = readln().toInt()
            if (input == 1) {
                return true
            } else if (input == 2){
                return false
            } else {
                println("Enter 1 or 2")
            }

        } catch (ex: NumberFormatException) {
            // didnt enter an int
            println("Please enter either 1 or 2")
        }
    }
}