package KsenukaiPages;

import model.ComputerData;
import myLibrary.BaseFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LaptopPage {
    private final By COMPUTER_SECTION_IMG = By.xpath(".//img[@title='Portatīvie datori un citas preces']");
    private final By LAPTOP_SECTION_IMG = By.xpath(".//img[@title='Portatīvie datori']");
    private final By PRICE_FROM = By.id("attr-from-price");
    private final By PRICE_TO = By.id("attr-to-price");
    private final By LAPTOP = By.xpath(".//a[@data-gtm-link='1344055']");
    private BaseFunctions baseFunctions;

    public LaptopPage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
    }
    public void chooseComputerSection(){baseFunctions.findElement(COMPUTER_SECTION_IMG).click();}
    public void chooseLaptopSection(){baseFunctions.findElement(LAPTOP_SECTION_IMG).click();}
    public void markPrice(ComputerData computerData){
        baseFunctions.deleteAndType(PRICE_FROM, computerData.getFrom());
        baseFunctions.deleteAndType(PRICE_TO, computerData.getTo());
    }
    public void clickToProduct() {
        WebElement element = baseFunctions.findElement(LAPTOP);
        baseFunctions.overlappedElement(element);
    }

}
