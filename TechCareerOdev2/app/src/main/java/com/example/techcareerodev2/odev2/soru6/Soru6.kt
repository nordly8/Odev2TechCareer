package com.example.techcareerodev2.odev2.soru6

// 6 - Bir parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod yaazınız.
       // 1 günde 8 saat çalışılabilir.
       // Çalışma ücreti saati : 10 tl
       // Mesai saati ücreti 20 tl
       // 160 saat üzeri mesai sayılır.

class Soru6 {

    fun soru6(gunSayisi : Int)  :Int{

        var maas = 0
        val saat = 8
        val gunlukCalismaSaatUcreti  = 10
        val mesaiSaatiUcret = 20
        var toplamCalismaSaati = gunSayisi * saat
        var normalCalismaSaati = 0
        var ekCalismaSaati = 0


        for (i in 1..toplamCalismaSaati ){

            if (i <= 160 ){

                normalCalismaSaati++

            }
            if (i >= 161){

                ekCalismaSaati++
            }
        }
        maas = (normalCalismaSaati * gunlukCalismaSaatUcreti) + (ekCalismaSaati* mesaiSaatiUcret)
        return maas
    }

}