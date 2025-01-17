package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage {

    WebDriver driver;

    By radioButtonTitle = By.xpath("//h1[text() = 'Radio Button']");
    By yesButton = By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[2]/label");
    By impressiveButton = By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[3]/label");
    By noButton = By.xpath("//*[@id='noRadio']");
    By resultText = By.xpath("//p[@class = 'mt-3']");

    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;
    }

    public void radioButtonOpen() {
        driver.get("https://demoqa.com/radio-button"); //Открывание модуля 'Radio Button'
    }

    public void yesButtonClick() {
        driver.findElement(yesButton).click();
    }

    public void impressiveButtonClick() {
        driver.findElement(impressiveButton).click();
    }

    public boolean noButtonElement() {
        return driver.findElement(noButton).isEnabled();
    }

    public boolean pageRadioButtonValidator() {
        return driver.findElement(radioButtonTitle).isDisplayed(); //Проверка наличия на странице элемента 'Radio Button'
    }

    public String getRadioResultText() {
        return driver.findElement(resultText).getText();
    }
}
