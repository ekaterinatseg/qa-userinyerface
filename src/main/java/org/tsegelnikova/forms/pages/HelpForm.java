package org.tsegelnikova.forms.pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class HelpForm extends Form {
    private final IButton btnSendToBottom = getElementFactory().getButton(By.xpath("//*[@class='button button--solid button--blue help-form__send-to-bottom-button']"), "Send To Bottom");

    public HelpForm() {
        super(By.xpath("//*[@class='help-form__help-button']"), "Help Form");
    }

    public void clickSendToBottom() {
        btnSendToBottom.getJsActions().click();
    }
}
