package latihan

fun main() {
    val golonganA = arrayOf("siti", "zubaidah", "anggun", "irma", "bisma")
    val golonganB = arrayOf("sumayyah", "ruqayyah", "khadijah", "aisyah", "muhammad")
    val golonganO = arrayOf("tiyas", "aria", "pratiwi", "ridho", "ani")

 do {
    println("masukan nama anda : ")
    val nama = readLine()
     when (nama) {
         in golonganA -> println("$nama bergolongan darah A ")
         in golonganB -> println("$nama bergolongan darah B ")
         in golonganO -> println("$nama bergolongan darah O ")
         else -> println("tidak memeliki golongan darah wkwkw")
     }
 } while (nama != null)
}