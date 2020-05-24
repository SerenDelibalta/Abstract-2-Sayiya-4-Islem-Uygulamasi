package final_uyg3;

//Hesap abstract sınıfı

public abstract class Hesap { //"Hesap" adında soyut sınıf
    private int sayi1,sayi2; // sayi1 ve sayi2 adında integer değişken tanımladım
   
    public abstract int hesaplama();   //"hesaplama" adında abstract metodumuz  
// get metotu ile değer döndürüyoruz
    public int getSayi1() {
        return sayi1;
    }
// set methodu ile değer giriyoruz
    public void setSayi1(int sayi1) {
        this.sayi1 = sayi1;
    }

// get metotu ile değer döndürüyoruz
    public int getSayi2() {
        return sayi2;
    }
// set methodu ile değer giriyoruz
    public void setSayi2(int sayi2) {
        this.sayi2 = sayi2;
    }    
    
}