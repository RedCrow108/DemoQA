package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxPage {

    WebDriver driver;

    By textBoxTitle = By.xpath("//h1[text() = 'Text Box']"); //Локатор заголовка 'Text Box'
    By userNameField = By.xpath("//*[@id='userName']"); //Локатор поля 'Full Name'
    By userEmailField = By.xpath("//*[@id='userEmail']"); //Локатор поля 'Email'
    By currentAddressField = By.xpath("//*[@id='currentAddress']"); //Локатор поля 'Current Address'
    By permanentAddressField = By.xpath("//*[@id='permanentAddress']"); //Локатор поля Permanent 'Address'
    By tbSubmitButton = By.xpath("//*[@id='submit']"); //Локатор кнопки 'submit'
    By emailErrorField = By.xpath("//input[@id='userEmail' and @class='mr-sm-2 field-error form-control']"); //Локатор состояния ошибки поля 'Email'
    By nameOutput = By.xpath("//*[@id='name']"); //Локатор поля 'Name' (отпарвленные данные)
    By emailOutput = By.xpath("//*[@id='email']"); //Локатор поля 'Email' (отпарвленные данные)
    By currentAddressOutput = By.xpath("//*[@id='currentAddress' and @class='mb-1']"); //Локатор поля 'Current Address' (отпарвленные данные)
    By permanentAddressOutput = By.xpath("//*[@id='permanentAddress' and @class='mb-1']"); //Локатор поля 'Permananet Address' (отпарвленные данные)

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public void textBoxOpen() {
        driver.get("https://demoqa.com/text-box"); //Открывание модуля 'Text Box'
    }

    public void fillFields (String fullName, String email, String currentAd, String permanentAd) {
        driver.findElement(userNameField).sendKeys(fullName); //Заполнение поля 'Full Name'
        driver.findElement(userEmailField).sendKeys(email); //Заполнение поля 'Email'
        driver.findElement(currentAddressField).sendKeys(currentAd); //Заполнение поля 'Current Address'
        driver.findElement(permanentAddressField).sendKeys(permanentAd); //Заполнение поля Permanent 'Address'
        driver.findElement(tbSubmitButton).click();
    }

    public boolean notValidEmail () {
        return driver.findElement(emailErrorField).isDisplayed(); //Проверка ошибки в поле 'Email'
    }

    public String getSubmittedName () {
       return driver.findElement(nameOutput).getText(); //Считывание данных с поля 'Name'
    }

    public String getSubmittedEmail () {
        return driver.findElement(emailOutput).getText(); //Считывание данных с поля 'Email'
    }

    public String getSubmittedCurrentAddress () {
        return driver.findElement(currentAddressOutput).getText(); //Считывание данных с поля 'Current Address'
    }

    public String getSubmittedPermanentAddress () {
        return driver.findElement(permanentAddressOutput).getText(); //Считывание данных с поля 'Permananet Address'
    }

    public boolean pageTextBoxValidator () {
       return driver.findElement(textBoxTitle).isDisplayed(); //Проверка наличия на странице элемента 'Text Box'
    }
}