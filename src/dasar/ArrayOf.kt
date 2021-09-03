package dasar

fun main() {
    // berlaku untuk semua data ya gaiss
    val bahanUtamaSeblak = arrayOf("kerupuk", 14, false, 14.3, "sosis", "ayam")
    println(bahanUtamaSeblak[4])

    // berlaku untuk tipe data tertentu klau int berarti buat integer
 val jumlahPesananSeblak = intArrayOf(3,5,7,9,11)
    println(jumlahPesananSeblak[3])

    // berlaku untuk semua dan untuk menampilkan semua list
    val tipePesananSeblak = arrayListOf("pedes", 15, 12.8 )
    println(tipePesananSeblak)

}