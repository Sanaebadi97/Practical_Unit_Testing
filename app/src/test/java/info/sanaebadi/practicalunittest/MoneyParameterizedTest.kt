package info.sanaebadi.practicalunittest

import android.util.TimingLogger
import org.junit.Assert.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.params.ParameterizedTest
import org.junit.runners.Parameterized

@ExtendWith(TimingLogger::class)
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