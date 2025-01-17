package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonsPage {

    WebDriver driver;


    By buttonsTitle = By.xpath("//h1[text() = 'Buttons']");
    By doubleClickButton = By.xpath("//*[@id='doubleClickBtn']");
    By rightClickButton = By.xpath("//*[@id='rightClickBtn']");
    By clickMeButton = By.xpath("//button[text() = 'Click Me']");
    By doubleClickMessage = By.xpath("//*[@id='doubleClickMessage']");
    By rightClickMessage = By.xpath("//*[@id='rightClickMessage']");
    By dynamicClickMessage = By.xpath("//*[@id='dynamicClickMessage']");

    public ButtonsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void buttonsPageOpen() {
        driver.get("https://demoqa.com/buttons"); //Открывание модуля 'Buttons'
    }

    public boolean pageButtonsPageValidator() {
        return driver.findElement(buttonsTitle).isDisplayed();
    }

    public void doubleClickMethod() {
        Actions actions = new Actions(driver);
        new Actions(driver);
        actions.doubleClick(driver.findElement(doubleClickButton)).perform();
    }

    public void rightClickMethod() {
        Actions actions = new Actions(driver);
        new Actions(driver);
        actions.contextClick(driver.findElement(rightClickButton)).perform();
    }

    public void usualClickMethod() {
        driver.findElement(clickMeButton).click();
    }

    public String getDoubleClickMessage() {
        return driver.findElement(doubleClickMessage).getText();
    }

    public String getRightClickMessage() {
        return driver.findElement(rightClickMessage).getText();
    }

    public String getDynamicClickMessage() {
        return driver.findElement(dynamicClickMessage).getText();
    }
}
