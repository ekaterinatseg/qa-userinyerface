package org.tsegelnikova.forms.pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class AcceptCookies extends Form {
    private final IButton btnNotReally = getElementFactory().getButton(By.xpath("//*[@class='button button--solid button--transparent']"), "Accept cookies");

    public AcceptCookies() {
        super(By.xpath("//*[@class='cookies__message']"), "Accept Cookies");
    }

    public void clickNotReallyBtn() {
        btnNotReally.click();
    }
}
