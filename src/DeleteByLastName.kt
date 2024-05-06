class DeleteByLastName: Process {
    override fun execute(payments: MutableList<Payment>) {
        println("Введіть прізвище, за яким потрібно видалити оплати:")
        val lastName: String = readln()

        var found = false

        var i = 0

        while (i < payments.size){
            if (payments[i].getLastName() == lastName) {
                payments.remove(payments[i])
                found = true
            }
            else{
                i++
            }
        }

        if (!found) {
            println("Не було знайдено оплат з заданим прізвищем")
        }
    }
}