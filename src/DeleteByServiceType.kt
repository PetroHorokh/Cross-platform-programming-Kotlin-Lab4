class DeleteByServiceType: Process {
    override fun execute(payments: MutableList<Payment>) {
        println("Введіть тип послуги, за яким потрібно видалити оплати:")
        val serviceType: String = readln()

        var found = false

        var i = 0

        while (i < payments.size){
            if (payments[i].getServiceType() == serviceType) {
                payments.remove(payments[i])
                found = true
            }
            else{
                i++
            }
        }

        if (!found) {
            println("Не було знайдено оплат з заданим типом послуг")
        }
    }
}