import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class Creation {


    public String runner(int i) throws InterruptedException, IOException {
        int lastNameCounter = i;

        System.setProperty("webdriver.chrome.driver", "E:\\Programing\\Sellenium\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver d = new ChromeDriver();

        d.get("https://stage.portal.gbbdev.co.uk/Registration/");
        //*[@id="l1-2_1-LandingCard"]/div[4]/button
        //*[@id="l1-2_0-LandingCard"]/div[4]/button
        //d.findElement(By.className("btn LandingBtn")).click();
        d.manage().window().maximize();
        //*[@id="Btn"]/button

        //Page1
        Page1 page1 = new Page1();
        Page2 page2 = new Page2();


        try {
            page1.openPage1(d);
        } catch (NoSuchElementException e) {
            page1.openPage1(d);
        }

        try {
            page2.openPage2(d);
        } catch (NoSuchElementException e)
        {
            page2.openPage2(d);
        }



        //Page3
        Thread.sleep(5000);
        d.findElement(By.xpath("//*[@id=\"Btn\"]/button")).click();


        //Page4
        Thread.sleep(10000);
        WebElement dropdown= d.findElement(By.xpath("//*[@id=\"TitleList\"]"));
        Select s= new Select(dropdown);
        s.selectByValue("4");
        d.findElement(By.xpath("//*[@id=\"Input_TextVar13\"]")).sendKeys("Testing");
        d.findElement(By.xpath("//*[@id=\"Input_TextVar14\"]")).sendKeys(""+lastNameCounter);
        d.findElement(By.xpath("//*[@id=\"Day\"]")).sendKeys("10");
        d.findElement(By.xpath("//*[@id=\"Month\"]")).sendKeys("10");
        d.findElement(By.xpath("//*[@id=\"Year\"]")).sendKeys("2000");
        d.findElement(By.xpath("//*[@id=\"Input_TextVar15\"]")).sendKeys("stagetest010"+lastNameCounter+"@test.com");
        d.findElement(By.xpath("//*[@id=\"Input_TextVar17\"]")).sendKeys("+447123456789");
        // d.findElement(By.xpath("//*[@id=\"Input_TextVar17\"]")).sendKeys("+447123456789");
         d.findElement(By.xpath("//*[@id=\"Bottom3\"]/div[2]/button")).click();
        Thread.sleep(5000);
        d.findElement(By.xpath("//*[@id=\"Bottom4\"]/div/button")).click();
        Thread.sleep(8000);
        d.findElement(By.xpath("//*[@id=\"Input_Email_OTP\"]")).sendKeys("123");
        d.findElement(By.xpath("//*[@id=\"Input_MobNum_OTP\"]")).sendKeys("123");
        d.findElement(By.xpath("//*[@id=\"Email\"]/div[2]/div[3]/button")).click();
        d.findElement(By.xpath("//*[@id=\"MobileNumber\"]/div[2]/div[3]/button")).click();
        d.findElement(By.xpath("//*[@id=\"Input_TextVar2\"]")).sendKeys("Test@123");
        d.findElement(By.xpath("//*[@id=\"Input_TextVar4\"]")).sendKeys("Test@123");
        Thread.sleep(5000);
        d.findElement(By.xpath("//*[@id=\"Btn\"]/button")).click();
        Thread.sleep(5000);
        d.findElement(By.xpath("//*[@id=\"Input_AddressLine1\"]")).sendKeys("12 Imperial House");
        d.findElement(By.xpath("//*[@id=\"Input_City\"]")).sendKeys("Aberdeen");
        d.findElement(By.xpath("//*[@id=\"Input_PostalCode4\"]")).sendKeys("AB11 6PH");
        d.findElement(By.xpath("//*[@id=\"Input_PlaceOfBirth\"]")).sendKeys("London");

        WebElement nationality= d.findElement(By.xpath("//*[@id=\"NationalitiesDropdown\"]"));
        Select s2=new Select(nationality);
        s2.selectByValue("25");



        d.findElement(By.xpath("//*[@id=\"Bottom3\"]/div[2]/button")).click();

        Thread.sleep(5000);

        d.findElement(By.xpath("//*[@id=\"Input_SortCode\"]")).sendKeys("400551");
        d.findElement(By.xpath("//*[@id=\"Input_Amount3\"]")).sendKeys("12345674");

        d.findElement(By.xpath("//*[@id=\"Input_Amount\"]")).sendKeys("100");

        d.findElement(By.xpath("//*[@id=\"Bottom\"]/div/button")).click();
        Thread.sleep(5000);

        d.findElement(By.xpath("//*[@id=\"SummaryBoxCheckBox\"]")).click();
        d.findElement(By.xpath("//*[@id=\"TermsConsent\"]")).click();
        d.findElement(By.xpath("//*[@id=\"FSCSConsent\"]")).click();

        d.findElement(By.xpath("//*[@id=\"Btn\"]/button")).click();

        Thread.sleep(10000);


        String accNo =d.findElement(By.xpath("//*[@id=\"b3-Column2\"]/span")).getText();//*[@id="b3-Column2"]/span
        System.out.println(accNo);

      //  BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\Programing\\Sellenium\\NewAccDetails\\output.txt"));
       // writer.write(accNo);
       // writer.close();

        Thread.sleep(5000);

        d.findElement(By.xpath("//*[@id=\"b1-b2-Icon3\"]")).click();
        return accNo;
    }
    }

