class GetPaymentByLastName: Process {
    override fun execute(payments: MutableList<Payment>) {
        println("Введіть прізвище для пошуку оплат:")
        val lastName: String = readln()

        var found = false

        for (record in payments) {
            if (record.getLastName().equals(lastName, ignoreCase = true)) {
                found = true
                println(record.toString())
            }
        }

        if (!found) {
            println("Немає оплат для людини з таким прізвищем.")
        }
    }
}