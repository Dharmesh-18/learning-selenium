import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class RadioButtonTest {

    private WebDriver driver;

    @BeforeClass
    public static void init() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.get("http://localhost:8082/radioButton.html");
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void test_radioButton_Blue(){
        List<WebElement> color = driver.findElements(By.name("color"));
        color.get(2).click();
        assertTrue(color.get(2).isSelected());
    }


}
