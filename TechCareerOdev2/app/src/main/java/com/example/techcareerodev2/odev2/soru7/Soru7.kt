package com.example.techcareerodev2.odev2.soru7

// 7 - Parametre olarak girilen kota miktarına göre ücreti hesaplayan ve geri döndüren metodu yazınız.
    // 50 gb 100 tl
    //kota aşımından sonra her 1 gb 4 tl


class Soru7 {



    fun soru7(kotaMiktari : Int) : Int{

        var netPara = 100
        val kota = 50
        var asilanUcret = 0
        val asilanKota = kotaMiktari - kota

        for (i in 1..asilanKota){

            asilanUcret +=4
        }

        netPara += asilanUcret
        return netPara

    }


}