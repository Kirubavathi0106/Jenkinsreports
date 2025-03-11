package hooks;



import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Base;
import Utility.CaptureScreenshot;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Base {

public static Base base;
	
	@Before
	public void initBrowser() {

		System.out.println("opening the Browser : Chrome");
		//Base.initializeDriver();  

		base.driver = new ChromeDriver();
		//driver = new ChromeDriver();
	}

	@After
	public void Close(Scenario scenario) {
		if(scenario.isFailed()){ 
			CaptureScreenshot screenshot = new CaptureScreenshot();
			//screenshot.getErrorScreenshot(base.driver);
			screenshot.getErrorScreenshot(driver);
		}
		
		// System.out.println("Environment is closed");
		 //System.out.println("Closing the Browser : chrome");
		
//		if (driver != null) {
//            driver.quit();
//            System.out.println("Closing the Browser: Chrome");
//        }
		else {
		base.driver.quit();
		//	driver.quit();
		}
	}
}
	


