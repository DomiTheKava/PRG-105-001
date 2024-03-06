import java.text.DecimalFormat

class Residential (
    val properyName: String,
    customerName: String,
    customerPhone: String,
    customerAddress: String,
    squareFootage: Double,
    var senior: Boolean = false
    ) : Customer(customerName, customerPhone, customerAddress, squareFootage) {

    // calculates total costs, gives 15% off discount if person is a senior
    private var estimate: Double? = null
    init {
        if (senior) {
            // 15% discount
            estimate = ((squareFootage / 1000) * 0.85) * 6
        } else {
            estimate = (squareFootage / 1000) * 6
        }
    }

    // prints customer information along with estimate costs
    public fun printEstimate() {
        println("Property name: $properyName")
        println("Name: $customerName")
        println("Phone Number: $customerPhone")
        println("Address: $customerAddress")
        println("Property Sqft: $squareFootage")
        println("Total Estimate: $${DecimalFormat("0.00").format(estimate)}")
    }

}

//A residential class which extends customer that has:
//A constant rate at $6 per 1000 square feet
//A senior field
//A method that calculates weekly charges, if the senior field is set to true then provide a 15% discount.
// //The method should display all information about the customer, the property, and the weekly charge.
