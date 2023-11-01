import com.google.common.collect.ImmutableMap;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
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
        CalculatorPage calcPage = new CalculatorPage(driver);
        String answer = calcPage.subtract("2", "2", "3", "1");
        driver.close();
        driver.quit();
        Assert.assertEquals("-1", answer);

    }
}
