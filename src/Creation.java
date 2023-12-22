import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class Creation {


    public String runner(int i) throws InterruptedException, IOException {
        int lastNameCounter = i;

        //System.setProperty("webdriver.chrome.driver", "E:\\Programing\\Sellenium\\chromedriver_win32 (2)\\chromedriver.exe");
        //WebDriver d = new ChromeDriver();

        //System.setProperty("webdriver.edge.driver", "E:\\Programing\\Sellenium\\edgedriver_win64\\msedgedriver.exe");
        //WebDriver d = new EdgeDriver();



        System.setProperty("webdriver.gecko.driver", "E:\\Programing\\Sellenium\\geckodriver-v0.33.0-win32\\geckodriver.exe");
        WebDriver d = new FirefoxDriver();

        d.get("https://stage.portal.gbbdev.co.uk/Registration/");
        //*[@id="l1-2_1-LandingCard"]/div[4]/button
        //*[@id="l1-2_0-LandingCard"]/div[4]/button
        //d.findElement(By.className("btn LandingBtn")).click();
        d.manage().window().maximize();
        //*[@id="Btn"]/button

        //Page1
        Page1 page1 = new Page1();
        Page2 page2 = new Page2();
        Page3 page3 =new Page3();
        Page4 page4 = new Page4();
        Page5 page5 =new Page5();
        Page6 page6 = new Page6();
        Page7 page7=new Page7();
        Page8 page8 = new Page8();
        Page9 page9 = new Page9();
        Page10 page10=new Page10();
        Page11 page11 = new Page11();
        Page12 page12 = new Page12();
        String accNo;
        try {
            page1.openPage1(d);
        } catch (NoSuchElementException e) {
            page1.openPage1(d);
        }

            page2.openPage2(d);


        //Page3
        page3.openPage3(d);

        //Page4
        page4.set(lastNameCounter);
        page4.setD(d);
        page4.openPage4();

         //Page5
         page5.openPage5(d);

         //Page6
        page6.openPage6(d);

        //Page7
        page7.openPage7(d);

        //Page8
        page8.openPage8(d);

        //Page9
        page9.openPage9(d);

        //Page10
        page10.openPage10(d);

        if(d.getCurrentUrl().equals("https://stage.portal.gbbdev.co.uk/Application/Success"))
        {
            accNo = page11.openPage11(d);
            page12.openPage12(d);
        }
        else {
            try {
                Thread.sleep(15000);
                d.findElement(By.xpath("//*[@id=\"Navigate\"]/div[1]/button")).click();
            }
            catch (NoSuchElementException e)
            {
                Thread.sleep(5000);
                d.findElement(By.xpath("//*[@id=\"b2-Actions\"]/button")).click();
            }
            Thread.sleep(10000);
            d.findElement(By.xpath("//*[@id=\"InnerLeftColumn\"]/a[2]/div")).click();
            Thread.sleep(5000);
            accNo=d.findElement(By.xpath("//*[@id=\"l1-9_0-b4-AccountNumber\"]/span[2]")).getText();
            Thread.sleep(10000);
            d.findElement(By.xpath("//*[@id=\"b1-Icon3\"]")).click();
            //Page11


        }

        //  BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\Programing\\Sellenium\\NewAccDetails\\output.txt"));
       // writer.write(accNo);
       // writer.close();


        return accNo;
    }
    }

