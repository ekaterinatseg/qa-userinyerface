package org.tsegelnikova.forms.pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {
    private final IButton btnClickHere = getElementFactory().getButton(By.xpath("//*[@class='start__link']"), "Click Here");

    public MainPage() {
        super(By.xpath("//*[@class='start__button']"), "Main page");
    }

    public void clickHere() {
        btnClickHere.click();
    }
}
