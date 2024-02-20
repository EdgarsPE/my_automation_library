package typeOfTests;


import model.SauceDemoUser;
import myLibrary.BaseFunctions;
import org.openqa.selenium.By;

public class EndToEnd {
    private final By USER_NAME = By.id("user-name");
    private final By PASSWORD = By.id("password");
    private final By LOGIN_BTN = By.id("login-button");
    private final By ITEM_ONE = By.id("add-to-cart-sauce-labs-backpack");
    private final By ITEM_TWO = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    private final By SHOPPING_CART = By.id("shopping_cart_container");
    private final By CHECKOUT_BTN =By.id("checkout");
    private final By FIRST_NAME = By.id("first-name");
    private final By LAST_NAME = By.id("last-name");
    private final By ZIP = By.id("postal-code");
    private final By CONTINUE_BTN = By.id("continue");
    private final By FINISH_BTN = By.id("finish");
    private final By BACK_BTN = By.id("back-to-products");
    private final By BURGER_MENU = By.id("react-burger-menu-btn");
    private final By LOG_OUT = By.id("logout_sidebar_link");

    private BaseFunctions baseFunctions;

    public EndToEnd(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
    }

    public void fillInUserData(SauceDemoUser sauceDemoUser){
        baseFunctions.type(USER_NAME, sauceDemoUser.getUsername());
        baseFunctions.type(PASSWORD, sauceDemoUser.getPassword());
    }
    public void clickLoginBtn(){
        baseFunctions.click(LOGIN_BTN);
    }
    public void clickItems(){
        baseFunctions.findElement(ITEM_ONE).click();
        baseFunctions.findElement(ITEM_TWO).click();
    }
    public void clickShoppingCartBtn(){
        baseFunctions.click(SHOPPING_CART);
        baseFunctions.click(CHECKOUT_BTN);
    }
    public void fillInCustomerData(SauceDemoUser sauceDemoUser){
        baseFunctions.type(FIRST_NAME, sauceDemoUser.getFirstName());
        baseFunctions.type(LAST_NAME, sauceDemoUser.getLastName());
        baseFunctions.type(ZIP, sauceDemoUser.getZip());
        baseFunctions.click(CONTINUE_BTN);
    }
    public void finishOrder(){
        baseFunctions.click(FINISH_BTN);
        baseFunctions.click(BACK_BTN);
        baseFunctions.findElement(BURGER_MENU).click();
        baseFunctions.click(LOG_OUT);
        baseFunctions.closeBrowser();
    }

}
