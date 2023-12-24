import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Page7 {

    void openPage7(WebDriver d) throws InterruptedException {
        try {
            //Thread.sleep(1000);
            d.findElement(By.xpath("//*[@id=\"Btn\"]/button")).click();
        } catch (NoSuchElementException | ElementClickInterceptedException e1 ) {
            Thread.sleep(2000);
            d.findElement(By.xpath("//*[@id=\"Btn\"]/button")).click();
        }


    }

}
