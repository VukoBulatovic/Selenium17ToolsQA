package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {

    public WebDriver driver;
    public WebDriverWait wait;
    WebElement cards;

  //constructor
    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    //getteri
    public List<WebElement> getCards() {
        return driver.findElements(By.className("card-body"));
    }


    //metode

    public void clickOnElementsCard(){
        for (int i = 0; i < getCards().size(); i++) {
            if(getCards().get(i).getText().equals("Elements")){
                getCards().get(i).click();
                break;
            }
        }
    }


    public void clickOnFormsCard(){
        for (int i = 0; i < getCards().size(); i++) {
            if(getCards().get(i).getText().equals("Forms")){
                getCards().get(i).click();
                break;
            }
        }
    }

    public void clickOnAlertsCard(){
        for (int i = 0; i < getCards().size(); i++) {
            if(getCards().get(i).getText().equals("Alerts, Frame & Windows")){
                getCards().get(i).click();
                break;
            }
        }
    }

    public void clickOnWidgetsCard(){
        for (int i = 0; i < getCards().size(); i++) {
            if(getCards().get(i).getText().equals("Widgets")){
                getCards().get(i).click();
                break;
            }
        }
    }

    public void clickOnInteractionsCard(){
        for (int i = 0; i < getCards().size(); i++) {
            if(getCards().get(i).getText().equals("Interactions")){
                getCards().get(i).click();
                break;
            }
        }
    }

    public void clickOnBookStoreCard(){
        for (int i = 0; i < getCards().size(); i++) {
            if(getCards().get(i).getText().equals("Book Store Application")){
                getCards().get(i).click();
                break;
            }
        }
    }


    //--------------------

    public void clickOnCard(String cardName){
        for (int i = 0; i < getCards().size(); i++) {
            if(getCards().get(i).getText().equals(cardName)){
                getCards().get(i).click();
                break;
            }
        }
    }



}
