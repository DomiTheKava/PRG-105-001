import java.awt.Rectangle
import kotlin.math.sqrt

var inMenu = true

fun main() {
    while (inMenu) {
        menu()
    }
}

fun menu() {
    // options - get user input
    var userInput: Int? = 0

    println("select from one of four options of shapes that they would like to get the area for")
    print("1: Rectangle\n")
    print("2: Circle\n")
    print("3: Triangle\n")
    print("4: Square\n")
    print("5: Exit\n")
    print(">>> ")
    try {
        userInput = readlnOrNull()!!.toInt()
    } catch (ex: NumberFormatException) {
        // do nothin
    }

    when (userInput) {
        1 -> rectangle()
        2 -> circle()
        3 -> triangle()
        4 -> square()
        5 -> exitProgram()
        else -> println("Please enter a number 1-5")
    }
}

fun rectangle() {
    try {
        println("Enter your rectangles length")
        print(">>> ")
        val lenX = readln().toInt()
        println("Enter your rectangles height")
        print(">>> ")
        val lenY = readln().toInt()

        val result = lenX * lenY
        println("Your rectangles area is: $result")
    } catch (ex: NumberFormatException) {
        println("Please enter a number")
        rectangle()
    }
}

fun circle() {

    try {
        println("Whats the radius of the circle?")
        print(">>> ")
        val radius = readln().toInt()

        val result = radius * 2 * 3.14159
        println("Your circles area is: $result")
    } catch (ex: NumberFormatException) {
        println("Please enter a number")
        circle()
    }
}

fun triangle() {
    try {
        println("Enter your Triangles base length")
        print(">>> ")
        val base = readln().toInt()
        println("Enter your Triangles height")
        print(">>> ")
        val height = readln().toInt()

        val result = (base.div(2)).times(height)
        println("Your triangles area is: $result")
    } catch (ex: NumberFormatException) {
        println("Please enter a number")
        triangle()
    }
}

fun square() {
    try {
        println("Enter your squares length")
        print(">>> ")
        val len = readln().toInt()

        val result = len * len
        println("Your squares area is: $result")
    } catch (ex: NumberFormatException) {
        println("Please enter a number")
        square()
    }
}

fun exitProgram() {
    println("Exiting program...")
    inMenu = false
}