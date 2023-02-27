package dominicmalile.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import dominicmalile.TestComponents.BaseTest;
import io.restassured.RestAssured;
import io.restassured.http.Method;

public class ConvertDateToUnixTimeStamp extends BaseTest {

	@BeforeTest
	public void dateToUnixStamp() {
		RestAssured.baseURI = hostURL;
		httpRequest = RestAssured.given();
		response = httpRequest.request(Method.GET, dateToUnixStampEndpoint);
	}

	@Test
	public void verifyResponseBody() {
		String responsebody = response.getBody().asString();
		Assert.assertTrue(responsebody != null);

	}

	@Test
	public void verifyHTTPstatuscode() {
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test
	public void VerifyStatusLine() {
		String statusline = response.getStatusLine();
		Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
	}

	@Test
	public void verifyContentType() {
		String ContentType = response.header("Content-Type");
		Assert.assertEquals(ContentType, "application/json");
	}

	@Test
	public void verifyTransferEncoding() {
		String transferEncoding = response.header("Transfer-Encoding");
		Assert.assertEquals(transferEncoding, "chunked");
	}

	@Test
	public void verifyServer() {
		String server = response.header("Server");
		Assert.assertEquals(server, "cloudflare");
	}

	@Test
	public void verifyContentEncoding() {
		String contentEncoding = response.header("Content-Encoding");
		Assert.assertEquals(contentEncoding, "gzip");

	}

	@Test
	public void verifyResponseTime() {
		long time = response.getTime();
		Assert.assertTrue(time < 5000);
	}

}
