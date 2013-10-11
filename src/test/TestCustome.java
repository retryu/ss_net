package test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.http.CustomeService;

public class TestCustome {

	CustomeService customeService = new CustomeService();

	@Test
	public void testCustomeQuery() {
		Map<String, String> p = new HashMap<String, String>();
		p.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");
		p.put("querytype", "0");
	}

	@Test
	public void testAddQuery() {
		Map<String, String> p = new HashMap<String, String>();
		p.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");
		p.put("name", "小软");
		p.put("cardno", "1110");
		p.put("addtimer", "2012/01/03");
		p.put("mobilephone", "13567124034");
		p.put("homephone", "2212118");
		p.put("email", "shibanyun@163.com");
		p.put("address", "啊啊啊啊");
		p.put("sex", "男");
		p.put("birthday", "2013-01-02");
		p.put("work", "程序呀");
		p.put("mark", "0");

		customeService.addCustome(p);
	}

	@Test
	public void testquery() {
		Map<String, String> p = new HashMap<String, String>();
		p.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");
		customeService.queryCustome(p);
	}

}
