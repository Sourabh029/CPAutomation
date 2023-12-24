import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class Page2 {


    public void openPage2Driver(WebDriver d) throws InterruptedException {
        Thread.sleep(2000);
        d.findElement(By.xpath("//*[@id=\"Button\"]/button")).click();

    }

    void openPage2(WebDriver d) throws InterruptedException {
        try
        {
            openPage2Driver(d);
        }
        catch (NoSuchElementException | ElementClickInterceptedException e)
        {
            openPage2(d);
        }

    }


}
