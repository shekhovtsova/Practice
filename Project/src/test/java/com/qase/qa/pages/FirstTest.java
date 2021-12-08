package com.qase.qa.pages;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.devtools.v85.browser.Browser.close;


public class FirstTest {

        @BeforeClass(alwaysRun = true)
        public void setUp() throws Exception {
            Configuration.browser="chrome";
        }

        @Test
        public void testUntitledTestCase() throws Exception {

            open("https://app.qase.io/login");
            LoginPage loginPage =  open("https://app.qase.io/login", LoginPage.class);
            loginPage.enterLogin("voddoleyka@gmail.com");
            loginPage.enterPassword("7@mQVN!D8xsxd*m");
            Dashboard dashboard = loginPage.clickLoginBtn();
            dashboard.check();

           /* $(UIMap.login).click();
            $(UIMap.login).clear();
            $(UIMap.login).sendKeys("voddoleyka@gmail.com");

            $(UIMap.password).click();
            $(UIMap.password).clear();
            $(UIMap.password).sendKeys("7@mQVN!D8xsxd*m");

            $(UIMap.button).click();*/



            /*$(By.id("inputEmail")).click();
            $(By.id("inputEmail")).clear();
            $(By.id("inputEmail")).sendKeys("voddoleyka@gmail.com");

            $(By.id("inputPassword")).click();
            $(By.id("inputPassword")).clear();
            $(By.id("inputPassword")).sendKeys("7@mQVN!D8xsxd*m");

            $(By.id("btnLogin")).click();*/

        }

        @AfterClass(alwaysRun = true)
        public void tearDown() throws Exception {
            close();
        }



}
