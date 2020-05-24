/* Soyut sınıflar soyut metotlar 2 sayıyı 4 işlem olan çarpma, bölme, topalam ve çıkarma işlemlerini
yapan içerisinde  "Bolme" , "Carpma", "Toplama", "Cıkarma" ve "Hesap" adında 5  class bulunan program
*/
package final_uyg3;
public class Final_Uyg3 {
    public static void main(String[] args) {
      Hesap topla = new Toplama(); //"topla" adında nesne oluşturdum"
        topla.setSayi1(5); //topla nesnesinde Sayi1 değişkenine 5 değerini atadım
        topla.setSayi2(10);//topla nesnesinde Sayi2 değişkenine 10 değerini atadım

        Hesap carp = new Carpma();//"carp" adında nesne oluşturdum"
        carp.setSayi1(240);//carp nesnesinde Sayi1 değişkenine 240 değerini atadım
        carp.setSayi2(3);//carp nesnesinde Sayi2 değişkenine 3değerini atadım
        
        // Direk olarak hesapla metoduna gönderip çıktılarını alıyoruö
        hesapla(topla);
        System.out.println(); //boşluk 
        hesapla(carp);
        System.out.println(); //boşluk 
        
        
        Cikarma cikar = new Cikarma(); //"cikar" adında nesne oluşturdum"
        cikar.setSayi1(20); //"cikar" nesnesinde Sayi1 değişkenine 20 değerini atadım
        cikar.setSayi2(17); //"cikar" nesnesinde Sayi2 değişkenine 17 değerini atadım
        hesapla(cikar); //hesapla metoduna gönderip çıktı alıyorum
        
        System.out.println(); //boşluk
        
        Bolme bolme = new Bolme(); //"bolme" adında nesne oluşturdum"
        bolme.setSayi1(50); //"bolme" nesnesinde Sayi1 değişkenine 50 değerini atadım
        bolme.setSayi2(2); //"bolme" nesnesinde Sayi2 değişkenine 2 değerini atadım
        hesapla(bolme);//hesapla metoduna gönderip çıktı alıyorum
    }

    
    // Her türlü hesaplamayı toplama,çıkarma vs farketmeksizin yapacaktır.
    public static void hesapla(Hesap hesap) {
        String islem = null;  //"islem" adında String boş değişken tanımaldım 
        if (hesap instanceof Toplama) {  // hesap toplama işlemine eşitse
            islem = "Toplama"; // işlem değişkenine "Toplama" değeri atanır
        } else if (hesap instanceof Cikarma) { // hesap çıkarma işlemine eşitse
            islem = "Çıkarma"; // işlem değişkenine "Çıkarma" değeri atanır
        } else if (hesap instanceof Carpma) { // hesap çarpma işlemine eşitse
            islem = "Çarpma";// işlem değişkenine "Çarpma" değeri atanır
        } else if (hesap instanceof Bolme) { // hesap bölme işlemine eşitse
            islem = "Bölme"; // işlem değişkenine "Bölme" değeri atanır
        }

        System.out.println(islem + "Sayı1 : " + hesap.getSayi1() + " Sayı2 : "
                + hesap.getSayi2() + " Sonuç : " + hesap.hesaplama());
        //işlem, sayi1 ve sayi2 değerlerinin yazdırır
    }
    }
    
