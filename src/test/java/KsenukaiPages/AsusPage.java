package KsenukaiPages;

import myLibrary.BaseFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AsusPage {
    private final By ADD_BTN = By.id("add_to_cart_btn");
    private final By CHECK_CART_BTN = By.xpath(".//a[@class='main-button']");
    private final By PAYMENT_BTN = By.xpath(".//input[contains(@class, 'main-button--large')]");
    private BaseFunctions baseFunctions;

    public AsusPage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
    }
    public void addItem(){
        baseFunctions.findElement(ADD_BTN).click();
        baseFunctions.findElement(CHECK_CART_BTN).click();
    }
    public void continueToPayment(){
        WebElement element = baseFunctions.findElement(PAYMENT_BTN);
        baseFunctions.overlappedElement(element);
    }
}
