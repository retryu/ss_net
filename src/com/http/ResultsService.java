package com.http;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.naming.spi.DirStateFactory.Result;

import org.json.JSONObject;

import model.CustomForm;
import model.Evaluate;
import model.MyResult;
import model.Remind;
import model.ResultPeriod;
import model.Room;
import model.pr;

/**
 * @author retryu E-mail:ruanchenyugood@gmail.com
 * @version create time：2013-9-20 上午11:01:23 declare:
 */
public class ResultsService {

	private ViewCommonResponse response = new ViewCommonResponse();;

	/**
	 * 2.6.1提价提醒接口
	 * 
	 * @param paramsm
	 * @return
	 */
	public ViewCommonResponse queryList(Map<String, String> params) {
		HttpCommonResponse httpCommonResponse = HttpUtil.post(
				BaseNetService.URL_RESULT_LIST, params);
		response.setHttpCode(httpCommonResponse.getStateCode());

		try {
			JSONObject json = new JSONObject(httpCommonResponse.getResponse());
			response = JsonUtil.commonParser(json.toString());
			List<ResultPeriod> results = new ArrayList<ResultPeriod>();
			results = (ArrayList<ResultPeriod>) JsonUtil.json2ObList(
					json.toString(), "list", ResultPeriod.class);
			response.setData(results);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}

	public ViewCommonResponse queryMyResult(Map<String, String> params) {
		HttpCommonResponse httpCommonResponse = HttpUtil.post(
				BaseNetService.URL_MY_RESULT, params);
		response.setHttpCode(httpCommonResponse.getStateCode());

		try {
			JSONObject json = new JSONObject(httpCommonResponse.getResponse());
			response = JsonUtil.commonParser(json.toString());
//			response = JsonUtil.json2Object(httpCommonResponse.getResponse(),
//					MyResult.class, "shopinfo");
//
//			MyResult result = (MyResult) response.getData();
//			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}

	public ViewCommonResponse querySalesPool(Map<String, String> params) {
		HttpCommonResponse httpCommonResponse = HttpUtil.post(
				BaseNetService.URL_SALE_POOL, params);
		response.setHttpCode(httpCommonResponse.getStateCode());

		try {
			JSONObject json = new JSONObject(httpCommonResponse.getResponse());
			response = JsonUtil.commonParser(json.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}
	
	
	public ViewCommonResponse queryFuXiao(Map<String, String> params) {
		HttpCommonResponse httpCommonResponse = HttpUtil.post(
				BaseNetService.URL_SALE_POOL, params);
		response.setHttpCode(httpCommonResponse.getStateCode());

		try {
			JSONObject json = new JSONObject(httpCommonResponse.getResponse());
			response = JsonUtil.commonParser(json.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}
}
