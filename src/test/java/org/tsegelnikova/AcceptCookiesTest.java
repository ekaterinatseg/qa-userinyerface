package org.tsegelnikova;

import aquality.selenium.browser.AqualityServices;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.tsegelnikova.base.BaseTest;
import org.tsegelnikova.forms.pages.AcceptCookies;
import org.tsegelnikova.forms.pages.MainPage;

public class AcceptCookiesTest implements BaseTest {

    @Test
    public void testCookies() {
        AqualityServices.getLogger().info("Step 1 :: Navigating to Main Page");
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.state().waitForDisplayed(), "Isn't displayed");
        mainPage.clickHere();

        AcceptCookies acceptCookies = new AcceptCookies();
        Assert.assertTrue(acceptCookies.state().waitForDisplayed(), "Isn't displayed");
        AqualityServices.getLogger().info("Step 2 :: Accepting cookies");
        acceptCookies.clickNotReallyBtn();

    }
}
