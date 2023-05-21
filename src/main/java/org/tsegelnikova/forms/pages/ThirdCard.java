package org.tsegelnikova.forms.pages;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ThirdCard extends Form {
    public ThirdCard() {
        super(By.xpath("//*[@class='personal-details']"), "Third Card");
    }
}
