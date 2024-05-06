import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import java.util.*

class Post: Process {
    override fun execute(payments: MutableList<Payment>) {
        println("Введіть прізвище платника:")
        val lastName: String = readln()

        println("Введіть адресу платника:")
        val address: String = readln()

        println("Введіть вид послуги:")
        val serviceType: String = readln()

        var paymentDate: String

        do {
            println("Введіть дату (формат: рррр-мм-дд):")
            paymentDate = readln()
            if (Formatter.isValidDate(paymentDate)) {
                try {
                    val validator = DateTimeFormatter.ofPattern(Formatter.pattern)
                    val dateValidation = LocalDate.parse( paymentDate , validator)
                    if (Period.between(dateValidation, LocalDate.now()).years in 1..5) {
                        break
                    } else {
                        println("Дата мусить бути не пізніше поточного часу та не більше 5 років тому")
                    }
                } catch (e: DateTimeParseException) {
                    println("Дата не в правильному форматі")
                }
            }
        } while (true)

        var amount: Double

        do{
            try{
                println("Введіть суму оплати:")
                amount = readln().toDouble()
                break;
            }catch(e:Exception){
                println("Число не в правильному форматі")
            }
        }while(true);

        val record = Payment(lastName, address, serviceType, paymentDate, amount)
        payments.addFirst(record)
    }
}