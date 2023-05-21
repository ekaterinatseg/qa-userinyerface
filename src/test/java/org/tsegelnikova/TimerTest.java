package org.tsegelnikova;

import aquality.selenium.browser.AqualityServices;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.tsegelnikova.base.BaseTest;
import org.tsegelnikova.forms.pages.MainPage;
import org.tsegelnikova.forms.pages.Timer;
import org.tsegelnikova.util.ParsingUtil;

public class TimerTest implements BaseTest {

    @Test
    public void testTimer() {
        AqualityServices.getLogger().info("Step 1 :: Navigating to Main Page");
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.state().waitForDisplayed(), "Isn't displayed");
        mainPage.clickHere();

        Timer timer = new Timer();
        Assert.assertTrue(timer.state().waitForDisplayed(), "Isn't displayed");

        AqualityServices.getLogger().info("Step 2 :: Validating Timer");
        Assert.assertEquals(timer.getTextFromTimer(), ParsingUtil.getTestDataByName("/expectedTime"), "Time isn't equal");
    }
}
