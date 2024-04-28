class PutPaymentsServiceType: Process {
    override fun execute(payments: MutableList<Payment>) {
        println("Введіть тип послуг, який потрібно замінити в оплатах:")
        val serviceTypeToChange: String = readln()

        println("Введіть тип послуг, на який потрібно замінити застарілий:")
        val serviceTypeChange: String = readln()

        var found = false

        for (obj in payments) {
            if (obj.getServiceType() == serviceTypeToChange) {
                obj.setServiceType(serviceTypeChange)
                found = true
            }
        }

        if (!found) {
            println("Не було знайдено оплат з заданим типом послуг")
        }
    }
}