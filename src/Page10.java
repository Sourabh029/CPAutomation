import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Page10 {

    void page10Runner(WebDriver d) throws InterruptedException {
        Thread.sleep(5000);

        d.findElement(By.xpath("//*[@id=\"SummaryBoxCheckBox\"]")).click();
        d.findElement(By.xpath("//*[@id=\"TermsConsent\"]")).click();
        d.findElement(By.xpath("//*[@id=\"FSCSConsent\"]")).click();

        d.findElement(By.xpath("//*[@id=\"Btn\"]/button")).click();

    }

    void openPage10(WebDriver d)
    {
        try {
            page10Runner(d);
        }
        catch (NoSuchElementException e)
        {
            openPage10(d);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
