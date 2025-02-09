package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {

    @Test
    public void checkNoteCheckBoxActivated() {
        checkBoxPage.checkBoxOpen();
        Assert.assertTrue(checkBoxPage.pageCheckBoxValidator());
        checkBoxPage.expandAllClick();
        checkBoxPage.checkBoxClick("Notes");
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(0),
                "notes",
                "В результатах отсутствует отмеченный чек бокс"
        );
    }

    @Test
    public void checkAllCheckBoxesActivated() {
        checkBoxPage.checkBoxOpen();
        Assert.assertTrue(checkBoxPage.pageCheckBoxValidator());
        checkBoxPage.checkBoxClick("Home");
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(0),
                "home",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(1),
                "desktop",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(2),
                "notes",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(3),
                "commands",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(4),
                "documents",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(5),
                "workspace",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(6),
                "react",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(7),
                "angular",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(8),
                "veu",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(9),
                "office",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(10),
                "public",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(11),
                "private",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(12),
                "classified",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(13),
                "general",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(14),
                "downloads",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(15),
                "wordFile",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(16),
                "excelFile",
                "В результатах отсутствует отмеченный чек бокс"
        );
    }

    @Test
    public void checkAllCheckBoxesAndUncheckOne() {
        checkBoxPage.checkBoxOpen();
        Assert.assertTrue(checkBoxPage.pageCheckBoxValidator());
        checkBoxPage.expandAllClick();
        checkBoxPage.checkBoxClick("Home");
        checkBoxPage.checkBoxClick("Excel File.doc");
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(0),
                "desktop",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(1),
                "notes",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(2),
                "commands",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(3),
                "documents",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(4),
                "workspace",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(5),
                "react",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(6),
                "angular",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(7),
                "veu",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(8),
                "office",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(9),
                "public",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(10),
                "private",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(11),
                "classified",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(12),
                "general",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(13),
                "wordFile",
                "В результатах отсутствует отмеченный чек бокс"
        );
    }

    @Test
    public void checkExpandCheckBoxes() {
        checkBoxPage.checkBoxOpen();
        Assert.assertTrue(checkBoxPage.pageCheckBoxValidator());
        checkBoxPage.checkBoxOpen("Home");
        checkBoxPage.checkBoxClick("Downloads");
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(0),
                "downloads",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(1),
                "wordFile",
                "В результатах отсутствует отмеченный чек бокс"
        );
        Assert.assertEquals(
                checkBoxPage.resultTextSuccess().get(2),
                "excelFile",
                "В результатах отсутствует отмеченный чек бокс"
        );
    }
}
