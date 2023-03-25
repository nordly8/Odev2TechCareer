package com.example.techcareerodev2.odev2.soru3

// 3 - Parametre olarak girilen sayının faktöriyel değreini hesaplayıp geri döndüren metodu yazınız.

class Soru3 {
    var faktoriyel  = 1

    fun soru3( sayi3 : Int) : Int  {

           for(sayi in faktoriyel..sayi3 ){
                faktoriyel = faktoriyel * sayi

        }
        return faktoriyel
    }
}