package final_uyg3;
public class Toplama extends Hesap{
    /* Setter Getterları Abstract metod olmadıkları için
    Override etme zorunluluguz yok.Fakat hesaplama() metodunun var çünkü o abstract metod. */

    //Abstract tanımlanmış metotlar Override etmemiz zorunludur.
    @Override
    public int hesaplama() {
        return getSayi1()+getSayi2(); //sayi1 ve sayi2 yi okuyup toplama işlemi yaptırıp bitiriyoruz
    }
}