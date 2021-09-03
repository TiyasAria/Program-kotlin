package latihan

fun main() {
 val uang = 100_000
    // val total = jajan("booba") + jajan("hotdog") + jajan("burger")
    // membuat ini memjadi banyak agar bisa diisi banyak
val total =jajan(arrayOf("booba", "pizza", "burger"))

    membayar(uang, total)
}

fun jajan(barangBarang : Array<String>) : Int {
    var totaljajan = 0
  for (barang in barangBarang)
      when (barang){
        "booba" ->  totaljajan  += 17_000
        "pizza" ->  totaljajan += 25_000
        "burger" -> totaljajan += 8_000
        "hotdog" ->  totaljajan += 12_000
        else ->  totaljajan += 0
          // mau ditambahin makanan lagi juga boleh
    }
    return totaljajan
}


fun membayar(uang : Int, total : Int){
    if (uang >= total) {
        val kembalian = uang - total
        println("uangnya cukup, kembalian = $kembalian")
    } else {
        println("maaf uang anda tidak cukup ")
    }

}