import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Page7 {

    void openPage7(WebDriver d) throws InterruptedException {
        try {
            Thread.sleep(5000);
            d.findElement(By.xpath("//*[@id=\"Btn\"]/button")).click();
        } catch (NoSuchElementException e1 ) {
            Thread.sleep(5000);
            d.findElement(By.xpath("//*[@id=\"Btn\"]/button")).click();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
