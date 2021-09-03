package dasar

const val Application = "Kotlin basic Programming"
const val VERSION = "1.0.1"
/* ditulis uppercase(variabelnya) hanya untuk pengenal bahwa itu const val ajjah
bersifat immutable data , bersifat global (bisa diakses dimanapun)
 */

fun main() {
    println("welcome to the $Application and version $VERSION")
    var firstName  = "tiyas"
    var lastName : String  = "aria"
    lastName = "Tiyas Aria Pratiwi"
    println(lastName)
    /* untuk deklarasi tipe data sendiri itu opsional jadi gak wajib
jadi gak harus ditulis kayak yang baris ke 4
     */
    // var bisa diubah, sedang val gak bisa diubah jadi bakal error nanti
val namaDepan = "tiyas"
    val umur = 18
    println(namaDepan)
    println(umur)
    println(Application)
    println(VERSION)
}