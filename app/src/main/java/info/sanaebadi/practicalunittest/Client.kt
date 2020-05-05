package info.sanaebadi.practicalunittest

data class Client(val addresses: List<String>? = null) {

    constructor() : this(arrayListOf("StreetA"))


    fun addAddress(addressName: Address) {

    }

}