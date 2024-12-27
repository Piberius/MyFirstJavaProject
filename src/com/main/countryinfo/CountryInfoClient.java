package com.main.countryinfo;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.main.countryinfo.request.RequestWrapper;
import com.main.countryinfo.response.ResponseWrapper;
import com.main.util.SoapUtils;

public class CountryInfoClient {
	public static <T, R> ResponseWrapper<R> callWebService(RequestWrapper<T> request, Class<R> responseType) {
		try {
			// Marshal the payload and construct the SOAP envelope
			String payloadXml = SoapUtils.marshalToXml(request.getPayload());
			String soapEnvelope = SoapUtils.constructSoapEnvelope(payloadXml);

			// Create HTTP client
			HttpClient client = HttpClient.newHttpClient();

			// Build the HTTP request
			HttpRequest httpRequest = HttpRequest.newBuilder()
					.uri(URI.create("http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso"))
					.header("Content-Type", "text/xml; charset=utf-8")
					.POST(HttpRequest.BodyPublishers.ofString(soapEnvelope)).build();

			// Send the HTTP request
			HttpResponse<String> httpResponse = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());

			// Parse the response
			if (httpResponse.statusCode() == 200) {
				R data = SoapUtils.parseResponse(httpResponse.body(), responseType);
				return new ResponseWrapper<>(true, data, null);
			} else {
				return new ResponseWrapper<>(false, null, "HTTP Error: " + httpResponse.statusCode());
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseWrapper<>(false, null, e.getMessage());
		}
	}

}
