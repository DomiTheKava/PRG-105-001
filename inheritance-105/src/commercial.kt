/**
 * subclass Class commercial
 * @author Dominik Penkava
 * date: 3/5/24
 * @param
 * propertyName is the property name of commercial customer
 * multiProperty is an array of Doubles for added sqrft to be calculated
 */

import java.text.DecimalFormat

class Commercial (
    val propertyName: String,
    customerName: String,
    customerPhone: String,
    customerAddress: String,
    squareFootage: Double,
    val multiProperty: Array<Double> = emptyArray<Double>()
) : Customer(customerName, customerPhone, customerAddress, squareFootage) {

    // initialize variable's
    var estimate: Double? = null
    private var totalsqft: Double = squareFootage

    // initialize estimate
    init {
        calculate()
    }

    // calculates total costs
    private fun calculate() {
        if (multiProperty.isNotEmpty()) {
            for (p in multiProperty) {
                totalsqft += p
            }
            val discount = totalsqft / 0.9 // 10% discount
            estimate = (discount / 1000) * 5
        } else {
            // only one property
            estimate = (squareFootage / 1000) * 5
        }
    }

    // prints customer information along with estimate costs
    public fun printEstimate() {
        println("Name: $customerName")
        println("Phone Number: $customerPhone")
        println("Address: $customerAddress")
        println("Property Sqft: $squareFootage")
        var count = 2
        for (i in multiProperty) {
            println("Property $count Sqft: $i")
            count++
        }
        println("Total Estimate: $${DecimalFormat("0.00").format(estimate)}")
        println("Total square footage: $totalsqft")
    }

}

//A Commercial class which extends customer that has:
//Property name
//A constant commercial rate at $5 per 1000 square feet (a 10,000 sqft property will be charged $50 dollars per week)
//A multi-property field
//A method that calculates weekly charges, if they have multiple properties provide a 10% discount. -
//The method should display all information about the customer, the property, and the weekly charge.
