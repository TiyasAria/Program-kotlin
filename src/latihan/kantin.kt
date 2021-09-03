package latihan

fun main() {
    // buatlah isi kantin dengan lambda func
    val menu = arrayListOf("bakso", "soto","pop mie", "mie ayam", "nasi goreng")
    val menukantin : (String) -> String = {"Menu di kantin ini ada $it"}
    println(menukantin("$menu"))
}
