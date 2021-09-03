package dasar

fun main() {
    val firstName  = "Tiyas Aria"
    val lastName  = "Pratiwi"
     // var fullname : String = "tiyas aria pratiwi"
    // string tanda + untuk menggabungkan
  val fullName1  = firstName + " " + lastName // cara pertama
    val fullName = "$firstName $lastName " // cara kedua
    val desc = "Total = $fullName , Character ${fullName.length} "

    val address = """
        *Banaran RT 06, Suwatu
        *Tanon, Sragen Asri 
    """.trimMargin(  "*")

    println(firstName)
    println(lastName)
    println(fullName)
    println(fullName1)
    println(address)
    println(desc)
}
