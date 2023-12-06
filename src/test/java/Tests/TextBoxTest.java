package Tests;

import Base.BaseTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TextBoxTest extends BaseTest {

    String fullname = "Vuko";
    String email = "blabla@gmail.com";
    String currentAddress = "Marka Markovica 1";
    String permanentAddress = "Zarka Zarkovica 25/10";

    @BeforeEach
    public void pageSetUp(){
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void userCanSubmitTextBox(){
        homePage.clickOnElementsCard();
        //homePage.clickOnCard("Elements");
        sidebarPage.clickOnSideBarButton("Text Box");
        textboxPage.inputFullName(fullname);
        textboxPage.inputEmail(email);
        textboxPage.inputPermanentAddress(permanentAddress);
        textboxPage.inputCurrentAddress(currentAddress);
        textboxPage.clickSubmit();

        /*assertTrue(textboxPage.getResultName().isDisplayed());
        assertTrue(textboxPage.getResultEmail().isDisplayed());
        assertTrue(textboxPage.getResultCurrentAddress().isDisplayed());
        assertTrue(textboxPage.getResultPermanentAddress().isDisplayed());*/

        assertTrue(textboxPage.getOutput().isDisplayed());
        assertEquals(textboxPage.outputText(),"Name:" + fullname + "\n" +
                                                    "Email:" + email + "\n" +
                                                    "Current Address :" + currentAddress + "\n" +
                                                    "Permananet Address :" + permanentAddress);
    }

}
