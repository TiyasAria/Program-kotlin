package latihan

fun main() {
    val alatSekolah = arrayOf("Buku Tulis", "Polpen", "Pensil",
                                            "Buku Tulis", "Buku Tulis", "Polpen",
                                            "Polpen", "Pensil", "Pensil")
 var Buku_Tulis = 0
 var Polpen = 0
 var Pensil = 0

    for (barang in alatSekolah) {
        when (barang) {
            "Buku Tulis" -> Buku_Tulis++
            "Polpen" -> Polpen++
            "Pensil" -> Pensil++
        }
    }
    println("Total buku tulis di sekolah adalah : $Buku_Tulis")
    println("Total polpen di sekolah adalah : $Polpen")
    println("Total pensil di sekolah adalah : $Pensil")
}
