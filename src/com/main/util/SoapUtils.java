package com.main.util;

import java.io.StringReader;
import java.io.StringWriter;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class SoapUtils {

	/**
	 * Marshals an object to an XML string.
	 * 
	 * @param payload The object to marshal.
	 * @return The marshaled XML string.
	 * @throws RuntimeException if marshalling fails.
	 */
	public static <T> String marshalToXml(T payload) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(payload.getClass());
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true); // Suppress XML declaration

			StringWriter writer = new StringWriter();
			marshaller.marshal(payload, writer);
			return writer.toString();
		} catch (JAXBException e) {
			throw new RuntimeException("Failed to marshal object to XML: " + e.getMessage(), e);
		}
	}

	/**
	 * Constructs a SOAP envelope with the given payload.
	 * 
	 * @param payloadXml The XML string of the payload.
	 * @return The complete SOAP envelope as a string.
	 */
	public static String constructSoapEnvelope(String payloadXml) {
		return """
				    <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
				        <soap:Body>
				            %s
				        </soap:Body>
				    </soap:Envelope>
				""".formatted(payloadXml);
	}

	/**
	 * Parses a SOAP response to extract and unmarshal the payload.
	 *
	 * @param response     The raw SOAP response as a string.
	 * @param responseType The class type of the expected response object.
	 * @return The unmarshaled response object.
	 * @throws RuntimeException if parsing or unmarshalling fails.
	 */
	public static <R> R parseResponse(String response, Class<R> responseType) {
		try {
			// Extract the relevant part of the SOAP body (simplified)
			String soapBody = extractSoapBody(response);

			// Parse the extracted XML using JAXB
			JAXBContext jaxbContext = JAXBContext.newInstance(responseType);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			return responseType.cast(unmarshaller.unmarshal(new StringReader(soapBody)));
		} catch (JAXBException e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to parse response: " + e.getMessage());
		}
	}

	/**
	 * Extracts the contents of the <soap:Body> tag from a SOAP response.
	 *
	 * @param soapResponse The raw SOAP response as a string.
	 * @return The XML content within the <soap:Body> tag.
	 */
	private static String extractSoapBody(String soapResponse) {
		// Simplistic extraction of the <soap:Body> contents
		int bodyStart = soapResponse.indexOf("<soap:Body>") + "<soap:Body>".length();
		int bodyEnd = soapResponse.indexOf("</soap:Body>");
		return soapResponse.substring(bodyStart, bodyEnd).trim();
	}
}
