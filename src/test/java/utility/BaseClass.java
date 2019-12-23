package utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

//import org.apache.commons.el.parser.ParseException;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.apache.poi.xwpf.usermodel.BreakClear;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.DriverMobileCommand;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BaseClass {

	private static final String String = null;
	private static final LongPressOptions LongPressOptions = null;
	static boolean b = true;
	public String TestReportspath;
	public String suiteName;
	public String TestName = null;
	public String TestFullName = null;
	public String winHandleBefore = null;
	public List<String> desc = new ArrayList<String>();
	int r;
	public Map<String, String> reportDetails = new HashMap();
	
	public Logger log = Logger.getLogger(BaseClass.class);
	public static ReadData readData = new ReadData();
	public HtmlReport htmlrep = new HtmlReport();
	// public static WebDriver driver = null;
	public String userTypev = null;
	public String mobile = null;
	public String nouserData = "";
	public String name = null;
	public String pageCount = null;
	public String nameVal = null;
	public String header = null;
	public String emailId = null;
	public String emailIdRetailer = null;
	public String tableBanner = null;
	public String tableBannertwo = null;
	public WebElement element = null;
	public String loginValidation = null;
	public static AndroidDriver<WebElement> driver;
	public String text = null;
	public String entirePageValidation;
	public String text22;
	public String[] searchproduct;

	public void mobileLaunchPrecondition() throws Exception {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "c52d68ff");
		dc.setCapability("platformVersion", "7.1.1");
		dc.setCapability("platformName", "Android");
		dc.setCapability("appPackage", "com.ongo.wanafood");
		dc.setCapability("appActivity", "com.ongo.wanafood.SplashScreenActivity");
		dc.setCapability("fullReset", false);
		//dc.setCapability("noReset", true);
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	/*
	 * public void openBrowser(String browserName) { if
	 * (browserName.equalsIgnoreCase("firefox")) {
	 * System.setProperty("webdriver.gecko.driver", ".\\Lib\\geckodriver.exe");
	 * driver=new FirefoxDriver(); } else if (browserName.equalsIgnoreCase("ie")) {
	 * System.setProperty("webdriver.ie.driver",
	 * System.getProperty("user.dir")+"\\Lib\\IEDriverServer.exe"); driver = new
	 * InternetExplorerDriver();
	 * 
	 * } else if (browserName.equalsIgnoreCase("chrome")) {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Selenium Training\\pattabhi_adminconsole_mobile_framework\\chromedriver.exe"
	 * ); driver = new ChromeDriver(); }
	 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 * driver.manage().window().maximize(); }
	 */

	public void openURL(String url) throws Exception {
		try {
			driver.get(url);
			log.info("Opened the URL " + url);
		} catch (RuntimeException e) {
			log.fatal("Unable to Open the URL " + e.getMessage());
		}

	}

	public void click(By locator) throws Exception {
		try {
			driver.findElement(locator).click();
			log.info("Clicked on " + locator);
		} catch (Exception e) {
			log.error("Unable to click on " + locator);
		}
	}

	public void click(String locator) throws Exception {
		try {
			driver.findElement(By.linkText(locator)).click();
			log.info("Clicked on " + locator);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Unable to click on " + locator);
		}
	}

	public void type(By locator, String data) throws Exception {
		try {
//			try {
//				if(driver.findElement(locator).getSize() != null)
//					driver.findElement(locator).clear();;
//			} catch (Exception e) {
//			}
			System.out.println(data);
			driver.findElement(locator).sendKeys(data);

			log.info("Entered the value in the Textbox :" + locator);

		} catch (RuntimeException localRuntimeException) {
			log.fatal("Unable to Enter the value in the Textbox :" + locator);
			System.out.println("Unable to Enter the value in the Textbox :" + locator);
		}

	}

	public void select(By locator, String data) throws Exception {
		try {
			new Select(driver.findElement(locator)).selectByVisibleText(data);
			;
			// Select s = new Select(driver.findElement(locator));
			// s.selectByVisibleText(data);
			log.info("Selected the value form the field :" + locator);
		} catch (RuntimeException e) {
			readData.addStepDetails("Select list item", "List item should be selected",
					"Error in selecting value from dropdown: " + e.getMessage(), "FAIL", "N");
			log.fatal("Unable to select from the field " + e.getMessage());
		}
	}

	public void select(By locator, int no) throws Exception {
		try {
			new Select(driver.findElement(locator)).selectByIndex(no);
			// Select dropdown = new Select(driver.findElement(locator));
			// dropdown.selectByIndex(no);
			log.info("Selected the value form the field :" + locator);
		} catch (RuntimeException e) {
			readData.addStepDetails("Select list item", "List item should be selected",
					"Error in selecting value from dropdown: " + e.getMessage(), "FAIL", "N");
			log.fatal("Unable to select from the field " + e.getMessage());
		}
	}

	public void switchwindow(int index) throws Exception {
		try {
			String childHandl = (String) driver.getWindowHandles().toArray()[index];
			driver.switchTo().window(childHandl);
			driver.manage().window().maximize();
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in Switching the window:" + index + "Fail");
			readData.addStepDetails("Switch to Window", "Switch to window should be done",
					"Error in Switching to the Window: " + localRuntimeException.getMessage(), "FAIL", "N");
			localRuntimeException.getMessage();
		}

	}

	public void switchframe(WebElement elem) throws Exception {
		try {
			driver.switchTo().frame(elem);
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in Switching the Frame:" + localRuntimeException.getMessage() + "Fail");
			readData.addStepDetails("Switch to Frame", "Frame should be available",
					"Error in Switching to the Frame: " + localRuntimeException.getMessage(), "FAIL", "N");
			localRuntimeException.getMessage();
		}

	}

	public void switchToDefaultFrame() throws Exception {
		try {
			driver.switchTo().defaultContent();
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in Switching the Frame:" + localRuntimeException.getMessage() + "Fail");
			readData.addStepDetails("Switch to Default Frame", "Default Frame should be available",
					"Error in Switching to the Default Frame: " + localRuntimeException.getMessage(), "FAIL", "N");
			localRuntimeException.getMessage();
		}

	}

	public boolean js_type(By by, String Text, String LocatorName) throws Throwable {
		boolean flag = true;
		try {

			WebElement location = driver.findElement(by);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + Text + "'", location);
			return true;

		} catch (Exception e) {
			flag = false;
			return false;
		} finally {
			if (flag) {
				System.out.println("Type Data into " + LocatorName + "Able to Type Data into :" + LocatorName);
			} else {
				System.out.println("Type Data into " + LocatorName + "Able to Type Data into :" + LocatorName);
			}
		}
	}

	public boolean JSClick(By locator, String locatorName) throws Exception {
		boolean flag = false;
		try {
			WebElement element = driver.findElement(locator);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
			flag = true;
		} catch (Exception e) {
		}
		return flag;

	}

	public void highlight(By locator) throws Exception {
		try {

			WebElement elem = driver.findElement(locator);
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("arguments[0].style.border='3px solid blue'", elem);

		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in Highlighting the element :" + localRuntimeException.getMessage() + "Fail");
			readData.addStepDetails("highlight the element", "Element should be highlighted ",
					"Error in Highlighting the element : " + localRuntimeException.getMessage(), "FAIL", "N");
			localRuntimeException.getMessage();
		}
	}

	public void waitForElement(By locator, int timer) throws Exception {
		try {
			for (int i = 0; i < timer; i++) {
				try {
					driver.findElement(locator).isDisplayed();
					System.out.println("Element is available :" + locator);
					break;
				} catch (RuntimeException localRuntimeException) {
					Thread.sleep(1000);
					System.out.println("Waiting for........" + locator);
				}
			}
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in performing Wait:" + localRuntimeException.getMessage() + "Fail");
			readData.addStepDetails("Error in performing Wait:", "It should wait for the element",
					"Error in performing Wait:: " + localRuntimeException.getMessage(), "FAIL", "N");
			localRuntimeException.getMessage();
		}
	}

	public void verifyField(String loc) {
		try {
			driver.findElement(By.xpath(loc)).isDisplayed();
			log.info("Element is available :" + loc);
		} catch (Exception e) {
			log.error("Element is not available :" + loc);
		}

	}

	public int totalitemsdropdownlist(WebElement elem) {
		List<WebElement> dropdown_values = null;
		try {
			Select dropdownfield = new Select(elem);
			dropdown_values = dropdownfield.getOptions();

		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in finding total no. of elements in dropdown: "
					+ localRuntimeException.getMessage() + "Fail");
			// readData.addStepDetails("List box size", "Get the no of items available in
			// the dropdown", "Error in finding total no. of elements in dropdown: " +
			// localRuntimeException.getMessage(), "FAIL","N");
			localRuntimeException.getMessage();
		}
		return dropdown_values.size();
	}

	public static void verifyElementIsEnabled(WebElement elem, boolean paramBoolean) {
		try {
			boolean bool = elem.isEnabled();
			if (bool == paramBoolean)
				System.out.println("Element is present in expected state" + elem + "Pass");
			else
				System.out.println("Element is not present in expected state" + elem + "Fail");
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Element not found:" + elem + "Fail");
			// readData.addStepDetails("Verify Element", "Element should be present",
			// "Element not found: " + localRuntimeException.getMessage(), "FAIL","N");
			localRuntimeException.getMessage();
		}
	}

	public boolean isAlertPresent() {
		boolean foundAlert = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 60L);
			wait.until(ExpectedConditions.alertIsPresent());
			foundAlert = true;
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in finding Alert Is Present:Fail");
			// readData.addStepDetails("Verify Alert", "Alert should be present", "Alert not
			// found: " + localRuntimeException.getMessage(), "FAIL","N");
			localRuntimeException.getMessage();
		}
		return foundAlert;
	}

	public void handleConfirmation(String paramString) {
		Alert localAlert = driver.switchTo().alert();
		if (localAlert != null) {
			if (paramString.trim().equalsIgnoreCase("Y")) {
				System.out.println("Alert accepted!!!");
				localAlert.accept();
			} else if (paramString.trim().equalsIgnoreCase("N")) {
				System.out.println("Alert Rejected!!!");
				localAlert.dismiss();
			}
		} else {
			System.out.println("Error in finding Alert:Fail");
			// readData.addStepDetails("Verify Alert", "Alert should be present", "Error in
			// finding Alert: ", "FAIL","N");
		}
	}

	public String getAlertMessageText() {
		String str1 = null;
		try {
			str1 = driver.switchTo().alert().getText();
			return str1;
		} catch (Exception e) {
			// readData.addStepDetails("Verify Popup message", "Popup message should be
			// available", "Alert is not present", "FAIL","Y");
		}
		return str1;
	}

	public void switchBackToOriginalBrowser() {
		try {
			driver.switchTo().window(winHandleBefore);
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in switching to original Browser");
			// readData.addStepDetails("Switch back to Original Browser", "Default Browser
			// should be present", "Error in switching to Original browser:
			// "+localRuntimeException.getMessage(), "FAIL","N");
			localRuntimeException.getMessage();
		}

	}

	public void pressEnterKey() {
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void swtichToChildTab() {
		try {
			winHandleBefore = driver.getWindowHandle();
			System.out.println(winHandleBefore);
			String childHandl = (String) driver.getWindowHandles().toArray()[1];
			driver.switchTo().window(childHandl);
			driver.manage().window().maximize();
			System.out.println("Switched backed to child tab" + "Pass");
		} catch (Exception e) {
			System.out.println("Error in Switching back to child tab" + "fail");
		}

	}

	public void VerifyText(WebElement elem, String paramString2) {
		try {
			String selectedOption = new Select(elem).getFirstSelectedOption().getText();
			if (selectedOption.trim().equalsIgnoreCase(paramString2)) {
				System.out.println("Text was found :" + paramString2 + "Pass");
				// readData.addStepDetails("Verify Element", "Element "+paramString2+" should be
				// available", "Element "+paramString2+" was found in DOM", "PASS","N");
			} else {
				System.out.println("Text was not found :" + paramString2 + "Fail");
				// readData.addStepDetails("Verify Element", "Element "+paramString2+" should be
				// available", "Element "+paramString2+" is not found", "FAIL","N");
			}
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Element was not found :" + elem + "Fail");
			// readData.addStepDetails("Verify Element", "Element "+paramString2+" should be
			// available", "Error in finding the element", "FAIL","N");
			localRuntimeException.getMessage();
		}
	}

	public String getToolTipText(WebElement elem, String paramString1) {
		String tooltip = null;
		try {
			if (elem != null) {
				tooltip = elem.getAttribute(paramString1);
			}
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in Getting tool tip text:" + localRuntimeException.getMessage() + "Fail");
			localRuntimeException.getMessage();
		}
		return tooltip;
	}

	public static void verifyListItems(WebElement elem) {
		try {
			Select listBox = new Select(elem);
			List<WebElement> allItems = listBox.getOptions();
			for (WebElement item : allItems) {
				System.out.println("Item is available in list:" + item);
			}
		} catch (Exception e) {
			System.out.println("Issue While Selecting Value in Drop Down Object :" + elem);
		}
	}

	public static By getLocators(String paramString1, String paramString2) {
		if (paramString1.trim().equalsIgnoreCase("xpath"))
			return By.xpath(paramString2);
		if (paramString1.trim().equalsIgnoreCase("cssselector"))
			return By.cssSelector(paramString2);
		if (paramString1.trim().equalsIgnoreCase("tagname"))
			return By.tagName(paramString2);
		if (paramString1.trim().equalsIgnoreCase("id"))
			return By.id(paramString2);
		if (paramString1.trim().equalsIgnoreCase("name"))
			return By.name(paramString2);
		if (paramString1.trim().equalsIgnoreCase("linktext"))
			return By.linkText(paramString2);
		return null;
	}

	public static String defaultdropdownselecteditem(WebElement elem) {

		Select dropdownfield = new Select(elem);
		String text = dropdownfield.getFirstSelectedOption().getText();
		System.out.println(text.trim());
		return dropdownfield.getFirstSelectedOption().getText().trim();
	}

	public String alldropdownlistvalues(WebElement elem) {
		Select dropdownfield = new Select(elem);
		List<WebElement> dropdownfield_values = dropdownfield.getOptions();

		String allvalues = "";
		for (int i = 0; i < dropdownfield_values.size(); i++) {
			String currentvalue = dropdownfield_values.get(i).getText();
			String concatvalue = allvalues + currentvalue + ",";
			allvalues = concatvalue;
		}

		return allvalues.substring(0, allvalues.length() - 1);
	}

	public String getdate(String format) {
		SimpleDateFormat df = new SimpleDateFormat(format);
		Date d = new Date();
		String date = df.format(d);
		System.out.println(date);
		return date;
	}

	public static String getattributevalue(WebElement elem, String requiredattribute) throws Exception {
		String attribute = null;
		try {
			attribute = elem.getAttribute(requiredattribute);
		} catch (RuntimeException localRuntimeException) {
			// readData.addStepDetails("Get Element Attribute", "Element attribute should
			// able to get", "Error in getting the Element attribute" + elem, "FAIL","N");
		}
		return attribute;
	}

	public void alertaction(String action) {

		try {
			if (action.equals("ok")) {
				driver.switchTo().alert().accept();
			} else if (action.equals("cancel")) {
				driver.switchTo().alert().dismiss();
			}
		} catch (Exception e) {
			System.out.println("Error in performing action on Alert box:" + action + "Fail");
		}

	}

	public String printText(By locator) {
		String text = driver.findElement(locator).getText();
		System.out.println("The text is :" + text);
		return text;
	}

	public int totallinnks(WebElement elem) {
		return elem.findElements(By.tagName("a")).size();
	}

	public void capturesnapshot(String destinationPath) throws IOException {
		try {
			File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(destinationPath));
		} catch (Exception e) {
			System.out.println("Error in Capturing Screenshot:Fail");
		}

	}

	public void dragAndDrop(By question, By target) {
		WebElement e1 = driver.findElement(question);
		WebElement e2 = driver.findElement(target);
		Actions a = new Actions(driver);
		a.dragAndDrop(e1, e2).build().perform();
	}

	public boolean verifyElementExist(WebElement elem) {
		boolean blnStatus = false;
		WebDriverWait localWebDriverWait = new WebDriverWait(driver, 60L);
		try {
			localWebDriverWait.until(ExpectedConditions.presenceOfElementLocated((By) elem));
			System.out.println("Element is available:" + elem + "Pass");
			blnStatus = true;

		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in finding Element:" + localRuntimeException.getMessage() + "Pass");
		}
		return blnStatus;
	}

	public void Mousehover(WebElement elem) {
		try {
			Actions action = new Actions(driver);
			action.moveToElement(elem).build().perform();
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in Hover on element" + localRuntimeException.getMessage() + "Pass");

		}
	}

	public void selectListItem(WebElement elem, String paramString) {
		int i = 0;
		try {
			List localList = driver.findElements(By.tagName("option"));
			Iterator localIterator = localList.iterator();
			while (localIterator.hasNext()) {
				WebElement localWebElement2 = (WebElement) localIterator.next();
				if (paramString.trim().equalsIgnoreCase(localWebElement2.getText().trim())) {
					i = 1;
					localWebElement2.click();
					break;
				}
			}
			System.out.println("Selected option:" + paramString + "Successfully" + "Pass");
			if (i == 0) {
				System.out.println("Selected option:" + paramString + "is not present" + "Fail");
			}
		} catch (RuntimeException localRuntimeException) {
			System.out.println(
					"Issue while Selected value:" + localRuntimeException.getMessage() + "is not present" + "Fail");
		}
	}

	public void wait(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
			;
		}
	}

	public void switchToBrowser(String paramString) {
		try {
			winHandleBefore = driver.getWindowHandle();
			String str1 = paramString;
			int i = 0;
			Iterator localIterator = driver.getWindowHandles().iterator();
			while (localIterator.hasNext()) {
				String str2 = (String) localIterator.next();
				if (driver.switchTo().window(str2).getTitle().equalsIgnoreCase(str1.trim())) {
					i = 1;
					driver.switchTo().window(str2);
				} else {
					driver.switchTo().window(winHandleBefore);
				}
			}
			if (i == 0)
				System.out.println("The Browser Window with title : " + str1 + " is not found");
		} catch (Exception e) {
			System.out.println("Error in switching to browser" + e.getMessage());
		}
	}

	@BeforeSuite
	public void setUpSuiteDetails(ITestContext ctx) throws Exception {
		readData.suiteName = ctx.getCurrentXmlTest().getSuite().getName();
		System.out.println("readData.suiteName " + readData.suiteName);
		readData.generateSuiteResultFolder();
		TestReportspath = System.getProperty("user.dir") + "\\TestReports\\" + readData.suiteName + "_"
				+ new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		readData.generateSuiteResultFolder();
		// readData.DefaultReport("SummaryReport");
	}

	@BeforeMethod
	public void captureDesc(Method method) {
		Test test = method.getAnnotation(Test.class);
		if (!test.description().toString().equals("")) {
			desc.add(test.description());
		}
	}

	@AfterSuite
	public void afterSuite() throws Exception {
		try {
			File local = readData.suiteFolder;
			htmlrep.generateHtmlReport(TestName);

		} catch (Exception ex) {
			System.out.println("Result Suite file is not being generated : " + ex.getMessage());
		}
	}

	@BeforeClass
	public void BeforeClass() throws Exception {
		Thread.sleep(1000);
		TestName = this.getClass().getSimpleName();
		TestFullName = this.getClass().getName();
		System.out.println("TestName ::::::::::::::::" + TestName);
		System.out.println(System.getProperty("user.dir") + "\\Resources\\TestData.xlsx");
		// readData.captureTestCaseStartTime();
		Thread.sleep(2000);
	}

	@AfterClass
	public void afterClass() throws Exception {
		readData.addSummaryReport(TestName, desc.get(r), TestFullName);
		r++;
		readData.knowTestCaseStatus(TestName);
		// flush();
	}

	public void verifyingSort10() {
		String recordCount = driver.findElement(By.xpath("//div[@id='clientslist_info']")).getText();
		String[] count = recordCount.split(" ");
		System.out.println(count.length);
		for (int i = 0; i < count.length; i++) {
			if (count[i].equalsIgnoreCase("10")) {
				System.out.println("PASS");
			}
		}
	}

	public void verifyingSort25() {
		new Select(driver.findElement(By.xpath("//select[@name='clientslist_length']"))).selectByVisibleText("25");
		String recordCount = driver.findElement(By.xpath("//div[@id='clientslist_info']")).getText();
		String[] count = recordCount.split(" ");
		System.out.println(count.length);
		for (int i = 0; i < count.length; i++) {
			if (count[i].equalsIgnoreCase("25")) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail");
			}
		}
	}

	public void verifyingSort1() {
		new Select(driver.findElement(By.xpath("//select[@name='clientslist_length']"))).selectByVisibleText("25");
		String recordCount = driver.findElement(By.xpath("//div[@id='clientslist_info']")).getText();
		String[] count = recordCount.split(" ");
		System.out.println(count.length);
		for (int i = 0; i < count.length; i++) {
			if (count[i].equalsIgnoreCase("1")) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail");
			}
		}
	}

	public void mobileNumberValidation() {
		String mobile = driver.findElement(By.xpath("//*[@id=\"clientslist\"]/tbody/tr/td[3]")).getText();
		if (mobile.equalsIgnoreCase("9666931718")) {
			System.out.println("Pass");
		} else {
			System.out.println("FAIL");
		}
	}

	public void mobileNumberValidation2() {
		mobile = driver.findElement(By.xpath("//*[@id=\"clientslist\"]/tbody/tr/td[3]")).getText();

	}

	public String gettext(By loc) {
		driver.findElement(loc).getText();
		return String;

	}

	public void nouserDataValidation(By loc) {
		nouserData = driver.findElement(loc).getText();
		String[] noUserMsg = nouserData.split(" ");
		System.out.println(noUserMsg.length);
		for (int i = 0; i < noUserMsg.length; i++) {
			if (noUserMsg[i].contains("No")) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
		}
	}

	public void alertHandle() {
		driver.switchTo().alert().accept();
	}

	public void nameValidation(By loc) {
		name = driver.findElement(loc).getText();
	}

	public void pageNationValidating(By loc) {
		pageCount = driver.findElement(loc).getText();
		String[] spilitPageCount = pageCount.split(" ");
		for (int i = 0; i < spilitPageCount.length; i++) {
			if (spilitPageCount[i].contains("20")) {
				System.out.println("PaSS");
			}
		}
	}

	public void reportsByProductNameValidating(By loc) {
		nameVal = driver.findElement(loc).getText();
		String[] validatingName = nameVal.split(" ");
		for (int i = 0; i < validatingName.length; i++) {
			if (validatingName[i].contains("50kg")) {
				System.out.println("PaSS");
			}
		}
	}

	public void rolesHeaderVal(By loc) {
		header = driver.findElement(loc).getText();
		String[] headerVal = header.split(" ");
		for (int i = 0; i < headerVal.length; i++) {
			if (headerVal[i].contains("USERS")) {
				System.out.println("PaSS");
			}
		}
	}

	public void emailIdVal(By loc) {
		emailId = driver.findElement(loc).getText();
		String[] emailIdVal = emailId.split(" ");
		for (int i = 0; i <= emailIdVal.length; i++) {
			if (emailIdVal[i].contains("zionku")) {
				System.out.println("Pass");
			}
		}

	}

	public void emailIdValforRetailerRequestPage(By loc) {
		emailIdRetailer = driver.findElement(loc).getText();
		String[] emailIdVal = emailIdRetailer.split(" ");
		for (int i = 0; i <= emailIdVal.length; i++) {
			if (emailIdVal[i].contains("gff")) {
				System.out.println("Pass");
			}
		}
	}

	public void bannerTableValidation(By loc) {
		tableBanner = driver.findElement(loc).getText();
		String[] bannerTableVal = tableBanner.split(" ");
		for (int i = 0; i <= bannerTableVal.length; i++) {
			if (!bannerTableVal[i].contains("test")) {
				System.out.println("Pass");
			}
		}

	}

	public void bannerTableValidationtwo(By loc) {
		tableBannertwo = driver.findElement(loc).getText();
		String[] bannerTableValtwo = tableBannertwo.split(" ");
		for (int i = 0; i <= bannerTableValtwo.length; i++) {
			if (bannerTableValtwo[i].contains(readData.testDataValue.get("BannerImageName"))) {
				System.out.println("Pass");
			}
		}

	}

	public void robotScrollDown() throws Exception {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}

	public WebDriver getDriver() {
		return driver;

	}

	public void actions(By loc) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(loc)).build().perform();
	}

	public void webelement(By ele) {
		element = driver.findElement(ele);
	}

	public void getText(By loc) {
		String loginValidation = driver.findElement(loc).getText();
	}

	public void gettext1(By loc) {
		text = driver.findElement(loc).getText();
		System.out.println("------------------"+text);
	}
	/*
	 * public void clear(By loc) { MobileElement element = (MobileElement)
	 * driver.findElement(By.xpath("")); element.clear();
	 * if(null!=element&&null!=element.getText() && element.getText().length()>0){
	 * element.click(); Runtime.getRuntime().exec("adb shell input keyevent 123");
	 * int leng=element.getText().length(); logger.debug(“Lenght of the text is +
	 * leng); for(int i=0;i<leng;i++){ driver.sendKeyEvent(AndroidKey.BACKSPACE); }
	 * }
	 */

	/*
	 * WebElement clea=driver.findElement(loc); clea.sendKeys("12"); clea.clear();
	 * System.out.println(clea+"pass");
	 * 
	 * String text11=clea.getText(); int length=text11.length(); for(int
	 * i=0;i<length;i++) { clea.sendKeys(Keys.BACK_SPACE);
	 * 
	 * }
	 * 
	 * }
	 */
