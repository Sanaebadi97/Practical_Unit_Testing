package info.sanaebadi.practicalunittest

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ClientTest {
    val addressA = Address("Street A")
    val addressB = Address("Street Bl")

    @Test
    fun afterCreationShouldHaveNoAddress() {
        val client = Client()
        assertEquals(null, client.addresses?.size)
    }
}