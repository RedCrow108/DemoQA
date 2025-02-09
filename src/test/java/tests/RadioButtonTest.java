package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    public void checkYesRadioButtonActivated() {
        radioButtonPage.radioButtonOpen();
        Assert.assertTrue(radioButtonPage.pageRadioButtonValidator());
        radioButtonPage.yesButtonClick();
        Assert.assertEquals(
                radioButtonPage.getRadioResultText(),
                "You have selected Yes",
                "Результат не верный"
        );
    }

    @Test
    public void checkImpressiveButtonActivated() {
        radioButtonPage.radioButtonOpen();
        Assert.assertTrue(radioButtonPage.pageRadioButtonValidator());
        radioButtonPage.impressiveButtonClick();
        Assert.assertEquals(
                radioButtonPage.getRadioResultText(),
                "You have selected Impressive",
                "Результат не верный"
        );
    }

    @Test
    public void checkNoButtonCantBeActivated() {
        radioButtonPage.radioButtonOpen();
        Assert.assertTrue(radioButtonPage.pageRadioButtonValidator());
        radioButtonPage.noButtonElement();
        Assert.assertFalse(
                radioButtonPage.noButtonElement(),
                "Результат не верный");
    }
}
