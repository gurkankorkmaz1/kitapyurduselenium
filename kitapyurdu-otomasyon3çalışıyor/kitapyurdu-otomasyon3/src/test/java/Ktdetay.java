import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Ktdetay extends BasePage{
    public Ktdetay(WebDriver driver) {
        super(driver);
    }
    By sepeteeklebutonu = new By.ByXPath("//span[normalize-space()='Sepete Ekle']");
    By sepeteeklemebasarili = new By.ByClassName("swal2-success-line-long"); //swal2-success-line-long  swal2-succes-ring
    public boolean ktonay() {
        return isDisplayed(sepeteeklebutonu);
    }
    public void sepeteekle() {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(sepeteeklebutonu);
        actions.click(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(sepeteeklemebasarili));
    }
}
