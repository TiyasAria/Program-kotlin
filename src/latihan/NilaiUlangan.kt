package latihan

fun main() {
    print("nilai ujian ayehsa adalah 100 maka : ")
    val nilaiUjian = 100
    val benar = true
    val salah = false
    if (nilaiUjian == 100) {
        println(benar)
    } else if  (nilaiUjian < 100) {
        println(salah)
    }
}