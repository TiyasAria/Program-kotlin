package dasar

fun main(){
   luasPersegiPanjang(3,4)
   luasPersegiPanjang(6,4)
    luasPersegiPanjang(panjang = 4, lebar = 3)
    var age : Byte = 19
    var height = 189
    var distance : Short = 10000
    var panjang = 300000000L

    println(age)
    println(height)
    println(distance)
    println(panjang)

    val nama = "Aria"
    salam(nama)
    val nameKu = "Natasha"
    salam(nameKu)


    salam("Tiyas")
    salam("Natasha")

}

fun luasPersegiPanjang( panjang : Int ,  lebar : Int ){
    val luas = panjang*lebar
    println("Luas persegi panjang adlah $luas")
}

fun salam(name : String){
    println("Assalamu'alaikum, $name")
}