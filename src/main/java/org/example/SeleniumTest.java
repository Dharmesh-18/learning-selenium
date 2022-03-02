package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SeleniumTest {

    public static void main(String[] args) {



        WebDriver driver  = chromeDriver();

        driver.get("https://www.selenium.dev/");

        driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[7]/a/span")).click();

        driver.findElement(By.xpath("//*[@id=\"m-blog2016\"]/span")).click();

        driver.findElement(By.xpath("/html/body/div/div[1]/div/main/div[1]/div/ul/li[4]/div/h5/a")).click();




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
