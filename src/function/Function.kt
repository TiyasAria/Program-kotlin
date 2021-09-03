package function

fun namaFunction(nama : String) : String {
return "Hello" + nama + "!"

    /**fun namafunction memiliki parameter yang bertipe data
     string dan isi dari fun namafunction akan menjadi string **/
    /** return itu dipake saat sebuah funtion memiliki parameter dan return itu sendiri
    memiliki arti mengembalikan nilai ke function
     **/
}

fun sayHello(nama: String){
    println("hai $nama ")
}
fun main(){
    // function utama yang akan menampilkan
println(namaFunction("world"))
    println(sayHello("tiyas "))

}