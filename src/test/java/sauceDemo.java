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

        WebElement redTShirt = driver.findElement(By.xpath("//*[contains(text(), 'Test.allTheThings() T-Shirt (Red)')]"));

        redTShirt.click();

        WebElement addShirtCart = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));

        addShirtCart.click();

        WebElement shoppingCartIcon = driver.findElement(By.id("shopping_cart_container"));

        shoppingCartIcon.click();

        driver.findElement(By.id("item_3_title_link")).isDisplayed();

        WebElement checkoutButton = driver.findElement(By.id("checkout"));

        checkoutButton.click();

        WebElement firstName = driver.findElement(By.id("first-name"));

        firstName.sendKeys("Eren");

        WebElement lastName = driver.findElement(By.id("last-name"));

        lastName.sendKeys("Jaegar");

        WebElement postalCode = driver.findElement(By.id("postal-code"));

        postalCode.sendKeys("12345");

        WebElement continueButton = driver.findElement(By.id("continue"));

        continueButton.click();

        WebElement finishButton = driver.findElement(By.id("finish"));

        finishButton.click();

        WebElement backHome = driver.findElement(By.id("back-to-products"));

        backHome.click();

        Thread.sleep(5000);

        driver.quit();
    }
}
