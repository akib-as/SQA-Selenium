package seleTut1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfWebElement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

        //isDisplay & isEnabled
        WebElement searchStore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));

        System.out.println("isDisplay : "+searchStore.isDisplayed());
        System.out.println("isEnabled : "+searchStore.isEnabled());

        //isSelected (radio btn, checkbox, dropdown)
        WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));

        System.out.println("Male select: "+male.isSelected());
        System.out.println("Female select: "+female.isSelected());

        male.click();

        System.out.println("Male select: "+male.isSelected());
        System.out.println("Female select: "+female.isSelected());

        female.click();

        System.out.println("Male select: "+male.isSelected());
        System.out.println("Female select: "+female.isSelected());
    }
}
