package dasar

fun main (){
    // integer number
    val age : Byte = 18
    val high  = 169
    val distance : Short = 2000
    val balance  = 100000000L
    println(age)
    println(high)
    println(distance)
    println ( balance)

    //float number
    val value = 98.98F
    val radius = 2727272.345
    println(value)
    println(radius)

    // conversion
    var umur = 150
    umur = 150

    val umur2  = umur.toByte()
    val short = umur.toShort()
    val long : Long = umur.toLong()
    val float : Float = umur.toFloat()
    val double : Double = umur.toDouble()

    println(umur2)
    println(short)
    println(long)
    println(float)
    println(double)

//     bernilai tetap
//    val name1 = " Tiyas"
//    val name1 = "Tiyas Aria"
//
//     var nilai bisa diubah ubah
    var myName = "Tiyas ARia "
    myName = " Tiyas Aria P "

    println(myName)





}