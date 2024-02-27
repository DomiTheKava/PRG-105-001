fun main() {

    val employee1 = Employee("Dom", 1, 2)
    val employee2 = Employee("Laney", 2, 3)
    val employee3 = Employee("Tom", 3, 1)

    employee1.displayEmployeeInfo()
    employee2.displayEmployeeInfo()
    employee3.displayEmployeeInfo()

}

class Employee(var name: String?, var id: Int?, var shiftTime: Int?) {
    public fun displayEmployeeInfo() {
        println("""Employee ID: $id
            |Employee Name: $name
            |Employee Shift: $shiftTime
        """.trimMargin())
        println(" ") // new line
    }

}
