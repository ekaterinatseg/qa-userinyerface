package org.tsegelnikova;

import aquality.selenium.browser.AqualityServices;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.tsegelnikova.base.BaseTest;
import org.tsegelnikova.forms.pages.HelpForm;
import org.tsegelnikova.forms.pages.MainPage;

public class HelpFormTest implements BaseTest {

    @Test
    public void testHelpForm() {
        AqualityServices.getLogger().info("Step 1 :: Navigating to Main Page");
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.state().waitForDisplayed(), "Isn't displayed");
        mainPage.clickHere();

        HelpForm helpForm = new HelpForm();
        Assert.assertTrue(helpForm.state().waitForDisplayed(), "Isn't displayed");

        AqualityServices.getLogger().info("Step 2 :: Hiding Help Form");
        helpForm.clickSendToBottom();

    }
}
