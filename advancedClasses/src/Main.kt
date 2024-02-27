fun main() {
    var emp1 = Employee("Jane Doe", PositionTitle.Administration, false, 27.00, 1);
    var emp2 = Employee("Larry Jackson", PositionTitle.Production, true, 22.00, 2);
    var emp3 = Employee("John Smith", PositionTitle.Maintenance, false, 21.00, 3);

    emp1.display();
    emp1.calculate(45);
    println()
    emp2.display();
    emp2.calculate(50);
    println()
    emp3.display();
    emp3.calculate(35);
}

// employee class
class Employee(var name: String, var position: PositionTitle, var salary: Boolean, var payRate: Double, var shift: Int) {
    fun calculate(hoursIn: Int) {
        // do they get paid?
        if (salary) {
            // bonus pay for overtime
            var overTimeBonus = 0.0
            if (hoursIn > 40) {
                val overTimeHours = hoursIn - 40
                overTimeBonus = (overTimeHours * payRate) * 0.5
            }

            // calculate and return pay
            var pay = ((hoursIn * payRate) + overTimeBonus)

            // bonus pay for 1st and 2nd shift
            if (shift == 2) {
                pay = pay + (pay * 0.05)
            } else if (shift == 3) {
                pay = pay + (pay * 0.05)
            }

            println(name + " earned $" + pay + " this week.")
        } else {
            // they didnt get paid...
            println(name + "Does not get paid because he does not have a salary. (salary is false)")
        }
    }

    fun display() {
        println("Name: " + name)
        println("Position: " + position)
        println("Pay Rate: " + payRate)
    }
}

// job titles
enum class PositionTitle(title: String){
    Administration("Administration"),
    Production("Production"),
    Sales("Sales"),
    Maintenance("Maintenance"),
    Technical("Technician"),
    Secretarial("Secretary")
}