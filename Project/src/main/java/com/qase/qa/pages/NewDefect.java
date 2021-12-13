package com.qase.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class NewDefect {
    @FindBy(xpath = "/html//div[@id='react-app']/div[@class='app']/div//h1")
    public SelenideElement newDefectHeader;

    @FindBy(id = "title")
    public SelenideElement defectTitle;

    @FindBy(xpath = "/html//div[@id='undefinedGroup']/div[@class='ProseMirror-container markdown-area wysiwyg']/div[@class='auto-height']//div[@class='ProseMirror toastui-editor-contents']")
    public SelenideElement actualResult;

    @FindBy(xpath = "//div[@id='severityGroup']/div[1]/div/div[1]")
    public SelenideElement priority;

    /*@FindBy(id = "react-select-3-option-0")
    public SelenideElement blockerPriority;*/

    @FindBy(id = "react-select-3-option-2")
    public SelenideElement criticalPriority;


    @FindBy(id = "react-select-3-option-6")
    public SelenideElement trivialPriority;

    @FindBy(xpath = "/html//div[@id='react-app']/div[@class='app']/div//form[@class='form-create-defect']/div[5]/div[@class='col-lg-12 col-sm-12 col-xs-12']/div/div/div[1]")
    public SelenideElement assigneeSelector;

    @FindBy(id = "react-select-4-option-1")
    public SelenideElement assigned;

    @FindBy(xpath = "/html//div[@id='react-app']/div[@class='app']//form[@class='form-create-defect']//button[@class='btn btn-primary me-3 save-button']")
    public SelenideElement submit;

    @FindBy(xpath = "/html//div[@id='react-app']/div[@class='app']//table//tr[@class='project-row']/td[2]/div")
    public SelenideElement cardName;



    public void checkNewDefect() {
        newDefectHeader.shouldBe(Condition.visible);
    }

    public void setPriority(String priorityName) {
        priority.click();

        switch (priorityName) {
            case ("Critical"): criticalPriority.click();
            break;
            case ("Normal"): priority.click();
            break;
            case ("Trivial"): trivialPriority.click();
            break;
            default: break;
        }
    }

    public void setAssigned() {
        assigneeSelector.click();
        assigned.click();
    }

    public void addNewDefect(String cardName, String cardDescription, String priorityName) {
        defectTitle.sendKeys(cardName);
        actualResult.sendKeys(cardDescription);
        setPriority(priorityName);
        setAssigned();
        clickSave();
    }

    public void clickSave() {
        submit.click();
    }

    public void checkCardName(String name) {
        cardName.shouldBe(Condition.text(name));
    }


}
