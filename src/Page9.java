import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Page9 {

    void page9Runner(WebDriver d) throws InterruptedException {
        Thread.sleep(5000);

        d.findElement(By.xpath("//*[@id=\"Input_SortCode\"]")).sendKeys("400551");
        d.findElement(By.xpath("//*[@id=\"Input_Amount3\"]")).sendKeys("12345674");

        d.findElement(By.xpath("//*[@id=\"Input_Amount\"]")).sendKeys("100");

        d.findElement(By.xpath("//*[@id=\"Bottom\"]/div/button")).click();

    }

    void openPage9(WebDriver d) throws InterruptedException {
        try
        {
            page9Runner(d);
        }
        catch (NoSuchElementException e)
        {
            openPage9(d);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
