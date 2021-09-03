package function

fun main() {
    //looping
    fun factorialLoop (value: Int) : Int{
        var result = 1
        //perulangan
        for (nilai in value downTo 1){
            result *= nilai
        }
        return result
    }
    println(factorialLoop(10)) //10x9x8x7 smapai 1

    //recursive function
    fun factorialRecursive (value : Int ) : Int{
        return when(value){
            1 -> 1
            else -> value * factorialRecursive(value-1)
        }
    }
    println(factorialRecursive(10))
}