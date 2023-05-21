package org.tsegelnikova;

import aquality.selenium.browser.AqualityServices;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.tsegelnikova.base.BaseTest;
import org.tsegelnikova.forms.pages.*;
import org.tsegelnikova.util.GenerateUtil;
import org.tsegelnikova.util.ParsingUtil;

public class CardsTest implements BaseTest {

    @Test
    public void testCards() {
        AqualityServices.getLogger().info("Step 1 :: Navigating to Main Page");
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.state().waitForDisplayed(), "Isn't displayed");
        AqualityServices.getLogger().info("Step 2 :: Clicking the link");
        mainPage.clickHere();

        FirstCard firstCard = new FirstCard();
        Assert.assertTrue(firstCard.state().waitForDisplayed(), "Isn't displayed");

        AqualityServices.getLogger().info("Step 3 :: Filling User Form");
        String password = GenerateUtil.generateString();
        firstCard.fillUserForm(password, password.charAt(1) + GenerateUtil.generateString(),
                ParsingUtil.getTestDataByName("/domain"));

        SecondCard secondCard = new SecondCard();
        Assert.assertTrue(secondCard.state().waitForDisplayed(), "Isn't displayed");

        AqualityServices.getLogger().info("Step 4 :: Uploading image");
        secondCard.clickBtnUpload();
        secondCard.uploadImage();

        AqualityServices.getLogger().info("Step 5 :: Choosing interests");
        secondCard.checkSelectAll();
        secondCard.checkFirstInterest();
        secondCard.checkSecondInterest();
        secondCard.checkThirdInterest();

        AqualityServices.getLogger().info("Step 6 :: Clicking the 'Next' button");
        secondCard.clickBtnNext();

        ThirdCard thirdCard = new ThirdCard();
        Assert.assertTrue(thirdCard.state().waitForDisplayed(), "Isn't displayed");

    }
}
