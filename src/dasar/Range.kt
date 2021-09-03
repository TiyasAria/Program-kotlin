package dasar

fun main() {
    val number = 1..100
    val numberDownTo  = 1000 downTo 1
/*
 kenapa hasilnya cuman 1.. 100 , bukan urutan 1,2,3, dll karena range ini nanti berfungsi di looping
 jadi ini belum berfungsi samsek
 untuk down to sendiri itu berkebalik dari besar ke kecil
 */
    println(number)
    println(numberDownTo)
    // kalau count untuk menghitung semua jumlah bilangan dari range//
    println(number.count())
    /*
     untuk mencari di range tersebut apakah ada angka yang kita maksud yakni 24/224 klau ada pasti
     jawabannya true tapi klau gak ada pasti false
     */
    println(number.contains(24))
    println(number.contains(224))
    // syntax untuk menapilkan angka pertama dari range //
    println(number.first)
    // syntax untuk menampilkan angka terakhir dari range //
    println(number.last)
    // syntax untuk menampilkan angka berkelipatan //
    println(number.step)

    val numberStep =  100 downTo  1 step 5
    println(numberStep)
    val range2 = 80 downTo 5
    println(range2)



}
