/**
 * 
 */
package wiremock;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

/**
 * @author shiweijie
 * @creation 2017年9月13日
 */
public class MockServer {

	/**
	 * 伪造rest接口
	 * @param args
	 */
	public static void main(String[] args) {
		
		configureFor("127.0.0.1", 8080);
		
		stubFor(get(urlEqualTo("/info"))
				.willReturn(okJson("{'name':'shiweijie'},{'age':'25'}")));

	}

}
