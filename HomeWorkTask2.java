package com.company.class08;

import javafx.beans.property.SetProperty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeWorkTask2 {
    public static void main(String[] args) {
        /*
        goto https://chercher.tech/practice/implicit-wait-example
the checkbox take 10 seconds  to populate
use implicit wait to check only the first checkbox that populates
 close the browser
         */


        System.setProperty("webdriver.chrome.driver", "Driver/Chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/implicit-wait-example");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@type='checkbox']")).click();

        driver.close();

    }

}
