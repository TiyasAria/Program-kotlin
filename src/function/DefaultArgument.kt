package function

fun hello(firstName: String, lastName : String = "aria"){
    println("Hello $firstName $lastName")
    /*
     default argumnet itu akan mengisi automatis di parameter nya ("") yang kosong ini
      gak usah di jelaskan isinya di parameternya karena nanti kebaca sendiri*/
}

fun hai( namaPertama : String, namaAkhir : String? = null){
    if (namaAkhir == null){
        println(" hii $namaPertama $namaAkhir")
    }else {
        println(" hii $namaPertama")
    }
}
fun main() {
    hello("Tiyas")
    hai("Tiyas", "Pratiwi")
    hai("aria")
    // REMEMBER FUN dasar.main gak boleh ada 2 dalam satu project, //

}