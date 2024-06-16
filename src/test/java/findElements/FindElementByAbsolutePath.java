package findElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementByAbsolutePath {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("file:/E:\\studies\\software_testing\\QACartSelenium\\src\\test\\resources\\index.html");

        //String elementText = driver.findElement(By.xpath("/html/body/ul[2]/li[2]")).getText(); // absolute path
        String elementText = driver.findElement(By.xpath("//ul[@class='country-list']/li[2]")).getText(); //relative path

        System.out.println(elementText);

        driver.quit();
    }
}
