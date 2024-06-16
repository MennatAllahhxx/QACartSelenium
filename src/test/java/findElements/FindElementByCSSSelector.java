package findElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementByCSSSelector {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("file:/E:\\studies\\software_testing\\QACartSelenium\\src\\test\\resources\\index.html");

        String elementText1 = driver.findElement(By.cssSelector("#welcome")).getText();
        System.out.println(elementText1);

        String elementText2 = driver.findElement(By.cssSelector(".list1")).getText();
        System.out.println(elementText2);

        String elementText3 = driver.findElement(By.cssSelector("[name=description]")).getText();
        System.out.println(elementText3);

        driver.quit();
    }
}
