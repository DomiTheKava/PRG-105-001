//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val one: Int = 1
    val two: Int = 2
    val large: Int = 123
    val small: Int = 12

    println(add(one, two))
    println(subtract(two, one))
    println(multiply(two, small))
    println(divide(large, small))
    println(remainder(large, small))
}

fun add(a: Int, b: Int): String {
    return "$a + $b = ${ a + b }"
}

fun subtract(a: Int, b: Int): String {
    return "$a - $b = ${ a - b }"
}

fun multiply (a: Int, b: Int): String {
    return "$a * $b = ${ a * b }"
}

fun divide(a: Int, b: Int): String {
    return "$a / $b = ${ a / b }"
}

fun remainder(a: Int, b: Int): String{
    return "$a % $b = ${ a % b }"
}