public void empty() {
	for(int i=0;i<13;i++) {
	 driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.ongostore.pattabhiagro_b2b_b2c:id/login_email' and @text='Mobile No. / Email Id']")).sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END));
	}
}
public void clearText() {
	while (!((Alert) textField()).getText().isEmpty()) {
		   TouchAction touchAction = new TouchAction(driver);
		   touchAction.longPress(textField());
		   driver.getKeyboard().sendKeys(Keys.DELETE);
		}
}

public LongPressOptions textField() {
	try {
		return LongPressOptions;
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	return null;
}
public void introductory_Scrooling(By loc) throws InterruptedException {
	 Thread.sleep(3000);
	  WebElement entirepage = driver.findElement(loc); 
	  Dimension dim = entirepage.getSize(); 
	  int anchor =entirepage.getSize().getHeight() / 2;
	  Double screenWidthStart = dim.getWidth() * 0.8; 
	  int scrollStart = screenWidthStart.intValue(); 
	  Double screenWidthEnd = dim.getWidth() * 0.1; 
	  int screenEnd =screenWidthEnd.intValue(); 
	  for (int i = 0; i <= 2; i++) { 
	  TouchAction action= new TouchAction(driver); 
	  action.press(PointOption.point(scrollStart,
	  anchor)) .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	  .moveTo(PointOption.point(screenEnd, anchor)).release().perform(); 
	  }
	
	 
}
public void homePageSwiping(By loc) {
	  WebElement entirepage=driver.findElement(loc);
	  Dimension dim=entirepage.getSize(); 
	  int anchor=entirepage.getSize().getHeight()/2;
	  Double screenWidthStart=dim.getWidth()*0.10; 
	  int scrollStart=screenWidthStart.intValue(); 
	  Double screenWidthEnd=dim.getWidth()*0.2; 
	  int screenEnd=screenWidthEnd.intValue();
	  for (int i = 0; i <=0; i++) { 
	  TouchAction action=new TouchAction(driver);
	  action.press(PointOption.point(scrollStart, anchor))
	  .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	  .moveTo(PointOption.point(screenEnd, anchor)) .release().perform();
	  }
}
public void scrollup() {
	Dimension dim=driver.manage().window().getSize();
	int anchor=dim.getHeight()/2;
	
	Double start=(double) (dim.getWidth()/2);
	int scrollSta=start.intValue();
	Double end=dim.getHeight()*0.001;
	int scrollen=end.intValue();
	for(int i=0;i<=1;i++) {
		TouchAction action=new TouchAction(driver);
		  action.press(PointOption.point(scrollSta,anchor))
		  .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		  .moveTo(PointOption.point(scrollen,scrollSta)) .release().perform();
		 // driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.ongostore.pattabhiagro_b2b_b2c:id/edit_btn'and@text='EDIT']")).click();
		  
			/*
			 * String str=driver.findElement(By.xpath(
			 * "//android.widget.Button[@resource-id='com.ongostore.pattabhiagro_b2b_b2c:id/edit_btn'and@text='EDIT']"
			 * )).getText(); if(str.equalsIgnoreCase("EDIT")) { System.out.println("Pass");
			 * 
			 * } break;
			 */
	}

	
	  }
public void scroll_Down() {
	Dimension dim=driver.manage().window().getSize();
	int anchor=dim.getHeight()/2;
	
	Double start=(double) (dim.getWidth()/2);
	int scrollSta=start.intValue();
	Double end=dim.getHeight()*0.02;
	int scrollen=end.intValue();
	for(int i=0;i<=1;i++) {
		TouchAction action=new TouchAction(driver);
		  action.press(PointOption.point(scrollSta,anchor))
		  .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		  .moveTo(PointOption.point(scrollen,scrollSta)) .release().perform();
	}
	
}
	public String gettextfromapp(By loc) {
		 text22=driver.findElement(loc).getText();
		 return text22;
		
	}
	public WebElement mobile_Clear(By loc) {
		WebElement element=driver.findElement(loc);
		return element;
	}
	public void scroll_Down1() {
		Dimension dim=driver.manage().window().getSize();
		int anchor=(int) (dim.getHeight()*0.7);
		
		Double start=(double) (dim.getWidth()/2);
		int scrollSta=start.intValue();
		Double end=dim.getHeight()*0.02;
		int scrollen=end.intValue();
		for(int i=0;i<=1;i++) {
			TouchAction action=new TouchAction(driver);
			  action.press(PointOption.point(scrollSta,anchor))
			  .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
			  .moveTo(PointOption.point(scrollen,scrollSta)) .release().perform();
			
		}

		
	}
	



	 
	 

}
