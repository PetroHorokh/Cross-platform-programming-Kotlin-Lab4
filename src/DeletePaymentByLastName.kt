class DeletePaymentByLastName: Process {
    override fun execute(payments: MutableList<Payment>) {
        println("Введіть прізвище, за яким потрібно видалити оплати:")
        val lastName: String = readln()

        var found = false

        for (obj in payments) {
            if (obj.getLastName() == lastName) {
                payments.remove(obj)
                found = true
            }
        }

        if (!found) {
            println("Не було знайдено оплат з заданим прізвищем")
        }
    }
}