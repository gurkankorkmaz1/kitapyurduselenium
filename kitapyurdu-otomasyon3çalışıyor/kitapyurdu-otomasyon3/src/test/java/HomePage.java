import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    By coksatanlaradresi = new By.ByXPath("//span[normalize-space()='Çok Satan Kitaplar']");
    By coksatankitaplarbekleme = new By.ByXPath("//a[normalize-space()='Çok Satan Kitaplar']");
    By coksatanedebiyat = new By.ByXPath("//strong[normalize-space()='Edebiyat']");
    public void ustunegel() {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(coksatanlaradresi);
        actions.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.elementToBeClickable(coksatanedebiyat));
    }
    By urunsayisi = By.id("sprite-cart-icon");
    private int sepettekiurunsayisi(){
        String urunmiktari = find(urunsayisi).getText();
        return Integer.parseInt(urunmiktari);
    }
    public boolean eklemekontrol() {
        return sepettekiurunsayisi() > 0;
    }

}
