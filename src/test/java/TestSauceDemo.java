import model.SauceDemoUser;
import myLibrary.BaseFunctions;
import org.junit.jupiter.api.Test;
import typeOfTests.EndToEnd;

public class TestSauceDemo {
    private final String URL = "www.saucedemo.com";
    private SauceDemoUser user = new SauceDemoUser
            ("standard_user","secret_sauce"
            , "Edgars","Peregudovs","LV-1010");
    @Test
    public void MainTest(){
        BaseFunctions baseFunctions = new BaseFunctions();
        baseFunctions.openURL(URL);

        EndToEnd pageTest = new EndToEnd(baseFunctions);
        pageTest.fillInUserData(user);
        pageTest.clickLoginBtn();
        pageTest.clickItems();
        pageTest.clickShoppingCartBtn();
        pageTest.fillInCustomerData(user);
        pageTest.finishOrder();
    }
}
