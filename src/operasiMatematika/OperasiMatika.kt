package operasiMatematika

fun main() {
    val result1 = 10%3
    val result2 = 10 + 10 / 2
    println(result1)
    println(result2)
val resultDouble = 10.0 / 3.0
    println(resultDouble)
    // syntax untuk total penjumlahan  dan pengurangan aritmatika
 var total = 0
    val barang1 = 100
    val barang2 = 50
    val barang3 = 75
    total += barang1
    //total = total + barang1
    // total saat ini 100
    total += barang2
    // total sekrng 150
    total += barang3
    // total menjadi 225
    println(total)

    var total2 = 1_000
    val uangMami = 200
    val uangPapi = 500
    total2 -= uangMami
    // total menjadi 800
    total2 -= uangPapi
    // total menjadi 300
    println(total2)

/*
 unary operator contohnya tanda ++ artinya akan menambah kelipatan 1 kalau -- akan mengurangi kelipatan
 satu
 */
    total2++
    total2++
    total2++
    println(total2)

    total2--
    total2--
    println(total2)
// example from min and !(bersifat berkebalikan dengan boolean nya )
    val suhu = -6
    val sehat = true
    println(suhu)
    println(!sehat)

}