package waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsInSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/wait.html");

        //Thread.sleep(4000);

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.findElement(By.className("primary")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("primary"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cover")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("cover")));
        
        driver.findElement(By.className("secondary")).click();
        
        driver.quit();
    }
}
