package methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelenium {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("file:/E:\\studies\\software_testing\\QACartSelenium\\src\\test\\resources\\index.html");

        WebElement dropDown = driver.findElement(By.id("courses"));
        Select coursesDropDown = new Select(dropDown);
        coursesDropDown.selectByVisibleText("wdiocourse");

        Actions action = new Actions(driver);

        WebElement doubleClickButton = driver.findElement(By.cssSelector(".double"));
        action.doubleClick(doubleClickButton).perform();

        WebElement rightClickButton = driver.findElement(By.cssSelector(".right"));
        action.contextClick(rightClickButton).perform();

        WebElement trigger = driver.findElement(By.cssSelector(".trigger"));
        action.moveToElement(trigger).perform();

        //driver.quit();
    }
}
