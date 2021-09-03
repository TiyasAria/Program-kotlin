package operasiMatematika

fun main() {
    // memiliki beberapa simbol klau simbolnya && (AND) kalau  || (OR) kalau ! (NOT/kebalikan)//
    val nilaiAkhir = 80
    val nilaiKehadiran = 70
    val nilaiExtra = 50

    val passNilaiAkhir = nilaiAkhir > 75 //true
    val passNilaiKehadiran = nilaiKehadiran > 75 //false
    val passNilaiExtra = nilaiExtra > 75 //false
    val pass = passNilaiAkhir || passNilaiKehadiran && passNilaiExtra
    // true OR false AND FALSE
    println(pass)

    val nilaiUjian = 90
    val nilaiAbsen = 80
    val nilaiEkstra = 55

    val apaLulusUjian = nilaiUjian > 70 // TRUE
    val apaLulusAbsen = nilaiAbsen > 70 // TRUE
    val apaLulusEkstra = nilaiEkstra > 60 //FALSE
    val apaLulus = apaLulusUjian && apaLulusAbsen && apaLulusEkstra
    // TRUE AND TRUE AND FALSE
    println(apaLulus)



}