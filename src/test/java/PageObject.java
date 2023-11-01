import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageObject {

    WebDriver driver;

    By selectBy = By.id("selectBuild");

    By field1By = By.id("number1Field");

    By field2By = By.id("number2Field");

    By operationBy = By.id("selectOperationDropdown");

    By clickBy = By.id("calculateButton");

    By answerBy = By.id("numberAnswerField");

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }



    public void selectOption(String option, By elem) {
        Select select = new Select(driver.findElement(elem));
        select.selectByValue(option);
    }

    public void fillField(String text, By elem) {
        WebElement select = driver.findElement(elem);
        select.sendKeys(text);
    }

    public void clickButton(By elem) {
        WebElement select5 = driver.findElement(elem);
        select5.click();
    }

    public WebElement getText(By elem) {
       return driver.findElement(elem);
    }
}
