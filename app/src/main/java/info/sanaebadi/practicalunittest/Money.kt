package info.sanaebadi.practicalunittest

data class Money(
    val amount: Int,
    val currency: String
) {

    override fun equals(obj: Any?): Boolean {
        if (obj is Money) {
            val (amount, currency) = obj
            return currency == currency && amount == amount
        }
        return false
    }
}
