package com.main.countryinfo;

import com.main.countryinfo.request.CountryISOCodeRequest;
import com.main.countryinfo.request.RequestWrapper;
import com.main.countryinfo.response.CountryISOCodeResponse;
import com.main.countryinfo.response.ResponseWrapper;

public class CountryInfoService {

	public static void getCountryCode() {
		//Full list of country names can be found here - http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?op=ListOfCountryNamesByCode
		String countryName = "Malaysia";
		RequestWrapper<CountryISOCodeRequest> request = new RequestWrapper<>("CountryISOCode",
				new CountryISOCodeRequest(countryName));

		ResponseWrapper<CountryISOCodeResponse> response = CountryInfoClient.callWebService(request,
				CountryISOCodeResponse.class);

		if (response.isSuccess()) {
			System.out.println("Country Code: " + response.getData().getCountryCode());
		} else {
			System.out.println("Error: " + response.getError());
		}
	}

}
