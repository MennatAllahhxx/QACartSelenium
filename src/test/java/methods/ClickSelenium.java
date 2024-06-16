package methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClickSelenium {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://todo.qacart.com/");

        driver.findElement(By.cssSelector("[data-testid=email]")).sendKeys("menna@gmail.com");
        driver.findElement(By.cssSelector("[data-testid=password]")).sendKeys("Test@1234");
        driver.findElement(By.cssSelector("[id=submit]")).click();

        //driver.quit();
    }
}
