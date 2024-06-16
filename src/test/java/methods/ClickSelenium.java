package methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ClickSelenium {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://todo.qacart.com/");

        boolean emailIsDisplayed = driver.findElement(By.cssSelector("[data-testid=email]")).isDisplayed();
        System.out.println(emailIsDisplayed);

        boolean emailIsEnabled = driver.findElement(By.cssSelector("[data-testid=email]")).isEnabled();
        System.out.println(emailIsEnabled);

        String accessibleName = driver.findElement(By.cssSelector("[data-testid=email]")).getAccessibleName();
        System.out.println(accessibleName);

        String ariaRole = driver.findElement(By.cssSelector("[id=submit]")).getAriaRole();
        System.out.println(ariaRole);
        
        driver.findElement(By.cssSelector("[data-testid=email]")).sendKeys("menna@gmail.com");
        driver.findElement(By.cssSelector("[data-testid=password]")).sendKeys("Test@1234");
        driver.findElement(By.cssSelector("[id=submit]")).click();
        driver.findElement(By.cssSelector("[data-testid=complete-task]")).click();

        boolean taskIsSelected = driver.findElement(By.cssSelector("[data-testid=complete-task]")).isSelected();
        System.out.println(taskIsSelected);

        String name = driver.findElement(By.cssSelector("[data-testid=complete-task]")).getAttribute("name");
        System.out.println(name);

        String tagName = driver.findElement(By.cssSelector("[data-testid=complete-task]")).getTagName();
        System.out.println(tagName);

        String cssValue = driver.findElement(By.cssSelector("[data-testid=todo-item]")).getCssValue("background-color");
        System.out.println(cssValue);

        Point location = driver.findElement(By.cssSelector("[data-testid=complete-task]")).getLocation();
        System.out.println(location.x);

        Dimension size = driver.findElement(By.cssSelector("[data-testid=complete-task]")).getSize();
        System.out.println(size.height);

        Rectangle rect = driver.findElement(By.cssSelector("[data-testid=complete-task]")).getRect();
        System.out.println(rect.x);
        System.out.println(rect.height);

        driver.quit();
    }
}
