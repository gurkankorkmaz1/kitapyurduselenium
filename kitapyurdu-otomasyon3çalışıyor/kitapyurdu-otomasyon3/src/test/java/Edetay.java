import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Edetay extends BasePage{
    public Edetay(WebDriver driver) {
        super(driver);
    }
    By edebiyatonay = new By.ByXPath("//h1[contains(text(),'Çok Satanlar (Edebiyat, Haftalık)')]");
    By kitaplar = new By.ByClassName("product-cr");
    public boolean eonay() {
        return isDisplayed(edebiyatonay);
    }
    public void kitabatikla() {
        Random rand = new Random();
        int randomBook = rand.nextInt(tumkitaplar().size());
        tumkitaplar().get(randomBook).click();
    }
    private List<WebElement> tumkitaplar(){
        return findAll(kitaplar);
    }
}
