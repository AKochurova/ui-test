import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CalculatorPage {


       // WebDriverManager.chromedriver().browserVersion("117").clearResolutionCache().clearDriverCache().setup();
        WebDriver driver;

        String url = "https://testsheepnz.github.io/BasicCalculator.html";

        By selectBy = By.id("selectBuild");

        By field1By = By.id("number1Field");

        By field2By = By.id("number2Field");

        By operationBy = By.id("selectOperationDropdown");

        By clickBy = By.id("calculateButton");

        By answerBy = By.id("numberAnswerField");

       public CalculatorPage(WebDriver driver) {
        this.driver = driver;
       }





    public String subtract(String selectMode, String field1, String field2, String operation){


     JavascriptExecutor js = (JavascriptExecutor) driver;

     driver.get(url);
     js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

     Select select = new Select(driver.findElement(selectBy));
     select.selectByValue(selectMode);

     WebElement select2 = driver.findElement(field1By);
     select2.sendKeys(field1);

     WebElement select3 = driver.findElement(field2By);
     select3.sendKeys(field2);

     Select select4 = new Select(driver.findElement(operationBy));
     select4.selectByValue(operation);

     WebElement select5 = driver.findElement(clickBy);
     select5.click();

     WebElement select6 = driver.findElement(answerBy);


     return select6.getAttribute("value");
    }

}
