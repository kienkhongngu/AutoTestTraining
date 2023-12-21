package autotest.common;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonBase {
    public WebDriver driver;
    private final int initWaitTime = 10;

    // Initialize Chrome driver
    public WebDriver initChromeDriver(String URL) {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        // For MAC: System.getProperty("user.dir") + "/driver/chromedriver");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        return driver;
    }

    /*
     * Check if an element is displayed
     * Positive case: Returns true
     * Negative case: Returns false (or catches exceptions and returns false)
     */
    public boolean isElementPresent(By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(initWaitTime));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return driver.findElement(locator).isDisplayed();
        } catch (NoSuchElementException | TimeoutException e) {
            return false;
        }
    }

    // Get the web element after waiting for it to be present
    public WebElement getElementPresentDOM(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(initWaitTime));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator);
    }

    // Click on the web element
    public void click(By locator) {
        WebElement element = getElementPresentDOM(locator);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(initWaitTime));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    // Click on the web element using JavaScript Executor
    public void clickByJsExecutor(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", locator);
    }

    // Submit a form using JavaScript Executor
    public void submitJs(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.forms[0].submit();", locator);
    }

    // Type text into an input field
    public void type(By locator, String value) {
        WebElement element = getElementPresentDOM(locator);
        element.clear();
        element.sendKeys(value);
    }

    // Type text into an input field using JavaScript Executor
    public void typeInValue_ByJsExecutor(By locator, String value) throws InterruptedException {
        WebElement element = getElementPresentDOM(locator);
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].value = '" + value + "'", element);
        } catch (StaleElementReferenceException ex) {
            pause(1000);
            typeInValue_ByJsExecutor(locator, value);
        }
    }

    // Input text into the innerHTML attribute of an element using JavaScript Executor
    public void inputTextJavaScript_ToInnerHTMLAttribute(By inputElement, String value) {
        WebElement element = driver.findElement(inputElement);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        try {
            executor.executeScript("arguments[0].innerHTML = '" + value + "'", element);
        } catch (StaleElementReferenceException ex) {
            pause(1000);
            inputTextJavaScript_ToInnerHTMLAttribute(inputElement, value);
        }
    }

    // Pause execution for a specified duration
    public void pause(long miliSeconds) {
        try {
            Thread.sleep(miliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Scroll to the element, making it visible on the screen
    public void scrollToElement(By locator) {
        WebElement element = getElementPresentDOM(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    // Close the WebDriver
    public void closeDriver() {
        if (driver != null) {
            driver.close();
        }
    }

    // Initialize Chrome driver with default URL
    private WebDriver initChromeDriver() {
        System.out.println("Launching system on Chrome driver..");
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        return driver;
    }

    // Initialize Firefox driver
    private WebDriver initFirefoxDriver() {
        System.out.println("Launching system on Firefox driver..");
        FirefoxOptions options = new FirefoxOptions();
        System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");
        driver = new FirefoxDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        return driver;
    }

    // Initialize Microsoft Edge driver
    private WebDriver initMSEdgeDriver() {
        System.out.println("Launching system on MS Edge driver..");
        EdgeOptions options = new EdgeOptions();
        System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\driver\\msedgedriver.exe");
        driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        return driver;
    }

    // Set up the WebDriver based on the specified browser name
    public void setupDriver(String browserName) {
        switch (browserName.trim().toLowerCase()) {
            case "chrome":
                driver = initChromeDriver();
                break;
            case "firefox":
                driver = initFirefoxDriver();
                break;
            case "edge":
                driver = initMSEdgeDriver();
                break;
            default:
                System.out.println("No browser name was passed in parameter");
                driver = initChromeDriver();
        }
    }
}
