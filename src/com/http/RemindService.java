package com.http;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;

import model.CustomForm;
import model.Evaluate;
import model.Remind;
import model.Room;
import model.pr;

/**
 * @author retryu E-mail:ruanchenyugood@gmail.com
 * @version create time：2013-9-20 上午11:01:23 declare:
 */
public class RemindService {

	private ViewCommonResponse response = new ViewCommonResponse();;

	/**
	 * 2.6.1提价提醒接口
	 * 
	 * @param paramsm
	 * @return
	 */
	public ViewCommonResponse addRemind(Map<String, String> params) {
		HttpCommonResponse httpCommonResponse = HttpUtil.post(
				BaseNetService.URL_REMINDS_ADD, params);
		response.setHttpCode(httpCommonResponse.getStateCode());

		try {
			JSONObject json = new JSONObject(httpCommonResponse.getResponse());
			response = JsonUtil.commonParser(json.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}

	/**
	 * 2.6.2 查询提醒接口
	 * 
	 * @param paramsm
	 * @return
	 */
	public ViewCommonResponse queryRemind(Map<String, String> params) {
		HttpCommonResponse httpCommonResponse = HttpUtil.doGet(
				BaseNetService.URL_REMINDS_QUERY, params);
		response.setHttpCode(httpCommonResponse.getStateCode());

		try {
			JSONObject json = new JSONObject(httpCommonResponse.getResponse());

			List<Remind> reminds = new ArrayList<Remind>();
			reminds = (ArrayList<Remind>) JsonUtil.json2ObList(json.toString(),
					"list", Remind.class);
			response.setData(reminds);
			System.out.println(reminds);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}

	/**
	 * 2.6.3 删除提醒接口
	 * 
	 * @param paramsm
	 * @return
	 */
	public ViewCommonResponse deleteRemind(Map<String, String> params) {
		HttpCommonResponse httpCommonResponse = HttpUtil.doGet(
				BaseNetService.URL_REMINDS_DELETE, params);
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
