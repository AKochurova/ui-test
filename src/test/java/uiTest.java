//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import ru.yandex.qatools.allure.annotations.Description;
//import ru.yandex.qatools.allure.annotations.Features;
//import ru.yandex.qatools.allure.annotations.Stories;
//
//public class uiTest {
//
//
//
//    @Features(value = "calculator")
//    @Stories(value = "subtract")
//    @Test
//    public void mainP() {
//        WebDriverManager.chromedriver().browserVersion("117").clearResolutionCache().clearDriverCache().setup();
//        WebDriver driver = new ChromeDriver();
//
//       // driver.get("https://testsheepnz.github.io/BasicCalculator.html");
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//
//        Select select = new Select(driver.findElement(By.id("selectBuild")));
//        select.selectByValue("2");
//
//        WebElement select2 = driver.findElement(By.id("number1Field"));
//        select2.sendKeys("2");
//
//        WebElement select3 = driver.findElement(By.id("number2Field"));
//        select3.sendKeys("3");
//
//        Select select4 = new Select(driver.findElement(By.id("selectOperationDropdown")));
//        select4.selectByValue("1");
//
//        WebElement select5 = driver.findElement(By.id("calculateButton"));
//        select5.click();
//
//        WebElement select6 = driver.findElement(By.id("numberAnswerField"));
//        Assert.assertEquals("-1", select6.getAttribute("value"));
//
//        driver.close();
//        driver.quit();
//    }
//}
