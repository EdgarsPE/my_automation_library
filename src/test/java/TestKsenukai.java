import KsenukaiPages.AsusPage;
import KsenukaiPages.LaptopPage;
import KsenukaiPages.PaymentPage;
import model.ComputerData;
import model.User;
import myLibrary.BaseFunctions;
import org.junit.jupiter.api.Test;
import KsenukaiPages.HomePage;

public class TestKsenukai {
    private final String URL = "www.ksenukai.lv";
    private User user = new User("edgars_peregudovs@inbox.lv",
            "Parole123!", "Edgars",
            "Peregudovs", 29772198,
            "Rīga", "Street", "LV-1010");
    private ComputerData computerData = new ComputerData(500, 1000);

    @Test
    public void ksenukai() {
        BaseFunctions baseFunctions = new BaseFunctions();
        baseFunctions.openURL(URL);

        HomePage homePage = new HomePage(baseFunctions);
        homePage.acceptCookies();
        homePage.registration();
        homePage.fillInUserData(user);
        homePage.clickJoinBtn();
        homePage.sectionComputerEquipment();

        LaptopPage laptopPage = new LaptopPage(baseFunctions);
        laptopPage.chooseComputerSection();
        laptopPage.chooseLaptopSection();
        laptopPage.markPrice(computerData);
        laptopPage.clickToProduct();

        AsusPage asusPage = new AsusPage(baseFunctions);
        asusPage.addItem();
        asusPage.continueToPayment();

       // PaymentPage paymentPage = new PaymentPage(baseFunctions);
      //  paymentPage.fillInFields(user);
      //  paymentPage.clickContinueBtn();
    }
}
