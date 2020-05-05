package info.sanaebadi.practicalunittest

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(JUnitParamsRunner::class)
internal class MoneyParameterizedTest {

    lateinit var money: Money

    private val getMoney: Array<Any>
        get() = arrayOf(
            arrayOf<Any>(
                10, "USD"
            ), arrayOf<Any>(
                20, "EUR"
            )
        )


    @Test
    @ParameterizedTest
    @Parameterized.Parameters(method = "getMoney")
    internal fun constructorShouldSetAmountAnCurrency(
        amount: Int, currency: String
    ) {

        money = Money(amount, currency)

        assertEquals(amount, money.amount)
        println("AMOUNT ${money.amount}")


        assertEquals(currency, money.currency)
        println("CURRENCY ${money.currency}")


    }
}