package function

fun sayHello (firstName:  String, lastName: String?){
    if (lastName == null )
        println("namaku $firstName")
    else {
        println("namaku $firstName $lastName")
    }
}
// yang firstname dan lastname itu namanya parameter , parameter itu gak wajib //

fun main() {
    sayHello("Tiyas", null)
    sayHello("Tiyas", "aria")
// namun ketika memakai paramater maka harus mengisi data dari parameternya"//

}