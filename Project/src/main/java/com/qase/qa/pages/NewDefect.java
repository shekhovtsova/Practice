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

    @FindBy(xpath = "//div[@id='severityGroup']/div/div/div")
    public SelenideElement priority;

    @FindBy(id = "react-select-15-option-2")
    public SelenideElement criticalPriority;

    @FindBy(xpath = "/html//div[@id='react-app']/div[@class='app']//form[@class='form-create-defect']//button[@class='btn btn-primary me-3 save-button']")
    public SelenideElement submit;

    public void checkNewDefect() {
        newDefectHeader.shouldBe(Condition.visible);
    }

    public void setPriority() {
        priority.click();
        criticalPriority.click();
    }
}
