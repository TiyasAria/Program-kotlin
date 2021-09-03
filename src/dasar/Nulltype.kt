package dasar

fun main() {
////     ? (null- safety) artinmya boleh null / data boleh kosong
//    val nama : String?
//    var umur : String?
//    nama = "Tiyas"
//    umur = null
//    umur = "19"
//    println(nama)
//    println(umur)
//
//// safe call (?.)
//    val stringNull : String? = null
//    println(stringNull?.length)
//
////elvis operator
//    val text : String? = null
//    val textLength = text?.length ?: "Tiyas Aria"
//    println(textLength)

     var kosong : String? = null
    val kosongan : Int? = null
    val kekekosongan : Array<String>? = null


    kosong = " Tiyas aria"
    println(kosong)

    val name : String? = null

    if (name != null ){
        println(name.length)
    } else {
        println("no name")
    }

//     safe call
    println(name?.length)
//     elvis operator
    println(name?.length ?: "Aria")

    /**
     * berarti umur boleh diisi null (kosong) / value umurnya
     */
    var umur : Int? = 19

    if(umur != null){
        println(umur)
    } else{
        println("umur nnull")
    }

    println(umur)
    println(umur ?: 20)








}