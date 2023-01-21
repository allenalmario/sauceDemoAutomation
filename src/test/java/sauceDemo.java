import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sauceDemo {
    public static void main (String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String webUrl = "https://www.saucedemo.com/";

        driver.get(webUrl);

        String userName = "standard_user";

        String password = "secret_sauce";

        WebElement loginField = driver.findElement(By.id("user-name"));

        loginField.sendKeys(userName);

        WebElement passwordField = driver.findElement(By.id("password"));

        passwordField.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("login-button"));

        loginButton.click();

        String homePage = driver.getCurrentUrl();

        homePage.equals("https://www.saucedemo.com/inventory.html");

        Thread.sleep(5000);

        driver.quit();
    }
}
