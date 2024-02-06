//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var temp = 0.0

    println("Enter your Temperature:")
    temp = readLine()!!.toDouble()
    if (temp < 97.5)
        println("Cold")
    else if (temp <= 99.5)
        println("Normal")
    else if (temp > 99.5)
        println("hot")
    else
        println("Error")

}