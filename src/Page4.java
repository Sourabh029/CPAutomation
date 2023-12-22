import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Page4 {

    WebDriver d;
    int lastCounter;

    public void set(int i)
    {
        this.lastCounter=i;
    }
    int phoneNo=100+lastCounter;

    public WebDriver getD() {
        return d;
    }

    public void setD(WebDriver d) {
        this.d = d;
    }

    public void openPage4Driver() throws InterruptedException {
        Thread.sleep(10000);
        WebElement dropdown= d.findElement(By.xpath("//*[@id=\"TitleList\"]"));
        Select s= new Select(dropdown);
        s.selectByValue("4");
        d.findElement(By.xpath("//*[@id=\"Input_TextVar13\"]")).sendKeys("Testing");
        d.findElement(By.xpath("//*[@id=\"Input_TextVar14\"]")).sendKeys("Auto"+lastCounter);
        d.findElement(By.xpath("//*[@id=\"Day\"]")).sendKeys("10");
        d.findElement(By.xpath("//*[@id=\"Month\"]")).sendKeys("10");
        d.findElement(By.xpath("//*[@id=\"Year\"]")).sendKeys("2000");
        d.findElement(By.xpath("//*[@id=\"Input_TextVar15\"]")).sendKeys("stagetestautomation"+lastCounter+"@test.com");
        d.findElement(By.xpath("//*[@id=\"Input_TextVar17\"]")).sendKeys("+447123456"+phoneNo);
        // d.findElement(By.xpath("//*[@id=\"Input_TextVar17\"]")).sendKeys("+447123456789");
        d.findElement(By.xpath("//*[@id=\"Bottom3\"]/div[2]/button")).click();

    }

    void openPage4() throws InterruptedException {
        try {
            openPage4Driver();
        }
        catch (NoSuchElementException | InterruptedException e)
        {
            openPage4();
        }
    }



}
