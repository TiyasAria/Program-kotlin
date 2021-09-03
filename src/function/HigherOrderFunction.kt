package function

fun main() {
    /*
     nama function - parameter 1 - parameter 2 - input lambda - output lambda -
     nilai kembali function
     */
    fun hello(name : String, transformer : (String) -> String ): String {
        // body 
        val nameTransform = transformer(name)
        return "hii $nameTransform"
    }
    val lambdaUpper = {value : String -> value.toUpperCase()}
    println(hello("tiyas aria", lambdaUpper))
    //bisa langsung dimasukan lambda ke parameter functionnya
    println(hello("Tiyas Aria", {value : String -> value.toLowerCase()}))

    //jika parameter lambda nya ada diujung kanan, bisa dibuat seperti ini
    val result1 = hello("tiyas aria") {value : String ->
        value.toUpperCase()
    }
    val result2 = hello("tiyas aria") {value : String ->
        value.toLowerCase()
    }
    println(result1)
    println(result2)

}

