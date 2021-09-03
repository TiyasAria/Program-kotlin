package OOPKotlin

/**
GETTER SETTER
dari bahasanya , getter => mendapatkan data dari properties
setter => mengatur atau merubah data dr properties
 */
class Note (title: String) {
    var title = title
        /*
        get() = field
         set(value) {
             field = value
         }

         penulisan secara simple tanpa body
         */
        get() {
            println("call getter function ")
            return field
        }
        set(value) {
            println("call setter function ")
            if (value.isNotBlank()){
                field = value
            } else {
                println("invalid data ")
            }
        }
}

// Optional getter & setter , boleh menulis salah satu aja
class bigNote (val title: String){
    val bigTittle : String
        get() = title.toUpperCase()
    //tidak bisa si setter karena pakai val yg nilainya tetep
}



fun main() {
    val note= Note("belajar kotlin OOP")
    println(note.title) // untuk getter
    note.title = "" // untuk setter,
    val bigNote = bigNote("belajar kotlin kuh")
    println(bigNote.title)
    println(bigNote.bigTittle)

}