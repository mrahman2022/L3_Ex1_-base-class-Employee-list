open class Employee(
    protected val name: String,
    protected val baseSalary: Double
) {
    open fun calculateSalary(): Double {
        return baseSalary
    }
}

class FullTimeEmployee(
    name: String,
    baseSalary: Double,
    private val bonus: Double
) : Employee(name, baseSalary) {

    override fun calculateSalary(): Double {
        return baseSalary + bonus
    }
}

class PartTimeEmployee(
    name: String,
    private val hourlyRate: Double,
    private val hoursWorked: Int
) : Employee(name, 0.0) {

    override fun calculateSalary(): Double {
        return hourlyRate * hoursWorked
    }
}

fun main() {
    val employees = mapOf(
        "John (Full-Time)" to FullTimeEmployee("John", 3000.0, 600.0),
        "Sara (Part-Time)" to PartTimeEmployee("Sara", 20.0, 80),
        "Mike (Full-Time)" to FullTimeEmployee("Mike", 2800.0, 400.0),
        "Anna (Part-Time)" to PartTimeEmployee("Anna", 18.0, 70)
    )

    for ((label, employee) in employees) {
        println("$label Salary: ${employee.calculateSalary()}")
    }
}
