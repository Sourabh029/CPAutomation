import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Page12 {

    void page12Runner(WebDriver d) throws InterruptedException {
        Thread.sleep(5000);
        d.findElement(By.xpath("//*[@id=\"b1-b2-Icon3\"]")).click();

    }

    void openPage12(WebDriver d) throws InterruptedException {
        try
        {
            page12Runner(d);
        }
        catch (NoSuchElementException e)
        {
            openPage12(d);
        }
    }
}
