import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Page3 {


    public void openPage3(WebDriver d) throws InterruptedException {

        try {
            Thread.sleep(5000);
            d.findElement(By.xpath("//*[@id=\"Btn\"]/button")).click();
        }
        catch (NoSuchElementException e)
        {
            Thread.sleep(5000);
            d.findElement(By.xpath("//*[@id=\"Btn\"]/button")).click();
        }

    }

}
