package frames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleFrames {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/frames.html");

        WebElement qacartFrame = driver.findElement(By.id("qacart"));
        driver.switchTo().frame(qacartFrame);
        driver.findElement(By.name("firstName")).sendKeys("menna");

        driver.switchTo().parentFrame();

        driver.quit();
    }
}
