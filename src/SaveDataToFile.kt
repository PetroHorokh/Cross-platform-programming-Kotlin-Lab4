import java.io.BufferedWriter
import java.io.FileWriter
import java.io.IOException

class SaveDataToFile: Process {
    override fun execute(payments: MutableList<Payment>) {
        val filename = "payments.txt"

        try {
            val writer = BufferedWriter(FileWriter(filename))

            for (payment in payments) {
                writer.write(
                    payment.getLastName() + ", " +
                            payment.getAddress() + ", " +
                            payment.getServiceType() + ", " +
                            payment.getPaymentDate() + ", " +
                            payment.getAmount()
                )
                writer.newLine()
            }

            writer.close()
            println("Дані збережені у файл $filename")
        } catch (e: IOException) {
            System.err.println("Виникла помилка при записі даних про оплати у файл $filename")
        }
    }
}