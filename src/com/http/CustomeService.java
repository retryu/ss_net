package com.http;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import model.CustomForm;

import org.json.JSONObject;

public class CustomeService {
	private ViewCommonResponse response = new ViewCommonResponse();;

	public ViewCommonResponse addCustome(Map<String, String> params) {
		HttpCommonResponse httpCommonResponse = HttpUtil.post(
				BaseNetService.URL_CUSTOME_ADD, params);
		response.setHttpCode(httpCommonResponse.getStateCode());

		try {
			JSONObject json = new JSONObject(httpCommonResponse.getResponse());
			response = JsonUtil.commonParser(json.toString());

			System.out.println(response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}
	
	
	public ViewCommonResponse queryCustome(Map<String, String> params) {
		HttpCommonResponse httpCommonResponse = HttpUtil.doGet(
				BaseNetService.URL_CUSTOME_QUERY, params);
		response.setHttpCode(httpCommonResponse.getStateCode());

		try {
			JSONObject json = new JSONObject(httpCommonResponse.getResponse());
			response = JsonUtil.commonParser(json.toString());

			System.out.println(response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}
}
