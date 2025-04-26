fun main() {
    // 1. Adım: İç açılar toplamını hesapla
    val kenarSayisi = 5 // Örnek bir değer, bunu kullanıcıdan alabilirsiniz
    val icAcilarToplami = (kenarSayisi - 2) * 180
    println("İç açılar toplamı: $icAcilarToplami")

    // 2. Adım: Gün sayısına göre maaş hesaplama
    val gunSayisi = 20 // Örnek bir değer, bunu kullanıcıdan alabilirsiniz
    val calismaSaatiUcreti = 10.0
    val mesaiSaatiUcreti = 20.0
    val mesaiSiniri = 160

    val calismaSaati = gunSayisi * 8 // 1 günde 8 saat çalışılır
    val maas: Double
    val mesaiSaati: Int

    if (calismaSaati > mesaiSiniri) {
        mesaiSaati = calismaSaati - mesaiSiniri
        maas = (mesaiSiniri * calismaSaatiUcreti) + (mesaiSaati * mesaiSaatiUcreti)
    } else {
        mesaiSaati = 0
        maas = calismaSaati * calismaSaatiUcreti
    }

    println("Çalışma saati: $calismaSaati ₺")
    println("Mesai saati: $mesaiSaati ₺")
    println("Toplam maaş: $maas ₺")

    // 3. Adım: Kota miktarına göre geri dönüş hesaplama
    val kotaMiktari = 60 // Örnek bir değer, bunu kullanıcıdan alabilirsiniz (GB cinsinden)
    val birimFiyat = 100.0 / 50.0 // 50 GB = 100 ₺, yani 1 GB = 2 ₺
    val kotaAsimUcreti = 4.0 // 1 GB aşım için 4 ₺

    val kotaUcreti: Double
    if (kotaMiktari <= 50) {
        kotaUcreti = kotaMiktari * birimFiyat
    } else {
        val asimMiktari = kotaMiktari - 50
        kotaUcreti = (50 * birimFiyat) + (asimMiktari * kotaAsimUcreti)
    }

    println("Kota miktarı: $kotaMiktari GB")
    println("Kota ücreti: $kotaUcreti ₺")
}