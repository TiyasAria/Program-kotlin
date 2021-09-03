package function
// varArgs itu variabel argumen//
// yang memakai array //
fun hitungTotal ( nilaiNilai : Array<Int> ) : Int {
var total = 0
    for (nilai in nilaiNilai){
        total += nilai
    }
    return total
}
// yang pakai varArg //
fun hitungTotal2 ( vararg nilaiNilai2 : Int) : Int {
    var total2 = 0
    for ( nilai2 in  nilaiNilai2){
        total2 += nilai2
        // total2 = total2 + nilai2
    }
    return total2
}
fun main() {
    // yang pakai array//
    val nilaiNilai = arrayOf(10,10,10,10)
    val hasil = hitungTotal(nilaiNilai)
    println(hasil)
    // yang pakai vararg //
    println(hitungTotal2(10,10,10,10,10))
}