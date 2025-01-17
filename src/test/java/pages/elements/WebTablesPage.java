package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class WebTablesPage {

    WebDriver driver;

    By webTablesTitle = By.xpath("//h1[text() = 'Web Tables']");
    By addNewRowButton = By.xpath("//*[@id='addNewRecordButton']");
    By webTablesRegistrationTitle = By.xpath("//*[@id='registration-form-modal']");
    By searchBox = By.xpath("//*[@id='searchBox']");
    By noRowsFoundElement = By.xpath("//*[text()='No rows found']");
    By firstNameField = By.xpath("//*[@id='firstName']");
    By lastNameField = By.xpath("//*[@id='lastName']");
    By userEmailField = By.xpath("//*[@id='userEmail']");
    By ageField = By.xpath("//*[@id='age']");
    By salaryField = By.xpath("//*[@id='salary']");
    By departmentField = By.xpath("//*[@id='department']");
    By submitWebTablesButton = By.xpath("//*[@id='submit']");

    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void webTablesOpen() {
        driver.get("https://demoqa.com/webtables"); //Открывание модуля 'Web Tables'
    }

    public boolean pageWebTablesTitleValidator() {
        return driver.findElement(webTablesTitle).isDisplayed();
    }

    public boolean pageWebTablesRegistrationFormValidator() {
        return driver.findElement(webTablesRegistrationTitle).isDisplayed();
    }

    public void addNewRowButtonClick() {
        driver.findElement(addNewRowButton).click();
    }

    public void fillWebTablesFields(String firstName, String lastName, String userEmail, String age, String salary, String department) {
        driver.findElement(firstNameField).click();
        driver.findElement(firstNameField).sendKeys(Keys.CONTROL + "A");
        driver.findElement(firstNameField).clear();
        driver.findElement(firstNameField).sendKeys(firstName); //Заполнение поля "firstName"
        driver.findElement(lastNameField).click();
        driver.findElement(lastNameField).sendKeys(Keys.CONTROL + "A");
        driver.findElement(lastNameField).clear();
        driver.findElement(lastNameField).sendKeys(lastName); //Заполнение поля "lastName"
        driver.findElement(userEmailField).click();
        driver.findElement(userEmailField).sendKeys(Keys.CONTROL + "A");
        driver.findElement(userEmailField).clear();
        driver.findElement(userEmailField).sendKeys(userEmail); //Заполнение поля "userEmail"
        driver.findElement(ageField).click();
        driver.findElement(ageField).sendKeys(Keys.CONTROL + "A");
        driver.findElement(ageField).clear();
        driver.findElement(ageField).sendKeys(age); //Заполнение поля Permanent "age"
        driver.findElement(salaryField).click();
        driver.findElement(salaryField).sendKeys(Keys.CONTROL + "A");
        driver.findElement(salaryField).clear();
        driver.findElement(salaryField).sendKeys(salary); //Заполнение поля "salary"
        driver.findElement(departmentField).click();
        driver.findElement(departmentField).sendKeys(Keys.CONTROL + "A");
        driver.findElement(departmentField).clear();
        driver.findElement(departmentField).sendKeys(department); //Заполнение поля "department"
        driver.findElement(submitWebTablesButton).click();
    }

    public void setSearchBox(String value) {
        driver.findElement(searchBox).click();
        driver.findElement(searchBox).sendKeys(Keys.CONTROL + "A");
        driver.findElement(searchBox).clear();
        driver.findElement(searchBox).sendKeys(value);
    }

    public boolean getNoRows() {
        return driver.findElement(noRowsFoundElement).isDisplayed();
    }

    public String getSubmittedFirstName() {
        return driver.findElement(firstNameField).getAttribute("value"); //Считывание данных с поля "firstName"
    }

    public String getSubmittedLastName() {
        return driver.findElement(lastNameField).getAttribute("value"); //Считывание данных с поля "lastName"
    }

    public String getSubmittedUserEmail() {
        return driver.findElement(userEmailField).getAttribute("value"); //Считывание данных с поля "userEmail"
    }

    public String getSubmittedAge() {
        return driver.findElement(ageField).getAttribute("value"); //Считывание данных с поля "age"
    }

    public String getSubmittedSalary() {
        return driver.findElement(salaryField).getAttribute("value"); //Считывание данных с поля "salary"
    }

    public String getSubmittedDepartment() {
        return driver.findElement(departmentField).getAttribute("value"); //Считывание данных с поля "department"
    }
}
