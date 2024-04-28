class PostPayment: Process {
    override fun execute(payments: MutableList<Payment>) {
        println("Введіть прізвище платника:")
        val lastName: String = readln()

        println("Введіть адресу платника:")
        val address: String = readln()

        println("Введіть вид послуги:")
        val serviceType: String = readln()

        println("Введіть дату оплати (формат: рррр-мм-дд):")
        val paymentDate: String = readln()

        println("Введіть суму оплати:")
        val amount: Double = readln().toDouble()

        val record = Payment(lastName, address, serviceType, paymentDate, amount)
        payments.addFirst(record)
    }
}