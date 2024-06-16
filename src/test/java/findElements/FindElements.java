package findElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElements {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("file:/E:\\studies\\software_testing\\QACartSelenium\\src\\test\\resources\\index.html");

        String text = driver.findElements(By.cssSelector(".course-list li")).get(5).getText();
        System.out.println(text);

        driver.quit();
    }
}
