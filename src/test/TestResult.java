package test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.http.CustomeService;
import com.http.ResultsService;

public class TestResult {

	ResultsService resultService = new ResultsService();
	@Test
	public void testQueryList() {
		Map<String, String> p = new HashMap<String, String>();
		p.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");

		resultService.queryList(p);
	}

	@Test
	public void testQueryMy() {
		Map<String, String> p = new HashMap<String, String>();
		p.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");
		p.put("qsid", "219");

		resultService.queryMyResult(p);
	}

	@Test
	public void testSalePOOL() {
		Map<String, String> p = new HashMap<String, String>();
		p.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");
		p.put("qsid", "219");

		resultService.querySalesPool(p);
	}

	@Test
	public void testSaleFuXiao() {
		Map<String, String> p = new HashMap<String, String>();
		p.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");
		p.put("qsid", "219");

		resultService.queryFuXiao(p);
	}
}
