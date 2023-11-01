import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

public class CalculatorTest {


    @Features(value = "calculator")
    @Stories(value = "subtract")
    @Test
    public void testSubtract() {
        WebDriverManager.chromedriver().browserVersion("117").clearResolutionCache().clearDriverCache().setup();
        WebDriver driver = new ChromeDriver();

        String url = "https://testsheepnz.github.io/BasicCalculator.html";

        //прокручивает страницу вниз
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get(url);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        PageObject calcPage = new PageObject(driver);
        //выбрать опцию из списка
        calcPage.selectOption("2", calcPage.selectBy);
        //ввести значение в первое поле
        calcPage.fillField("2", calcPage.field1By);
        //ввести значение во второе поле
        calcPage.fillField("3", calcPage.field2By);
        //выбрать математическую операцию из списка
        calcPage.selectOption("1", calcPage.operationBy);
        //нажать на кнопку
        calcPage.clickButton(calcPage.clickBy);
        //получаем значение из формы
        WebElement answer = calcPage.getText(calcPage.answerBy);

        Assert.assertEquals("-1", answer.getAttribute("value"));

        driver.close();

        driver.quit();

    }
}
