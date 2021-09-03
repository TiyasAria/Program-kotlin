package dasar

fun main(){
    val basmallah = "Bismillah"
    for (b in basmallah){
        println(b)
    }

    var kar1 = basmallah[0]
    var karLast = basmallah[8]
    var lastChar = basmallah.last()
    println(kar1)
    println(karLast)
    println(lastChar)

    /**  penggabungan 2 var string
     * bisa menggunakan tanda plus
     */
    var name = "tiyas" + 19
    var lanjutan = "Arias "

    println(name + ' ' + lanjutan)

//     memanggil var didalam string
    var n = "renz"
    n = "nadiaa"
    println(" $n  itu jumlah hurufnya adlah  ${n.length}")
}