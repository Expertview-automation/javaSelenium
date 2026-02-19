package org.example.pacticeAutomation;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class onlineTest {

    public static void main(String[]args) {
//        WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();

//      driver.get("google.com");
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
       driver.findElement(By.xpath("//button[text()=' Login ']")).click();
       driver.findElement(By.xpath("//a/span[text()='Admin']")).click();

       driver.findElement(By.xpath("//label[text()='Username']/ancestor::div[contains(@class,'input-field-bottom-space')]//input")).sendKeys("yadav");
       driver.findElement(By.xpath("//label[text()='User Role']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//i")).click();

       driver.findElement(By.xpath("//label[text()='User Role']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//div[@class='oxd-select-text-input']")).click();
       List<WebElement> listWeb = driver.findElements(By.xpath("//nav[@aria-label='Topbar Menu']//ul/li/span"));


       for (int i = 0; i < listWeb.size(); i++) {
          System.out.println(listWeb.get(i).getText());
          listWeb.get(i).click();

         /* for (int j = 0; j < listWeb.size(); j++) {
             System.out.println(listWeb.get(i).getText());
             listWeb.get(j).click();
          }*/

          driver.findElement(By.xpath("//button[text()=' Add ']")).click();
          driver.findElement(By.xpath("//label[text()='User Role']/ancestor::div[contains(@class,'oxd-input-group oxd-input-field-bottom-space')]//i")).click();
          driver.findElement(By.xpath("//span[text()='ESS']")).click();
          driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Ranga  Akunuri");

       }

    }
}
