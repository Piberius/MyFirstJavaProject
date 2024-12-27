package com.main.countryinfo.request;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CountryISOCode", namespace = "http://www.oorsprong.org/websamples.countryinfo")
public class CountryISOCodeRequest {
	private String countryName;

	public CountryISOCodeRequest() {}

	public CountryISOCodeRequest(String countryName) {
		super();
		this.countryName = countryName;
	}

	@XmlElement(name = "sCountryName", namespace = "http://www.oorsprong.org/websamples.countryinfo")
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	
}
