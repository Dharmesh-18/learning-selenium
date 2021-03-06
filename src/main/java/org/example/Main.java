package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
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

        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div/div/div[1]/a/h3")).click();




        System.out.println("Goal");






    }

    public static WebDriver chromeDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public static WebDriver firefoxDriver() {
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("/usr/bin/firefox");
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

}
