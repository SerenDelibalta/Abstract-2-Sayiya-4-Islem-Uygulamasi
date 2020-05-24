package final_uyg3;
public class Cikarma extends Hesap{
    @Override
    public int hesaplama() {
        return getSayi1()-getSayi2();//sayi1 ve sayi2 yi okuyup çıkarma işlemi yaptırıp bitiriyoruz
    }
}