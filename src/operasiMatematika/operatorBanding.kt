package operasiMatematika

fun main(){
    val a = 4
    val b = 6

    println("a > b is ${a > b}")
    println("a = b is ${a == b}")

    val nilai = 87
    if(nilai <= 90){
        println("You get Score A")
    } else if(nilai >= 75){
        println("You get Score B")
    } else {
        println("You dont get score")
    }
}