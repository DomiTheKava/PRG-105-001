//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var correct: Int = 0
    correct += askQuestion("What is the capital of France?", "Paris")
    correct += askQuestion("Who wrote \"Hamlet\"?", "Shakespeare")
    correct += askQuestion("What is the chemical symbol for oxygen?", "O")
    correct += askQuestion("In which galaxy is Earth located?", "Milky Way")
    correct += askQuestion("What is the currency of Japan?", "Yen")

    println("You answered ${correct} correctly! congratulations!")
}

fun askQuestion(question: String, answer: String): Int {
    println(question)
    val userInput = readlnOrNull().toString()
    if (userInput.contains(answer, ignoreCase = true)) {
        return 1
    }
    return 0

}