package function

fun String.hii() : String = "Hi :) $this"
fun String.printHii() : Unit = println("Hi hello :) $this")
fun main() {
    // hii
    val name = "Tiyas Aria"
    println(name.hii())
    //print hii
    name.printHii()
    "Pratiwi".printHii()
    "Rangga".printHii()

}