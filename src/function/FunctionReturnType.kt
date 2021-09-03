package function

fun sum ( a:Int, b:Int) : Int {
    val total = a + b
    return total

}
fun bagi ( a : Int, b : Int) : Int{
    val total = a % b
    return  total
}
fun spare(a:Int, b:Int) :Int{
    if (b == 0 ){
        return 0
    } else {
        val jumlah = a % b
        return jumlah
    }
}

fun main() {
    val result = sum(10,10)
    println(result)
    val hasil = bagi(10,3)
    println(hasil)
    println(spare(10,5))


}