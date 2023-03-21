package seleTut1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegForm {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(1000);
        WebElement regbtn = driver.findElement(By.xpath("//a[@class='ico-register']"));
        regbtn.click();

        Thread.sleep(1000);
        WebElement scrollelement = driver.findElement(By.xpath("//h1[normalize-space()='Register']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center', inline: 'center' });";
        js.executeScript(script, scrollelement);

        Thread.sleep(1000);
        WebElement gender = driver.findElement(By.xpath("//input[@id='gender-male']"));
        gender.click();

        Thread.sleep(1000);
        WebElement fName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        fName.sendKeys("Akib");

        Thread.sleep(1000);
        WebElement lName = driver.findElement(By.xpath("//input[@id='LastName']"));
        lName.sendKeys("Siddiquee");

//        Thread.sleep(1000);
//        WebElement bDayEle = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
//        Select bDay = new Select(bDayEle);
//        bDay.selectByValue("27");
//
//        Thread.sleep(1000);
//        WebElement bMonthEle = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
//        Select bMonth = new Select(bMonthEle);
//        bMonth.selectByValue("8");
//
//        Thread.sleep(1000);
//        WebElement bYearEle = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
//        Select bYear = new Select(bYearEle);
//        bYear.selectByValue("1997");

//        *****DropDown Code*****
        Thread.sleep(1000);
        WebElement bDay = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        selectOptionFromDropdown(bDay, "27");

        Thread.sleep(1000);
        WebElement bMonth = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        selectOptionFromDropdown(bMonth, "August");

        Thread.sleep(1000);
        WebElement bYear = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        selectOptionFromDropdown(bYear, "1997");


        Thread.sleep(1000);
        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("akib.demo@gmail.com");

        Thread.sleep(1000);
        WebElement company = driver.findElement(By.xpath("//input[@id='Company']"));
        company.sendKeys("Demo Company");

        Thread.sleep(1000);
        WebElement newsletter = driver.findElement(By.xpath("//input[@id='Newsletter']"));
        newsletter.click();
        Thread.sleep(1000);
        newsletter.click();

        Thread.sleep(1000);
        WebElement pass = driver.findElement(By.xpath("//input[@id='Password']"));
        pass.sendKeys("123456");

        Thread.sleep(1000);
        WebElement confirmPassW = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPassW.sendKeys("12345");

        Thread.sleep(1000);
        WebElement subBtn1 = driver.findElement(By.xpath("//button[@id='register-button']"));
        subBtn1.click();

        Thread.sleep(1000);
        WebElement confirmPassC = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPassC.clear();

        Thread.sleep(1000);
        WebElement confirmPass = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPass.sendKeys("123456");

        Thread.sleep(1000);
        WebElement subBtn2 = driver.findElement(By.xpath("//button[@id='register-button']"));
        subBtn2.click();

    }

    //        *****DropDown Code (method)*****
    public static void selectOptionFromDropdown(WebElement ele, String value)
    {
        Select drp = new Select(ele);
        List<WebElement>alloptions = drp.getOptions();

        for(WebElement option:alloptions)
        {
            if (option.getText().equals(value))
            {
                option.click();
                break;
            }
        }
    }
}
