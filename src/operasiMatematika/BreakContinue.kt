package operasiMatematika

fun main() {
    // syntax untuk break(menghentikan seluruh perulangan ) untuk memberhentikan while
 var i = 0
    while (true){
        println(" berhenti dong :) $i")
        i++ // DITAMBAH 1 perulangan lagi
        if (i > 10){
            break
        }
    }
    /*
     syntax untuk continue (menghentikan perulangan yang berjalan, langsung melanjutkan ke perulangan )
    selanjutnya  */

    for (i in 1..10){
        if (i % 2 == 0){
            // i angaka 1,2,3,,4,5,6,7,8,9,10
            continue
        }
        println("angka $i")
    }
}