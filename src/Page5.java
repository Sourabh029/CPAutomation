import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Page5 {


    void page5Runner (WebDriver d) throws InterruptedException {
        Thread.sleep(2000);
        d.findElement(By.xpath("//*[@id=\"Bottom4\"]/div/button")).click();
    }
    void openPage5(WebDriver d) throws InterruptedException {

        try {
            page5Runner(d);
        }
        catch (NoSuchElementException e)
        {
           openPage5(d);
        }
    }
}
