package test;

import java.awt.Event;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import model.Address;
import model.Evaluate;
import model.Order;
import model.Product;
import model.Remind;

import org.json.JSONArray;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.http.CustomFormService;
import com.http.RemindService;
import com.http.ShopService;
import com.http.ViewCommonResponse;

/**
 * @author retryu E-mail:ruanchenyugood@gmail.com
 * @version create time：2013-9-8 下午6:06:11
 * 
 *          declare:表单查询
 */
public class TestRemind {
	RemindService remindService;

	@Before
	public void init() {
		remindService = new RemindService();
	}

	/*
	 * 添加提醒
	 */
	@Test
	public void testRoomQuery() {
		Map<String, String> p = new HashMap<String, String>();

		Remind remind = new Remind();
		remind.setUserid("H7Mud3IiaWjWqdL4J4qEJA==");
		remind.setType("1");
		remind.setTitle("12312");
		remind.setClientid("1");
		remind.setTime("2013-06-01");
		remind.setInfo("123");

		p.put("userid", remind.getUserid());
		p.put("type", remind.getType());
		p.put("title", remind.getTitle());
		p.put("clientid", remind.getClientid());
		p.put("time", remind.getTime());
		p.put("info", remind.getInfo());
		remindService.addRemind(p);
	}

	/*
	 * 查询提醒
	 */
	@Test
	public void testQueryRemind() {
		Map<String, String> p = new HashMap<String, String>();

		p.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");
		p.put("pageno", "0");
		remindService.queryRemind(p);
	}
	
	/*
	 * 查询提醒
	 */
	@Test
	public void testdeleteRemind() {
		Map<String, String> p = new HashMap<String, String>();

		p.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");
		p.put("msid", "2");
		remindService.deleteRemind(p);
	}

}
