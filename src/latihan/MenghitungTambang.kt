
package latihan

fun main() {
    /*
    jumlahkan ada berapa emas dan ada berapa perak
     */
    //memakai val karena array nya gak berubah2 datahya
    val tambang = arrayOf("Emas", "Emas", "Perak",
            "Perak", "Zonk", "Perak",
            "Zonk", "Emas", "Perak")

    // membuat 2 variabel buat nampung total emas dan perak
    var emas = 0
    var perak = 0
    var zonk = 0

    for (barang in tambang) {
        // if else
        /*
        untuk di perulangan if kata emas harus = string yang sama , gak boleh beda
        besar kecilnya. contoh : If (brang == "emas")nah itu salah karena tidak sama
        dengan yang di val, ketika yang dival E nya kapital makan yg di if juga harus
        kapital
         */

       /* if (barang == "Emas") {
            //dimulai dari 0+1 = 1, 1+1=2, 2+1=3,
            emas += 1
        } else if (barang == "Perak") {
            perak += 1
        } else if (barang == "Zonk") {
            zonk += 1
        }
        */

         when (barang) {
        "Emas" -> emas++
          "Perak" -> perak++
        "Zonk" -> zonk++
       }
    }

    println("Total emas adalah :  $emas")
    println("Total perak adalah :  $perak")
    println("Total zonk adalah :  $zonk")
}