package function


fun toUpper (value : String ) : String = value.toUpperCase()
fun main() {
  /*
  structur dari lamda function
  variable -> tipe parameter -> nilai kembali -> deklarasi parameter
  isilambda
   */
    val contohLambda : (String,Int) -> String = { firtsName : String, umur : Int ->
        val result = "$firtsName $umur"
        // nilai kembali lambda ada di akhir baris //
        result
    }
    //menjalankan lambda //
    val result = contohLambda("Tiyas Aria", 18)
    println(result)

    /* kode it (untuk 1 parameter ) structurnya
variable-> tipe parameter -> nilai kembali -> isi dari it
     */
    val sayHii : (String) -> String ={
        "Hii $it"
    }
    println(sayHii("Tiyas aria"))

    // membuat lamda dari func yang sudah ada, first kita harus buat function dahulu diatas OOPKotlin.dasar.main
    val toUpperCase : (String) -> String = :: toUpper
    println(toUpperCase("tiyas cantik wkwkwk tapi boong :v"))
}
