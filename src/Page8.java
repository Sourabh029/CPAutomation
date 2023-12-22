import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Page8 {

    void page8Runner(WebDriver d) throws InterruptedException {
        Thread.sleep(5000);
        d.findElement(By.xpath("//*[@id=\"Input_AddressLine1\"]")).sendKeys("12 Imperial House");
        d.findElement(By.xpath("//*[@id=\"Input_City\"]")).sendKeys("Aberdeen");
        d.findElement(By.xpath("//*[@id=\"Input_PostalCode4\"]")).sendKeys("AB11 6PH");
        d.findElement(By.xpath("//*[@id=\"Input_PlaceOfBirth\"]")).sendKeys("London");

        WebElement nationality= d.findElement(By.xpath("//*[@id=\"NationalitiesDropdown\"]"));
        Select s2=new Select(nationality);
        s2.selectByValue("25");



        d.findElement(By.xpath("//*[@id=\"Bottom3\"]/div[2]/button")).click();


    }


    void openPage8(WebDriver d) throws InterruptedException {
        try {
            page8Runner(d);
        }
        catch (NoSuchElementException | InterruptedException e)
        {
            openPage8(d);
        }
    }
}
