package branching

fun main() {
    val nilaiRaport = "Z"
    when (nilaiRaport) {
        "A" -> print("Nilai mu bagus diatas KKM")
        "B" -> print("Nilai mu sedangan pas KKM")
        "C" -> print("Nilai mu rendah dibawah KKM")
        "D" -> print("Nilai mu  sangat rendah dibawah KKM semangat belajar ya")
        else -> print(" wah kasihan gak dapet raport ya ")
    }

}