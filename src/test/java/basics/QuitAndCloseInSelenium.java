package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class QuitAndCloseInSelenium {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://www.qacart.com");

        String pageSource = driver.getPageSource();
        System.out.println("The page source of the current browser is:");
        System.out.println(pageSource);

        //driver.close();
        driver.quit();//closes all tabs and windows
    }
}
