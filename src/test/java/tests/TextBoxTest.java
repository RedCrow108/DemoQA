package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {

    @Test
    public void checkSubmitAllValidFields() { //Проверка ввода валидных данных для всех полей
        textBoxPage.textBoxOpen();
        Assert.assertTrue(textBoxPage.pageTextBoxValidator());
        textBoxPage.fillFields("Kokos", "kokos@gmail.com", "City1", "City2");
        Assert.assertEquals(
                textBoxPage.getSubmittedName(),
                "Name:Kokos",
                "Имя не совпадает"
        );

        Assert.assertEquals(
                textBoxPage.getSubmittedEmail(),
                "Email:kokos@gmail.com",
                "Email не совпадает"
        );

        Assert.assertEquals(
                textBoxPage.getSubmittedCurrentAddress(),
                "Current Address :City1",
                "Current Address не совпадает"
        );

        Assert.assertEquals(
                textBoxPage.getSubmittedPermanentAddress(),
                "Permananet Address :City2",
                "Permanent Address не совпадает"
        );
    }

    @Test
    public void checkSubmitEmailOnlyField() { //Проверка ввода только валидного Email
        textBoxPage.textBoxOpen();
        Assert.assertTrue(textBoxPage.pageTextBoxValidator());
        textBoxPage.fillFields("", "kokos@gmail.com", "", "");
        Assert.assertEquals(
                textBoxPage.getSubmittedEmail(),
                "Email:kokos@gmail.com",
                "Email не совпадает"
        );
    }

    @Test
    public void checkSubmitNotValidEmailField() { //Проверка ввода только не валидного Email
        textBoxPage.textBoxOpen();
        Assert.assertTrue(textBoxPage.pageTextBoxValidator());
        textBoxPage.fillFields("", "kokos", "", "");
        Assert.assertTrue(textBoxPage.notValidEmail());
    }
}
