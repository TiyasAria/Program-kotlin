package latihan

fun main() {
    /*
    latihan program
    1. program menerima input salah satu nama
    2. tentukan bule atau tidak
    3. tentukan asal negaranya
     */

    val orangJepang = arrayOf("naruto", "hinata", "sasuke", "sakura", "kakashi")
    val orangAmerika = arrayOf("justin", "edward", "angel", "jack", "billy")
    val orangIndonesia = arrayOf("sapri", "komeng", "andre", "paidi", "sri")

    //terima input user

    println("Masukan nama anda : ")
    val nama = readLine()

    when (nama) {
        in orangIndonesia -> {
                println("$nama bukan bule")
            println("Orang indonesia")
        }
        in orangAmerika -> {
            println("$nama asekk bule nihh")
            println("Orang amerika")
        }
        in orangJepang  -> {
            println("$nama bukan bule sih tapi lumayan ")
            println("Orang jepang")
        }
        else -> print("wah kasiaan gak tau warga negaranya yak wkwkwk")
    }
}



