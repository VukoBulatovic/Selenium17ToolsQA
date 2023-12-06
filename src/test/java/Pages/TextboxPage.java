package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextboxPage {

    public WebDriver driver;
    public WebDriverWait wait;
    WebElement fullNameField;
    WebElement emailField;
    WebElement permanentAddress;
    WebElement currentAdress;
    WebElement submitButton;
    WebElement resultName;
    WebElement resultEmail;
    WebElement resultPermanentAddress;
    WebElement resultCurrentAddress;
    WebElement output;

    //konstruktori


    public TextboxPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    //getteri


    public WebElement getFullNameField() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmailField() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getCurrentAdress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getResultName() {
        return driver.findElement(By.id("name"));
    }

    public WebElement getResultEmail() {
        return driver.findElement(By.id("email"));
    }

    public WebElement getResultPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getResultCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getOutput() {
        return driver.findElement(By.id("output"));
    }

    //metode

    public void inputFullName(String fullname){
        getFullNameField().clear();
        getFullNameField().sendKeys(fullname);
    }

    public void inputEmail(String email){
        getEmailField().clear();
        getEmailField().sendKeys(email);
    }

    public void inputPermanentAddress(String permanentAddress){
        getPermanentAddress().clear();
        getPermanentAddress().sendKeys(permanentAddress);
    }

    public void inputCurrentAddress(String currentAddress){
        getCurrentAdress().clear();
        getCurrentAdress().sendKeys(currentAddress);
    }

    public void clickSubmit(){
        getSubmitButton().click();
    }

    public String outputText(){
        return getOutput().getText();
    }








}
