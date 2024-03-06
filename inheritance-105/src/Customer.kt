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