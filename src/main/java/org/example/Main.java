package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Main {

    public static void main(String[] args) {



        WebDriver driver  = chromeDriver();

        driver.get("http://google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.click();
        searchBox.sendKeys("Selenium testing ");
        searchBox.sendKeys(Keys.ENTER);


        System.out.println("Goal");






    }

    public static WebDriver chromeDriver(){
        return new ChromeDriver();
    }

}
