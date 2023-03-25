package com.example.techcareerodev2.odev2.soru4

// 4 - Parametre olarak girlien kelime içinde kaç adet a harfi olduğunu gösteren bir metod yazınız.

class Soru4 {


    fun soru4 ( kelime :  String , harf: Char) : Int{

        var kacAdetHarf = 0

        for (i in kelime){

            if (i == harf){
                kacAdetHarf += 1
            }
        }

        return kacAdetHarf
    }

}