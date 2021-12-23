package com.company.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitWait {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
driver.get("http://syntaxprojects.com/dynamic-data-loading-demo.php");
        driver.manage().window().maximize();
// declare a implicit wait for
       driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
      WebElement getNewUser=driver.findElement(By.cssSelector("button#save"));
   getNewUser.click();
// get new user first name

        WebElement fname=driver.findElement(By.xpath("//div[@id='First-Name']/p"));
        System.out.println(fname.getText());
    }
}