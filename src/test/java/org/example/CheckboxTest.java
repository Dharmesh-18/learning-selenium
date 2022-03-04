package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckboxTest {

    private WebDriver driver;

    @BeforeClass
    public static void init() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.get("http://localhost:8082/");

    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void test_checkbox_selected() {
        WebElement checkboxLink = driver.findElement(By.id("checkboxLink"));
        checkboxLink.click();

        WebElement lettuceCheckbox = driver.findElement(By.id("lettuceCheckbox"));
        lettuceCheckbox.click();
        assertTrue(lettuceCheckbox.isSelected());

    }

    @Test
    public void test_message_text() throws InterruptedException {
        WebElement checkboxLink = driver.findElement(By.id("checkboxLink"));
        checkboxLink.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));
        WebElement messageBox = driver.findElement(By.id("message"));
        assertEquals("Loading complete...", messageBox.getText());

    }


}