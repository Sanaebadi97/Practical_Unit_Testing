package info.sanaebadi.practicalunittest

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ClientTest {
    val addressA = Address("StreetA")
    val addressB = Address("StreetB")

    @Test
    fun afterCreationShouldHaveNoAddress() {
        val client = Client()
        assertEquals(null, client.addresses?.size)
    }

    @Test
    fun shouldAllowToAddress() {
        val client = Client()
        client.addAddress(addressA)

        assertEquals(1, client.addresses?.size)
     //   assertTrue(client.addresses!!.contains<Any>(addressA))
    }


    @Test
    fun shouldAllowToAddManyAddresses(){
        val client = Client()
//        client.addresses(addressA)
//        client.addresses(addressB)
    }
}