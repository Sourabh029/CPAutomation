import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Creation cr = new Creation();
        int i = 139;
        BufferedWriter writer = null;
        System.setProperty("webdriver.gecko.driver", "E:\\Programing\\Sellenium\\geckodriver-v0.33.0-win32\\geckodriver.exe");
        WebDriver d = new FirefoxDriver();
        for (int j = 0; j < 20; j++) {
            String accNo = cr.runner(i,d);
            accNo+=" ";
            writer = new BufferedWriter(new FileWriter("E:\\Programing\\Sellenium\\NewAccDetails\\"+i+"-"+accNo+".txt"));
            writer.write(accNo);
            writer.newLine();
            writer.close();
            i++;
        }
//       String accNo = cr.runner(i);
//        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\Programing\\Sellenium\\NewAccDetails\\output2.txt"));
//        writer.write(accNo);/html/body/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div[1]/div[7]/div[1]/span[2]

    }
}