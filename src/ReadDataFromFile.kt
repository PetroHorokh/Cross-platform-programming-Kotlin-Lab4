import java.io.IOException
import java.io.File

class ReadDataFromFile: Process {
    override fun execute(payments: MutableList<Payment>) {
        payments.clear()
        val fileName = "payments.txt"

        try {
            val lines: List<String> = File(fileName).readLines()
            lines.forEachIndexed { _, line ->
                val parts = line.split(", ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                    if (parts.size == 5) {
                        val lastName = parts[0]
                        val address = parts[1]
                        val serviceType = parts[2]
                        val paymentDate = parts[3]
                        val amount = parts[4].toDouble()

                        val payment = Payment(lastName, address, serviceType, paymentDate, amount)
                        payments.add(payment)
                    }
            }
        } catch (e: IOException) {
            System.err.println("Виникла помилка при зчитувані даних про оплати з файлу $fileName")
        }
    }
}