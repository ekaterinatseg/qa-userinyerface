package org.tsegelnikova.forms.pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class FirstCard extends Form {
    private final ITextBox txbChoosePassword = getElementFactory().getTextBox(By.xpath("//*[@placeholder='Choose Password']"), "Choose Password");
    private final ITextBox txbYourEmail = getElementFactory().getTextBox(By.xpath("//*[@placeholder='Your email']"), "Your Email");
    private final ITextBox txbDomain = getElementFactory().getTextBox(By.xpath("//*[@placeholder='Domain']"), "Domain");
    private final ICheckBox chckbDoNotAccept = getElementFactory().getCheckBox(By.xpath("//*[@class='icon icon-check checkbox__check']"), "Do Not Accept");
    private final IButton btnNext = getElementFactory().getButton(By.xpath("//*[@class='button--secondary']"), "Next");
    private final IButton btnOther = getElementFactory().getButton(By.xpath("//*[@class='dropdown__field']"), "Other");
    private final IButton btnDotOrg = getElementFactory().getButton(By.xpath("//*[@class='dropdown__list-item'][text()='.org']"), ".org");

    public FirstCard() {
        super(By.xpath("//*[@class='login-form__container']"), "First Card");
    }

    public void fillUserForm (String password, String email, String domain) {
        txbChoosePassword.click();
        txbChoosePassword.clearAndType(password);

        txbYourEmail.click();
        txbYourEmail.clearAndType(email);

        txbDomain.click();
        txbDomain.clearAndType(domain);

        btnOther.click();
        btnDotOrg.click();
        chckbDoNotAccept.getJsActions().scrollIntoView();
        chckbDoNotAccept.check();
        btnNext.click();

    }

}
