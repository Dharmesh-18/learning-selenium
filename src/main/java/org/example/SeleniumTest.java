package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SeleniumTest {

    public static void main(String[] args) {



        WebDriver driver  = chromeDriver();

        driver.get("https://selenium.dev");

        WebElement blog = driver.findElement(By.linkText("Blog"));
        blog.click();

        WebElement link2016 = driver.findElement(By.id("m-blog2016"));
        link2016.click();

        WebElement element = driver.findElement(By.linkText("Fall Selenium Conf, Save the Date & Call for Speakers!"));
        element.click();




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
