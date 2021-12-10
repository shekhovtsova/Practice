package com.qase.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class DefectPage {
    @FindBy(xpath = "/html//div[@id='react-app']//div[@class='d-flex']/h1[.='Defects']")
    public SelenideElement defectPage;

    @FindBy(linkText = "Create new defect")
    public SelenideElement createNewDefect;

    public void checkDefectPage() {
        defectPage.shouldBe(Condition.visible);
    }

    public NewDefect createDefect() {
        createNewDefect.click();
        return page(NewDefect.class);
    }
}
