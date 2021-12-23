package com.company.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.jws.WebResult;
import java.util.Iterator;
import java.util.Set;

public class windowHandles {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");


        // task is to open up a newtab and new window
// switch to new tab and get the text
        WebElement newtab=driver.findElement(By.cssSelector("button#tabButton"));
//find new window
WebElement newWindow=driver.findElement(By.cssSelector("button#windowButton"));

    newWindow.click();
    newtab.click();

    String parentHandle=driver.getWindowHandle();

        System.out.println("parent window handle:"+parentHandle);
    //1.get all handles
   Set<String> allHandles=driver.getWindowHandles();

// 2. find the desired handle i.e of newtab iterating through the set
        Iterator<String>it=allHandles.iterator();

//3 iterating over each handle to see if it is the desired
        while(it.hasNext()){
    String handle=it.next();

driver.switchTo().window(handle);
// now get the title & check if the desired title ot not
if(driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/sample")){
            System.out.println(driver.getCurrentUrl());
      break;
       }

    }
        WebElement text=driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println(text.getText());

   // click on new window message button

//driver.switchTo().defaultContent();
    driver.switchTo().window(parentHandle);
    driver.findElement(By.cssSelector("button#messageWindowButton")).click();

    }
}