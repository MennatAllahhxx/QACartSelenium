package multipleWindows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class GetWindowHandle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/windows.html");

        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);

        driver.findElement(By.cssSelector(".website")).click();

        Set<String> allWindows = driver.getWindowHandles();
        System.out.println(allWindows);

        for (String window: allWindows) {
            if (!window.equalsIgnoreCase(parentWindow)) {
                System.out.println(driver.getTitle());
                driver.switchTo().window(window);
                System.out.println(driver.getTitle());
                driver.close();
            }
        }

        driver.switchTo().window(parentWindow);
        driver.findElement(By.cssSelector(".youtube")).click();

        driver.quit();
    }
}
