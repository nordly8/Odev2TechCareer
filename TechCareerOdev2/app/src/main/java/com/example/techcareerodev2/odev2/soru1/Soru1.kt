package com.example.techcareerodev2.odev2.soru1

// 1 - Parametre olarak girilen dereceyi Fahrenheit'e dönüştürdükten sonra geri döndüren bi method yazınız.

class Soru1  {

    fun soru1(derece  : Double ) : Double{
        val fahrenheit = derece * 1.8 + 32
        return fahrenheit
    }
}