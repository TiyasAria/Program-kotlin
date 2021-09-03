package OOPKotlin

class person {
    // membuat property dari OOPKotlin.person //
    var nama = ""
    var usia = 18
    // membuat method dari OOPKotlin.person //
    fun walk() {
println("aku sedang berjalan diatas awan :)")
    }
}

fun main () {
    // make a object
    val isi = person()
    isi.walk()
    // mau merubah isi
    isi.nama = " Tiyas "
    isi.usia = 18

    println("nama saya :" + isi.nama)
    println("umur saya :" + isi.usia)
}




