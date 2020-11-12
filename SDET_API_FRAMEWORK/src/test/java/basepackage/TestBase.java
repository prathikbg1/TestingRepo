package basepackage;




import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;




import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestBase {

	public static RequestSpecification request;
	public static Response response;
	public String empid="1111";
	
	public Logger logger;
	
	@BeforeClass
	public void setup() {
		logger= Logger.getLogger("EmployeesRestAPI");
		PropertyConfigurator.configure("log4j.properties");
	   logger.setLevel(Level.DEBUG);
	}
}
