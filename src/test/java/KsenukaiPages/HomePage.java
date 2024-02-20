package KsenukaiPages;

import model.ComputerData;
import model.User;
import myLibrary.BaseFunctions;
import org.openqa.selenium.By;

public class HomePage {
    private final By ACCEPT_COOKIES = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By REGISTRATION_BTN =By.xpath(".//div[@class='user-block__title']");
    private final By USER_EMAIL = By.id("user_email");
    private final By USER_PASSWORD = By.id("user_password");
    private final By JOIN_BTN = By.xpath(".//input[@class='users-session-form__submit']");
    private final By COMPUTER_EQUIPMENT_BTN = By.xpath(".//a[@class='submenu-lvl1__link' and @href='/c/datortehnika-preces-birojam/cu1']");
    private BaseFunctions baseFunctions;

    public HomePage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
    }
    public void registration(){baseFunctions.findElement(REGISTRATION_BTN).click();}
    public void acceptCookies(){baseFunctions.findElement(ACCEPT_COOKIES).click();}
    public void fillInUserData(User user){
        baseFunctions.type(USER_EMAIL, user.getEmail());
        baseFunctions.type(USER_PASSWORD,user.getPassword());
    }
    public void clickJoinBtn(){baseFunctions.findElement(JOIN_BTN).click();}
    public void sectionComputerEquipment(){baseFunctions.getList(COMPUTER_EQUIPMENT_BTN).get(1).click();}




}
