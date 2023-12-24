import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Page6 {

    void page6Runner(WebDriver d) throws InterruptedException {
        Thread.sleep(2000);
        d.findElement(By.xpath("//*[@id=\"Input_Email_OTP\"]")).sendKeys("123");
        d.findElement(By.xpath("//*[@id=\"Input_MobNum_OTP\"]")).sendKeys("123");
        d.findElement(By.xpath("//*[@id=\"Email\"]/div[2]/div[3]/button")).click();
        d.findElement(By.xpath("//*[@id=\"MobileNumber\"]/div[2]/div[3]/button")).click();
        d.findElement(By.xpath("//*[@id=\"Input_TextVar2\"]")).sendKeys("Test@123");
        d.findElement(By.xpath("//*[@id=\"Input_TextVar4\"]")).sendKeys("Test@123");
    }

    void openPage6(WebDriver d) throws InterruptedException {
        try {
            page6Runner(d);
        }
        catch (NoSuchElementException | InterruptedException e)
        {
            openPage6(d);
        }
    }
}
