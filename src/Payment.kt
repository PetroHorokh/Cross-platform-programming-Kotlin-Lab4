class Payment(
    private var lastName: String,
    private var address: String,
    private var serviceType: String,
    private var paymentDate: String,
    private var amount: Double
)
{
    fun getLastName(): String { return lastName; }
    fun setLastName(lastName: String) { this.lastName = lastName; }
    fun getAddress(): String { return address; }
    fun setAddress(address: String) { this.address = address; }
    fun getServiceType(): String { return serviceType; }
    fun setServiceType(serviceType: String) { this.serviceType = serviceType; }
    fun getPaymentDate(): String { return paymentDate; }
    fun setPaymentDate(paymentDate: String) { this.paymentDate = paymentDate; }
    fun getAmount(): Double { return amount; }
    fun setAmount(amount: Double) { this.amount = amount; }

    override fun toString(): String {
        return "$lastName, $address, $serviceType, $paymentDate, $amount"
    }
}
