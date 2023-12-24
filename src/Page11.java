import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Page11 {
    String accNo;
    void page11Runner(WebDriver d) throws InterruptedException {
        //Thread.sleep(1000);
        accNo =d.findElement(By.xpath("//*[@id=\"b3-Column2\"]/span")).getText();//*[@id="b3-Column2"]/span
        System.out.println(accNo);

    }

    String openPage11(WebDriver d) throws InterruptedException {
        try
        {
                   page11Runner(d);
        }
        catch (NoSuchElementException | InterruptedException e)
        {
            openPage11(d);
        }
        return accNo;
    }
}
