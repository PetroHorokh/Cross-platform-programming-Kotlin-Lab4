class Payment(
    private var lastName: String,
    private var address: String,
    private var serviceType: String,
    private var paymentDate: String,
    private var amount: Double
)
{
    public fun getLastName(): String { return lastName; }
    public fun setLastName(lastName: String) { this.lastName = lastName; }
    public fun getAddress(): String { return address; }
    public fun setAddress(address: String) { this.address = address; }
    public fun getServiceType(): String { return serviceType; }
    public fun setServiceType(serviceType: String) { this.serviceType = serviceType; }
    public fun getPaymentDate(): String { return paymentDate; }
    public fun setPaymentDate(paymentDate: String) { this.paymentDate = paymentDate; }
    public fun getAmount(): Double { return amount; }
    public fun setAmount(amount: Double) { this.amount = amount; }

    override fun toString(): String {
        return "$lastName, $address, $serviceType, $paymentDate, $amount"
    }
}
