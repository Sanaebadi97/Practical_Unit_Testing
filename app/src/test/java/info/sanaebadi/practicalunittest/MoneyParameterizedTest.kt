package info.sanaebadi.practicalunittest

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MoneyParameterizedTest {

    lateinit var money: Money

    @Test
    internal fun constructorShouldSetAmountAnCurrency() {
        money = Money(10, "USD")

        assertEquals(10, money.amount)
        println("AMOUNT ${money.amount}")


        assertEquals("USD", money.currency)
        println("CURRENCY ${money.currency}")

        money = Money(20, "EUR")

        assertEquals(20, money.amount)
        println("CURRENCY ${money.amount}")

        assertEquals("EUR", money.currency)
        println("CURRENCY ${money.currency}")


    }
}