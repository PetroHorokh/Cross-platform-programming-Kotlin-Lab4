class GetByAddress: Process {
    override fun execute(payments: MutableList<Payment>) {
        println("Введіть адресу для пошуку оплат:")
        val address: String = readln()

        var found = false

        for (record in payments) {
            if (record.getAddress().equals(address, ignoreCase = true)) {
                found = true
                println(record.toString())
            }
        }

        if (!found) {
            println("Немає оплат для введеної адреси.")
        }
    }
}