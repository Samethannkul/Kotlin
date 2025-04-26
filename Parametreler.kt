package com.example.kotlinders1.odevler

fun main() {
    // 1. Fahrenheit'ı Celsius'a dönüştürme
    val fahrenheit = 98.6
    println("$fahrenheit Fahrenheit = ${fahrenheitToCelsius(fahrenheit)} Celsius")

    // 2. Dikdörtgenin çevresini hesaplama
    val uzunluk = 5
    val genislik = 3
    println("Uzunluk $uzunluk ve genişlik $genislik olan dikdörtgenin çevresi: ${dikdortgenCevresi(uzunluk, genislik)}")

    // 3. Faktöriyel hesaplama
    val sayi = 5
    println("$sayi sayısının faktöriyeli: ${faktoriyel(sayi)}")

    // 4. Kelime içinde 'a' harfi sayısını bulma
    val kelime = "aaaaaaa"
    println("'$kelime' kelimesinde ${aHarfiSayisi(kelime)} tane 'a' harfi var.")
}

// 1. Fahrenheit'ı Celsius'a dönüştüren metod
fun fahrenheitToCelsius(fahrenheit: Double): Double {
    return (fahrenheit - 32) / 1.8
}

// 2. Dikdörtgenin çevresini hesaplayan metod
fun dikdortgenCevresi(uzunluk: Int, genislik: Int): Int {
    return 2 * (uzunluk + genislik)
}

// 3. Faktöriyel hesaplayan metod
fun faktoriyel(sayi: Int): Long {
    if (sayi < 0) return 0 // Negatif sayılar için faktöriyel tanımlı değil
    if (sayi == 0 || sayi == 1) return 1
    var sonuc: Long = 1
    for (i in 2..sayi) {
        sonuc *= i
    }
    return sonuc
}

// 4. Kelime içinde 'a' harfi sayısını bulan metod
fun aHarfiSayisi(kelime: String): Int {
    var sayac = 0
    for (harf in kelime) {
        if (harf == 'a' || harf == 'A') { // Büyük-küçük harf duyarlılığı için
            sayac++
        }
    }
    return sayac
}