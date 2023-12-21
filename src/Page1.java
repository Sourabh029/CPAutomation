import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page1 {

    public  void openPage1(WebDriver d) throws InterruptedException {
        Thread.sleep(10000);
        d.findElement(By.xpath("(//div[@class=\"LandingCardBtn\"]/button/span)[1]")).click();

    }


}
