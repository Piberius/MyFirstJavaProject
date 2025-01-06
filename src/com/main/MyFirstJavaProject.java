package com.main;

import com.main.countryinfo.CountryInfoService;
import com.main.process.FruitService;
import com.main.process.NumberToWordsServiceWSDL;


public class MyFirstJavaProject {

	public static void main(String[] args) {
		FruitService.getFruits(); //Sample Marshaller
		NumberToWordsServiceWSDL.numberToWords(); //Numbers to Words using online generated WSDL
		CountryInfoService.getCountryCode(); // Get Country Code from Country Name
	}

}
