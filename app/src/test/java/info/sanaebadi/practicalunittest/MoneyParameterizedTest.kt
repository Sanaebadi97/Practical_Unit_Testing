package info.sanaebadi.practicalunittest

import org.junit.Assert.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.runners.Parameterized
import java.lang.Exception
import kotlin.test.expect

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


    @ParameterizedTest
    @Parameterized.Parameters(name = "getMoney")
    internal fun constructorShouldSetAmountAnCurrency(
        amount: Int, currency: String
    ) {

        money = Money(amount, currency)

        assertEquals(amount, money.amount)
        println("AMOUNT ${money.amount}")


        assertEquals(currency, money.currency)
        println("CURRENCY ${money.currency}")


    }

    @Test(expect(Exception::class))
    fun shouldThrowExceptions() {
       //some implimention here which is expected
        // to throw an expected of Expetion class
    }
}