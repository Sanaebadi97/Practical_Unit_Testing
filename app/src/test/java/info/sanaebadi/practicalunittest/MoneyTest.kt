package info.sanaebadi.practicalunittest

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MoneyTest {
    @Test
    internal fun constructorShouldSetAmountAnCurrency() {
        val money = Money(10, "USD")
        assertEquals(10, money.amount)

        println("AMOUNT ${money.amount}")

        assertEquals("USD", money.currency)
    }
}