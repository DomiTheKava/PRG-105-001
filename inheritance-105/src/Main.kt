/**
 * Main
 * @author Dominik Penkava
 * date: 3/5/24
 */

fun main() {

    println("---------------") // separator

    val person = Commercial("mcdonalds", "Bob", "123123213", "address", 1000.0, arrayOf<Double>(1000.0, 3120.0))
    person.printEstimate()

    println("---------------") // separator

    val person2 = Residential("Richards Farm","John", "2232435132", "Knowhere Ln", 23000.0, true)
    person2.printEstimate()

    println("---------------") // separator
}

//The Main class that presents a menu to the user with the following options:
//Residential Customer
//Commercial Customer
//The Main class should have methods that get data entry from the user about the Residential -
// or Commercial customer and should display all of the information in the form of a quote.