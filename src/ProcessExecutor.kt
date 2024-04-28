class ProcessExecutor(private val operation: Process) {
    fun executeOperation(payments: MutableList<Payment>) {
        operation.execute(payments)
    }
}