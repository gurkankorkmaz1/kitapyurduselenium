import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Csdetay extends BasePage{
    public Csdetay(WebDriver driver) {
        super(driver);
    }
    By coksatankitaplarbekleme = new By.ByXPath("//a[normalize-space()='Çok Satan Kitaplar']");
    By coksatanedebiyat = new By.ByXPath("//strong[normalize-space()='Edebiyat']");

    public boolean ugonay() {
        return isDisplayed(coksatankitaplarbekleme);
    }

    public void edebiyattikla() {
        click(coksatanedebiyat);

    }
}
