package org.tsegelnikova.forms.pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class Timer extends Form {
    private final ILabel lblTimer = getElementFactory().getLabel(By.xpath("//*[@class='timer timer--white timer--center']"), "Timer");

    public Timer() {
        super(By.xpath("//*[@class='timer timer--white timer--center']"), "Timer");
    }

    public String getTextFromTimer() {
        String[] timerArray = lblTimer.getText().split(":");
        return timerArray[0] + ":" + timerArray[1];
    }
}
