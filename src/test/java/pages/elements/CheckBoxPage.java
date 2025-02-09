package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CheckBoxPage {

    WebDriver driver;

    By checkBoxTitle = By.xpath("//h1[text() = 'Check Box']"); //Локатор заголовка 'Check Box'
    By expandAll = By.cssSelector("#tree-node>div>button.rct-option.rct-option-expand-all"); //Локатор заголовка 'Expand All'
    String checkBox = "//span[text() = '%s']//ancestor::label//span[@class = 'rct-checkbox']"; //Локатор маска поиска по чек боксам
    String openCheckBox = "//span[text() = '%s']//ancestor::span//button"; //Локатор маска поиска по раскрытию чекбоксов
    By textSuccess = By.xpath("//span[@class = 'text-success']"); //Локатор результата выбора чек боксов

    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkBoxOpen() {
        driver.get("https://demoqa.com/checkbox"); //Открывание модуля 'Check Box'
    }

    public void expandAllClick() {
        driver.findElement(expandAll).click(); //Раскрыть все чекбоксы
    }

    public boolean pageCheckBoxValidator() {
        return driver.findElement(checkBoxTitle).isDisplayed(); //Проверка наличия на странице элемента 'Check Box'
    }

    public void checkBoxClick(String checkBoxName) {
        driver.findElement(By.xpath(String.format(checkBox, checkBoxName))).click();
    }

    public void checkBoxOpen(String openCheckBoxName) {
        driver.findElement(By.xpath(String.format(openCheckBox, openCheckBoxName))).click();
    }

    public List<String> resultTextSuccess() {
        List<String> resultList = new ArrayList<>();
        for (WebElement webElement : driver.findElements(textSuccess)) {
            resultList.add(webElement.getText());
        }
        return resultList;
    }
}
