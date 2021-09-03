package function

fun biodata ( namaLengkap : String, umur : Int, alamat : String){
    println("haii $namaLengkap, $umur, $alamat")
}
fun main() {
    biodata(namaLengkap ="Tiyas aria Pratiwi", alamat = " Sragen ASRI", umur = 18)
   // biodata("Tiyas aria", 18,"Sragen ASRi")
    biodata(alamat = "Bogor",namaLengkap = "aria",umur = 18)
}