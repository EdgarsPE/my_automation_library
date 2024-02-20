package KsenukaiPages;

import model.User;
import myLibrary.BaseFunctions;
import org.openqa.selenium.By;

public class PaymentPage {
    private final By NAME =By.id("address_first_name");
    private final By LASTNAME =By.id("address_last_name");
    private final By PHONE =By.id("address_phone_number");
    private final By CITY =By.id("select2-address_city_id-container");
    private final By ADDRESS =By.id("address_street");
    private final By ZIP =By.id("address_postal_code");
    private final By CITY_NAME =By.xpath(".//span[@title='Rīga']");
    private final By CONTINUE_BTN=By.xpath(".//button[@class='main-button upcase fr small-radius button-min-width checkout-shipping-continue-button']");


    private BaseFunctions baseFunctions;

    public PaymentPage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
    }
    public void fillInFields(User user){
        baseFunctions.type(NAME,user.getName());
        baseFunctions.type(LASTNAME, user.getSurname());
        baseFunctions.type(PHONE,user.getPhone());
        baseFunctions.click(CITY);
        baseFunctions.findElement(CITY_NAME).click();
        baseFunctions.type(ADDRESS,user.getAddress());
        baseFunctions.type(ZIP,user.getZip());
    }
    public void clickContinueBtn(){
        baseFunctions.findElement(CONTINUE_BTN).click();
    }
}
