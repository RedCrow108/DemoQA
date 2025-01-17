package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTablesTest extends BaseTest {

    @Test
    public void checkAddNewRow() {
        webTablesPage.webTablesOpen();
        Assert.assertTrue(webTablesPage.pageWebTablesTitleValidator());
        webTablesPage.addNewRowButtonClick();
        Assert.assertTrue(webTablesPage.pageWebTablesRegistrationFormValidator());
        webTablesPage.fillWebTablesFields("Kokos", "Kokosov", "kokos123@gmail.com", "12", "0", "Mur-mur");
        Assert.assertTrue(webTablesPage.pageWebTablesTitleValidator());
        webTablesPage.setSearchBox("Kokos");
        driver.findElement(By.xpath("//*[@id='edit-record-4']")).click();
        Assert.assertEquals(
                webTablesPage.getSubmittedFirstName(),
                "Kokos",
                "Значение не совпадает"
        );
        Assert.assertEquals(
                webTablesPage.getSubmittedLastName(),
                "Kokosov",
                "Значение не совпадает"
        );
        Assert.assertEquals(
                webTablesPage.getSubmittedUserEmail(),
                "kokos123@gmail.com",
                "Значение не совпадает"
        );
        Assert.assertEquals(
                webTablesPage.getSubmittedAge(),
                "12",
                "Значение не совпадает"
        );
        Assert.assertEquals(
                webTablesPage.getSubmittedSalary(),
                "0",
                "Значение не совпадает"
        );
        Assert.assertEquals(
                webTablesPage.getSubmittedDepartment(),
                "Mur-mur",
                "Значение не совпадает"
        );
    }

    @Test
    public void checkEditRow() {
        webTablesPage.webTablesOpen();
        Assert.assertTrue(webTablesPage.pageWebTablesTitleValidator());
        webTablesPage.setSearchBox("Kierra");
        driver.findElement(By.xpath("//*[@id='edit-record-3']")).click();
        webTablesPage.fillWebTablesFields("Kokos", "Kokosov", "kokos123@gmail.com", "12", "0", "Mur-mur");
        Assert.assertTrue(webTablesPage.pageWebTablesTitleValidator());
        webTablesPage.setSearchBox("Kokos");
        driver.findElement(By.xpath("//*[@id='edit-record-3']")).click();
        Assert.assertEquals(
                webTablesPage.getSubmittedFirstName(),
                "Kokos",
                "Значение не совпадает"
        );
        Assert.assertEquals(
                webTablesPage.getSubmittedLastName(),
                "Kokosov",
                "Значение не совпадает"
        );
        Assert.assertEquals(
                webTablesPage.getSubmittedUserEmail(),
                "kokos123@gmail.com",
                "Значение не совпадает"
        );
        Assert.assertEquals(
                webTablesPage.getSubmittedAge(),
                "12",
                "Значение не совпадает"
        );
        Assert.assertEquals(
                webTablesPage.getSubmittedSalary(),
                "0",
                "Значение не совпадает"
        );
        Assert.assertEquals(
                webTablesPage.getSubmittedDepartment(),
                "Mur-mur",
                "Значение не совпадает"
        );
    }

    @Test
    public void checkDeleteRow() {
        webTablesPage.webTablesOpen();
        Assert.assertTrue(webTablesPage.pageWebTablesTitleValidator());
        webTablesPage.setSearchBox("Alden");
        driver.findElement(By.xpath("//*[@id='delete-record-2']")).click();
        Assert.assertTrue(webTablesPage.getNoRows());
    }
}
