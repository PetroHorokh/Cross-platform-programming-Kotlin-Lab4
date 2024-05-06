class PutPaymentsServiceType: Process {
    override fun execute(payments: MutableList<Payment>) {
        println("Введіть тип послуг, який потрібно замінити в оплатах:")
        val serviceTypeToChange: String = readln()

        println("Введіть тип послуг, на який потрібно замінити застарілий:")
        val serviceTypeChange: String = readln()

        var found = false

        var i = 0

        while (i < payments.size){
            if (payments[i].getServiceType() == serviceTypeToChange) {
                payments[i].setServiceType(serviceTypeChange)
                found = true
            }
            i++
        }

        if (!found) {
            println("Не було знайдено оплат з заданим типом послуг")
        }
    }
}