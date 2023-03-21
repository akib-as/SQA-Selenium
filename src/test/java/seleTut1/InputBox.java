package seleTut1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InputBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        driver.manage().window().maximize();

        Thread.sleep(1000);

        WebElement element = driver.findElement(By.xpath("//input[@id='Email']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center', inline: 'center' });";
        js.executeScript(script, element);

        Thread.sleep(1000);
        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));

        Thread.sleep(1000);
        email.sendKeys("akib.riseuplabs@gmail.com");

        Thread.sleep(1000);
        WebElement pass = driver.findElement(By.xpath("//input[@id='Password']"));

        Thread.sleep(1000);
        pass.sendKeys("123456");

        Thread.sleep(1000);
        WebElement rememberMe = driver.findElement(By.xpath("//input[@id='RememberMe']"));

        Thread.sleep(1000);
        rememberMe.click();

        Thread.sleep(1000);
        WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));

        Thread.sleep(1000);
        login.click();

    }
}
