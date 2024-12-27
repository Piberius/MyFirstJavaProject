package com.main.countryinfo.response;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CountryISOCodeResponse", namespace = "http://www.oorsprong.org/websamples.countryinfo")
public class CountryISOCodeResponse {
	private String countryCode;

	@XmlElement(name = "CountryISOCodeResult", namespace = "http://www.oorsprong.org/websamples.countryinfo")
	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	
}
