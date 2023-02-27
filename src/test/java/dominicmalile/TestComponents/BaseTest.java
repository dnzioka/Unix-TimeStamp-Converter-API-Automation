package dominicmalile.TestComponents;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseTest {
	
	public static RequestSpecification httpRequest; 
	public static  Response response;
	public static String responseBody;
	public static String hostURL= "https://helloacm.com"; //domain does not change
	public static String dateToUnixStampEndpoint = "/api/unix-timestamp-converter/?cached&s=2023-02-20%204:45:55";
	public static String unixStampToDateEndpoint ="/api/unix-timestamp-converter/?cached&s=1677279175";
	public static String invalidDate ="/api/unix-timestamp-converter/?cached&s=asdfasd";
}
