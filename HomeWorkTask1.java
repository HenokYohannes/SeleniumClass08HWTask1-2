package com.company.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HomeWorkTask1 {
    public static void main(String[] args) {
/*goto http://syntaxprojects.com/window-popup-modal-demo.php
click on follow on instagram
get the title and of new window and print it on the console
 */
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(" http://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement FollowInst = driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Instagram']"));
        FollowInst.click();

        Set<String> allHandles = driver.getWindowHandles();

        Iterator<String> iterator = allHandles.iterator();

        while (iterator.hasNext()) {
            String InsPage = iterator.next();
            driver.switchTo().window(InsPage);
            if (InsPage.contains("Instagram")) {

            }
        }
        System.out.println(" The Title of the new window is" + driver.getTitle());

        driver.quit();
    }

}
