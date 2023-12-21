import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Creation cr = new Creation();
        int i = 9;
        BufferedWriter writer = null;
        for (int j = 0; j < 2; j++) {
            String accNo = cr.runner(i);
            writer = new BufferedWriter(new FileWriter("E:\\Programing\\Sellenium\\NewAccDetails\\output3.txt"));
            writer.write(accNo);
            i++;
        }
//       String accNo = cr.runner(i);
//        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\Programing\\Sellenium\\NewAccDetails\\output2.txt"));
//        writer.write(accNo);
        writer.close();
    }
}