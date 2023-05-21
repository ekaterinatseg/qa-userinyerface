package org.tsegelnikova.forms.pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import org.tsegelnikova.util.FileUtil;
import org.tsegelnikova.util.GenerateUtil;

import java.util.List;
import java.util.Objects;

public class SecondCard extends Form {
    private final List<String> randomInterest = GenerateUtil.generateInterest();
    private final ICheckBox chckbUnselectAll = getElementFactory().getCheckBox(By.xpath("//*[@for='interest_unselectall']"), "Unselect All");
    private final ICheckBox chckbFirstInterest = getElementFactory().getCheckBox(By.xpath("//*[@for='interest_" + randomInterest.get(0) + "']"), "First Interest");
    private final ICheckBox chckbSecondInterest = getElementFactory().getCheckBox(By.xpath("//*[@for='interest_" + randomInterest.get(1) + "']"), "Second Interest");
    private final ICheckBox chckbThirdInterest = getElementFactory().getCheckBox(By.xpath("//*[@for='interest_" + randomInterest.get(2) + "']"), "Third Interest");
    private final IButton btnUpload = getElementFactory().getButton(By.xpath("//*[@class='avatar-and-interests__upload-button']"), "Upload");
    private final IButton btnNext = getElementFactory().getButton(By.xpath("//*[@class='button button--stroked button--white button--fluid']"), "Next");

    public SecondCard() {
        super(By.xpath("//*[@class='avatar-and-interests__form']"), "Second Card");
    }

    public void checkSelectAll() {
        chckbUnselectAll.getJsActions().scrollIntoView();
        chckbUnselectAll.check();
    }

    public void checkFirstInterest() {
        chckbFirstInterest.getJsActions().scrollIntoView();
        chckbFirstInterest.check();
    }

    public void checkSecondInterest() {
        chckbSecondInterest.getJsActions().scrollIntoView();
        chckbSecondInterest.check();
    }

    public void checkThirdInterest() {
        chckbThirdInterest.getJsActions().scrollIntoView();
        chckbThirdInterest.check();
    }

    public void clickBtnUpload() {
        btnUpload.clickAndWait();
    }

    public void clickBtnNext() {
        btnNext.getJsActions().clickAndWait();
    }

    public void uploadImage() {
        String pathToImageWithAvatar = Objects.requireNonNull(FileUtil.class.getClassLoader().getResource("cat.jpg")).getFile();
        FileUtil.uploadFile("file://" + pathToImageWithAvatar);
    }
}
