import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class Page2 {


    public void openPage2(WebDriver d) throws InterruptedException {
        Thread.sleep(5000);
        d.findElement(By.xpath("//*[@id=\"Button\"]/button")).click();

    }


}
