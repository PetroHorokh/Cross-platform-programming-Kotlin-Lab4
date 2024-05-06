class GetAll: Process {
    override fun execute(payments: MutableList<Payment>) {
        println("Дані про оплати:")

        var found = false

        for (record in payments) {
            found = true
            println(record.toString())
        }

        if (!found) {
            println("Немає оплат.")
        }
    }
}