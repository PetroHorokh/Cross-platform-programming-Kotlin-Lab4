import kotlin.system.exitProcess

class EndProcess: Process {
    override fun execute(payments: MutableList<Payment>) {
        exitProcess(0)
    }
}