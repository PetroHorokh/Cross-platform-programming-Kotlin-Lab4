import kotlin.system.exitProcess

fun main() {
    val payments: MutableList<Payment> = mutableListOf()

    var executor = ProcessExecutor(ReadDataFromFile())
    executor.executeOperation(payments)

    while (true) {
        println("Виберіть опцію:")
        println("1. Показати всі оплати")
        println("2. Показати оплати за адресою")
        println("3. Показати оплати за типом послуг")
        println("4. Показати оплати за прізвищем")
        println("5. Ввести нову оплату ")
        println("6. Оновити дані про оплати за типом послуг")
        println("7. Видалити оплати за прізвищем")
        println("8. Видалити оплати за типом послуг")
        println("9. Показати підсумок")
        println("10. Завантажити оплати з файлу")
        println("11. Зберегти оплати у файл")
        println("12. Вихід")

        print("Введіть операцію: ")
        val choice = readln().toInt()

        when (choice) {
            1 -> {
                executor = ProcessExecutor(GetAll())
                executor.executeOperation(payments)
            }

            2 -> {
                executor = ProcessExecutor(GetByAddress())
                executor.executeOperation(payments)
            }

            3 -> {
                executor = ProcessExecutor(GetByServiceType())
                executor.executeOperation(payments)
            }

            4 -> {
                executor = ProcessExecutor(GetByLastName())
                executor.executeOperation(payments)
            }

            5 -> {
                executor = ProcessExecutor(Post())
                executor.executeOperation(payments)
            }

            6 ->{
                executor = ProcessExecutor(PutPaymentsServiceType())
                executor.executeOperation(payments)
            }

            7 ->{
                executor = ProcessExecutor(DeleteByLastName())
                executor.executeOperation(payments)
            }

            8 ->{
                executor = ProcessExecutor(DeleteByServiceType())
                executor.executeOperation(payments)
            }

            9 ->{
                executor = ProcessExecutor(GetSummary())
                executor.executeOperation(payments)
            }

            10 ->{
                executor = ProcessExecutor(ReadDataFromFile())
                executor.executeOperation(payments)
            }

            11 ->{
                executor = ProcessExecutor(SaveDataToFile())
                executor.executeOperation(payments)
            }

            12 ->{
                executor = ProcessExecutor(SaveDataToFile())
                executor.executeOperation(payments)
                exitProcess(0)
            }

            else ->{
                println("Некоректний вибір. Спробуйте знову.")
            }
        }
    }
}