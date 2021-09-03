package latihan

fun main() {
    val quantitykelas = 20
    when {
        quantitykelas == 20 -> {
            println("Kelas penuh")
        }
        quantitykelas > 20 -> {
            println("Maaf kelas penuh")
        }
        quantitykelas < 20 -> {
            println("kelas tersedia")
        }
    }

    val jumlahSiswa = 28
    when {
        jumlahSiswa == 20 -> {
            println("Kelas penuh")
        }
        jumlahSiswa > 20 -> {
            println("Maaf kelas penuh")
        }
        jumlahSiswa < 20 -> {
            println("kelas tersedia")
        }
    }

    val kuantitasKelas = 18
    when {
        kuantitasKelas == 20 -> {
            println("Kelas penuh")
        }
        kuantitasKelas > 20 -> {
            println("Maaf kelas penuh")
        }
        kuantitasKelas < 20 -> {
            println("kelas tersedia")
        }
    }
}
