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

import org.json.JSONArray;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.http.CustomFormService;
import com.http.ShopService;
import com.http.ViewCommonResponse;

/**
 * @author retryu E-mail:ruanchenyugood@gmail.com
 * @version create time：2013-9-8 下午6:06:11
 * 
 *          declare:表单查询
 */
public class TestForm {
	CustomFormService customFormService;

	@Before
	public void init() {
		customFormService = new CustomFormService();
	}

	/*
	 * 报单查询
	 */
	@Test
	public void testQueryForm() {
		Map<String, String> p = new HashMap<String, String>();
		p.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");
		p.put("querytype", "0");
		customFormService.queryForm(p);
	}

	/*
	 * 报单详情
	 */
	@Test
	public void tesQueryFormDetail() {
		Map<String, String> p = new HashMap<String, String>();
		p.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");
		p.put("orderid", "7");
		customFormService.queryFormDetail(p);
	}

	/*
	 * 报单详情
	 */
	@Test
	public void testqueryComment() {
		Map<String, String> p = new HashMap<String, String>();
		p.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");
		p.put("logisticsok", "7");
		Evaluate evaluate = new Evaluate();
		evaluate.setNumber("6");
		evaluate.setCommentcon("123");
		evaluate.setQualityint("123");
		Gson gson = new Gson();
		String json = gson.toJson(evaluate);
		p.put("commentinfo", json);
		customFormService.queryFormComment(p);
	}

}
