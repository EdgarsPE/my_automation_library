package myLibrary;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BaseFunctions {

    private WebDriver browser;
    private WebDriverWait wait;

    /* The default constructor will work with the Chrome browser,
     open a web window in full screen, and wait for 10 seconds
     until elements are loaded. */
public BaseFunctions(){
    browser = new ChromeDriver();
    //browser = new FirefoxDriver();
    browser.manage().window().maximize();
    wait = new WebDriverWait(browser, Duration.ofSeconds(20));

}
    //Create method, which check url protocols and add http:// if url comes without protocol
    public void openURL (String url){
        if(!url.startsWith("http://") && !url.startsWith("https://")){
            url = "http://"+url;
        }
        browser.get(url);
    }

    /*Method who contains WebElement and find elements By locators
    conditions, which can be used to wait for certain events or states on a web page before taking actions.*/
    public WebElement findElement (By locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    //Method which find element by value,Select - Selenium class who work with drop-down windows
    public void selectByValue(By locator, String value){
        Select select = new Select(findElement(locator));
        select.selectByValue(value);
    }

    //Method which find element and compare by text, for drop-down elements
    public void selectByText(By locator, String text){
        Select select = new Select(findElement(locator));
        select.selectByVisibleText(text);
    }

    //Method who click buttons, wait until element be clickable, then click. Get data like locator
    public void click(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    //Methods who type text to web page fields
    public void type(By locator, String text){
        WebElement inputField = findElement(locator); //Create new object which use findElement method and get parameters by locatorS
        inputField.clear(); //clear field if there is something write
        inputField.sendKeys(text); // send our text, which are we created in pages -class
    }
    // Create the same method type, but incoming value is int
    public void type(By locator, int text){
        type(locator,String.valueOf(text));// Use methods, which we create before  and transform int to String
    }
    /* A method similar to the type method, but instead of clearing the input field through conventional means,
     it uses keyboard commands. This method can be employed when the type function is not functioning as expected.*/
    public void deleteAndType(By locator, String text){
        WebElement inputField = findElement(locator);
        inputField.sendKeys(Keys.CONTROL + "a");
        inputField.sendKeys(Keys.DELETE);
        inputField.sendKeys(text);
    }
    public void deleteAndType(By locator, int text){deleteAndType(locator, String.valueOf(text));}


    // Method that returns a list of elements with the specified locators.
    public List<WebElement> getList(By locators){
        List<WebElement> elements = browser.findElements(locators);
        return elements;
    }
    //Method which pause all test to 5 seconds
    public void pauseTest(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }}

    //The scrollDown function is designed to automatically scroll the page down to make a specified HTML element.
    public void scrollDown(By locator){
        WebElement element = browser.findElement(locator);
        ((JavascriptExecutor)browser).executeScript("arguments[0].scrollIntoView(true);",element);
        element.click();
    }
    /*This function is designed to switch between browser
    windows when multiple windows are open simultaneously.*/
    public void switchWindows(){
        String currentWindow = browser.getWindowHandle();
        for (String windowHandle : browser.getWindowHandles()){
            if (!windowHandle.equals(currentWindow)){
                browser.switchTo().window(windowHandle);
                break;}}}

    public void closeBrowser(){
        browser.close();
    }

    public void overlappedElement(WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor) browser;
        executor.executeScript("arguments[0].click();", element);
    }


}
