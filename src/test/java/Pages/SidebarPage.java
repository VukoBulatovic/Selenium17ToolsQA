package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SidebarPage {

    public WebDriver driver;
    public WebDriverWait wait;
    WebElement sidebarButton;

    public SidebarPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public List<WebElement> getSidebarButton() {
        return driver.findElements(By.className("text"));
    }

    //========================

    public void clickOnSideBarButton (String buttonName){
        for (int i = 0; i < getSidebarButton().size(); i++) {
            if(getSidebarButton().get(i).getText().equals(buttonName)){
                getSidebarButton().get(i).click();
                break;
            }
        }
    }



}
