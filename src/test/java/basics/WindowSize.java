package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowSize {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        
        driver.get("file:/E:\\studies\\software_testing\\QACartSelenium\\src\\test\\resources\\index.html");

        Dimension iphoneXR = new Dimension(414, 896);
        Dimension ipadAir = new Dimension(820, 1180);
        driver.manage().window().setSize(ipadAir);
    }
}
