import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesiredCapabilities sh = DesiredCapabilities.chrome(); // genral chrome
		//	sh.acceptInsecureCerts(); // to handle certs  OR
			sh.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			sh.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			
			//for local browser
			ChromeOptions c = new ChromeOptions();
			c.merge(sh);
			
			System.setProperty("webdriver.chrome.driver", "/home/prathik.g/Documents/Softwares/study/testing/geckodriver");
			WebDriver dr = new ChromeDriver(c);

	}

}
