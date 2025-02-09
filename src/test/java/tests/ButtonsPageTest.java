package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsPageTest extends BaseTest {

    @Test
    public void checkDoubleClick() {
        buttonsPage.buttonsPageOpen();
        buttonsPage.pageButtonsPageValidator();
        buttonsPage.doubleClickMethod();
        Assert.assertEquals(
                buttonsPage.getDoubleClickMessage(),
                "You have done a double click",
                "Error"
        );
    }

    @Test
    public void checkRightClick() {
        buttonsPage.buttonsPageOpen();
        buttonsPage.pageButtonsPageValidator();
        buttonsPage.rightClickMethod();
        Assert.assertEquals(
                buttonsPage.getRightClickMessage(),
                "You have done a right click",
                "Error"
        );

    }

    @Test
    public void checkDynamicClick() {
        buttonsPage.buttonsPageOpen();
        buttonsPage.pageButtonsPageValidator();
        buttonsPage.usualClickMethod();
        Assert.assertEquals(
                buttonsPage.getDynamicClickMessage(),
                "You have done a dynamic click",
                "Error"
        );
    }
}
