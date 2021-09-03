package latihan

fun main() {
    val uang = 50_000
    val total = belanja("Gemblong") + belanja("Capcin") + belanja("Dadargulung")

    bayar(uang, total)
}

fun belanja(item: String) : Int{
    return when (item){
        /*
        kenapa pakai return karena ada data yang dikembalikan yakni (:int)
         */
        "Gemblong" -> 5000
        "Dadargulung" -> 4000
        "Es Buah" -> 6000
        "Capcin" -> 6000
        else -> 0
    }
}

fun bayar(uang : Int, total : Int){
    if (uang >= total){
        val kembalian = uang - total
        println("uangnya cukup, kembaliannya = $kembalian")
    } else {
        println("Mohon Maaf , uang nya gak cukup silahkan kemali esok lagi ")
    }
}
