package function
 fun printHello ( name : String?) : Unit {
     // unit itu extend yang bersifat kosong tidak memiliki data pengembaalian//
  if (name == "Tiyas"){
      println("Hello sis")
  } else {
      println("Hello $name")
  }
 }
fun main() {
    printHello("Tiyas")
    printHello(null)
    printHello("rangga")

}

