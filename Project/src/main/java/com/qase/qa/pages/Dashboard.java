package com.qase.qa.pages;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class Dashboard {
    public void check() {
        $(UIMap.link).shouldBe(Condition.visible);
    }
}
