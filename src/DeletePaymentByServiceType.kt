class DeletePaymentByServiceType: Process {
    override fun execute(payments: MutableList<Payment>) {
        println("Введіть тип послуги, за яким потрібно видалити оплати:")
        val serviceType: String = readln()

        var found = false

        for (obj in payments) {
            if (obj.getServiceType() == serviceType) {
                payments.remove(obj)
                found = true
            }
        }

        if (!found) {
            println("Не було знайдено оплат з заданим типом послуг")
        }
    }
}