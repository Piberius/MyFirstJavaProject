package com.main.process;

import com.dataaccess.numberconversion.TNCNumberConversionSoapBinding12;

public class NumberToWordsServiceWSDL {
	public static String numberToWords() {
		try {
			TNCNumberConversionSoapBinding12 service = new TNCNumberConversionSoapBinding12();
			String result = service.NumberToWords((long) 1000123);
			System.out.println("Number in words: " + result);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "";
	}
}
