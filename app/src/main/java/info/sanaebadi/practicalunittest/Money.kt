package info.sanaebadi.practicalunittest

data class Money constructor(
    val amount: Int,
    val currency: String
) {



    init {
        require(amount >= 0) { "Illegal amount :[$amount]" }
        require((currency == null || currency.isEmpty())) { "Illegal currency : [$currency]" }

    }

    override fun equals(obj: Any?): Boolean {
        if (obj is Money) {
            val (amount, currency) = obj
            return currency == currency && amount == amount
        }
        return false
    }
}
