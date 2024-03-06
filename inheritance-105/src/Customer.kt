/**
 * Class Customer
 * @author Dominik Penkava
 * date: 3/5/24
 * @param
 * customorName is customers name
 * customerPhone is customers phone number
 * customorAddress is customers home address
 * square footage is customers square footage of lawn
 */

open class Customer (var customerName: String, var customerPhone: String, var customerAddress: String, var squareFootage: Double) {
    public fun printInfo() {
        println("Name: $customerName")
        println("Phone Number: $customerPhone")
        println("Address: $customerAddress")
        println("Square footage: $squareFootage")
    }
}

//String customerName
//String customerPhone
//String customerAddress
//double squareFootage