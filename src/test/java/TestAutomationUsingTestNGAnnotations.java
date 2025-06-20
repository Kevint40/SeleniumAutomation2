
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestAutomationUsingTestNGAnnotations {
    WebDriver driver;

    @Before
    public void setup() {// driver setup
        System.setProperty("WebDriver.Chrome.Driver","C:\\Program Files\\Google\\Chrome\\Application");
        driver = new ChromeDriver();
    }

    @Test
    public void search() {// Enter words in a searchbox
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.name("search")).sendKeys("Selenium Webdriver");
    }

    @After
    public void teardown() {//quit driver
        driver.quit();
    }
}

