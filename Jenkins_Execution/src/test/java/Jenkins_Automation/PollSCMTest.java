package Jenkins_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PollSCMTest {
	
	@Test
	public void Poll() {
		
		WebDriver driver = new ChromeDriver();
		Reporter.log("Poll SCM exected in class");
	}

}
