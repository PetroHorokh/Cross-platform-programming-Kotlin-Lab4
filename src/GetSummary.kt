import java.util.HashMap

class GetSummary: Process {
    override fun execute(payments: MutableList<Payment>) {
        if (payments.isEmpty()) {
            println("Немає даних про оплату.")
            return
        }

        val summary: MutableMap<String, Double> = HashMap()

        for (record in payments) {
            val serviceType = record.getServiceType()
            val amount = record.getAmount()

            if (summary.containsKey(serviceType)) {
                summary[serviceType] = summary[serviceType]!! + amount
            } else {
                summary[serviceType] = amount
            }
        }

        println("Вид послуги, Сума")
        for ((key, value) in summary) {
            println("$key, $value")
        }
    }
}