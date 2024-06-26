class GetByServiceType: Process {
    override fun execute(payments: MutableList<Payment>) {
        println("Введіть тип сервісу для пошуку оплат:")
        val serviceType: String = readln()

        var found = false

        for (record in payments) {
            if (record.getServiceType() == serviceType) {
                found = true
                println(record.toString())
            }
        }

        if (!found) {
            println("Немає оплат за даним типом послуг.")
        }
    }
}