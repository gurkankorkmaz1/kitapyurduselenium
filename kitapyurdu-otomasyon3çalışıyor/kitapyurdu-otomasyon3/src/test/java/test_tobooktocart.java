import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
public class test_tobooktocart extends BaseTest {
    HomePage homePage;
    Csdetay csdetay;
    Edetay edetay;
    Ktdetay ktdetay;
    //çok satan kitaplar sekmesinin üzerine gel
    @Test
    @Order(1)
    public void coksatanlar(){
        homePage = new HomePage(driver);
        csdetay = new Csdetay(driver);
        homePage.ustunegel();
        Assertions.assertTrue(csdetay.ugonay(),
                "cok satanlara tıklayamadı"); //coksatanlar ve ustunegel i kontrol etmek için
    }
    @Test
    @Order(2)
    public void edebiyat(){
        edetay = new Edetay(driver);
        csdetay.edebiyattikla();
        Assertions.assertTrue(edetay.eonay(),
                "edebiyata tıklayamadı");
    }
    @Test
    @Order(3)
    public void kitapsec(){
        ktdetay = new Ktdetay(driver);
        edetay.kitabatikla();
        Assertions.assertTrue(ktdetay.ktonay(),
                "kitap seçemedi");
    }
    @Test
    @Order(4)
    public void sepeteEkle(){
        ktdetay.sepeteekle();
        Assertions.assertTrue(homePage.eklemekontrol(),
                "urun sepete eklenemdi");
    }
}
