package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import model.Address;
import model.Order;
import model.Product;

import org.json.JSONArray;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.http.ShopService;
import com.http.ViewCommonResponse;

/**
 * @author retryu E-mail:ruanchenyugood@gmail.com
 * @version create time：2013-9-8 下午6:06:11 declare:
 */
public class TestShop {
	ShopService shopService;

	@Before
	public void init() {
		shopService = new ShopService();
	}

	@Test
	public void test() {
		System.out.println("hah");
		shopService.getPrbsList();
	}

	@Test
	public void testSerizalProduct() {
		Map<String, String> p = new HashMap<String, String>();
		p.put("cid", "1");
		shopService.getSerizleProduct(p);
	}

	@Test
	public void testgetBrands() {
		Map<String, String> p = new HashMap<String, String>();
		p.put("bid", "5");
		shopService.getBrandInfo(p);
	}

	@Test
	public void testGetProductBase() {

		Map<String, String> p = new HashMap<String, String>();
		p.put("pid", "272");
		shopService.getProductSimpleInfo(p);

	}

	@Test
	public void testGetProductDetail() {

		Map<String, String> p = new HashMap<String, String>();
		p.put("pid", "272");
		shopService.getProductDetail(p);

	}

	/**
	 * 为完成
	 */
	@Test
	public void testGetProductEvaluate() {

		Map<String, String> p = new HashMap<String, String>();
		p.put("pid", "272");
		shopService.getProductComment(p);

	}

	@Test
	public void testGetKeyWord() {

		Map<String, String> p = new HashMap<String, String>();
		p.put("keysword", "1");
		shopService.getKeyWord(p);

	}

	@Test
	public void testSearch() {
		Map<String, String> p = new HashMap<String, String>();
		p.put("keysword", "御");
		shopService.Search(p);
	}

	@Test
	public void testAddShop() {
		Map<String, String> p = new HashMap<String, String>();
		p.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");
		p.put("pid", "272");
		p.put("number", "addshoppingcart");
		p.put("mun", "2");
		shopService.addShop(p);
	}

	@Test
	public void testQueryShopcart() {
		Map<String, String> p = new HashMap<String, String>();
		p.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");
		p.put("all", "1");
		shopService.quryShop(p);
	}

	/*
	 * ok
	 */
	@Test
	public void testEditShopcart() {

		Map<String, String> p = new HashMap<String, String>();
		p.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");
		Gson gson = new Gson();

		p.put("cartid", "18");
		p.put("edmun", "6");
		shopService.editShop(p);
	}

	public List<Product> getCartList() {
		ArrayList<Product> products = new ArrayList<Product>();
		Product product = new Product();
		product.setCartid(18);
		product.setEdmun(5);
		products.add(product);
		return products;
	}

	@Test
	public void testDeleteShopcart() {
		Map<String, String> p = new HashMap<String, String>();
		p.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");
		p.put("cartid", "10");
		shopService.deleteShop(p);
	}

	@Test
	public void testSubmitOrder() {
		Order order = getOrder();
		Map<String, String> p = new HashMap<String, String>();
		p.put("storeid", order.getStoreid());
		p.put("bianhao", order.getBianhao());
		p.put("ubianhao", order.getUbianhao());
		p.put("username", order.getUsername());
		p.put("fhtype", order.getFhtype());
		p.put("hometel", order.getHometel());
		p.put("mobiletel", order.getMobiletel());
		p.put("address", order.getAddress());
		p.put("receiver", order.getReceiver());
		p.put("totalamt", order.getTotalamt());
		p.put("totalpv", order.getTotalpv());
		p.put("sysflag", order.getSysflag());
		p.put("ordertype", order.getOrdertype());
		p.put("paytype", order.getPaytype());

		Gson gson = new Gson();

		Map<String, String> p2 = new HashMap<String, String>();
		p2.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");
		p2.put("all", "1");
		ViewCommonResponse response = shopService.quryShop(p2);
		List<Product> products = (List<Product>) response.getData();
		String json = gson.toJson(products);
		p.put("productlist", json);
		System.out.println(order);
		shopService.sumbitOrder(p);
	}

	public Order getOrder() {
		Order order = new Order();
		order.setStoreid("nba001");
		order.setBianhao("8888888888");
		order.setUbianhao("H7Mud3IiaWjWqdL4J4qEJA==");
		order.setUsername("公司");
		order.setFhtype("0");
		order.setHometel("05712212118");
		order.setMobiletel("13567124034");
		order.setAddress("漕溪北里");
		order.setReceiver("123");
		order.setTotalamt("1002");
		order.setTotalpv("35");
		order.setSysflag("1");
		order.setOrdertype("2");
		order.setPaytype("1");
		List<Product> products = getCartList();
		order.setProductlist(products);

		// 加密
		return order;
	}

	/**
	 * 支付接口
	 */
	@Test
	public void testPayShopcart() {
		Map<String, String> p = new HashMap<String, String>();
		p.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");
		p.put("runno", "BD20130913001310");
		p.put("paytype", "1");
		shopService.payOrder(p);
	}

	/*
	 * 收货得知接口
	 */
	@Test
	public void testqueryAddress() {
		Map<String, String> p = new HashMap<String, String>();
		p.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");
		p.put("pageno", "0");
		shopService.getAddress(p);
	}

	/*
	 * 获得收获接口
	 */
	@Test
	public void testaddAddress() {
		Address address = getAddress();

		Map<String, String> p = new HashMap<String, String>();
		p.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");
		p.put("name", address.getName());
		p.put("call", address.getCall());
		p.put("code", address.getCode());
		p.put("infrom", address.getInfrom());
		p.put("adds", address.getAdds());
		shopService.addAddress(p);
	}

	public Address getAddress() {
		Address address = new Address();
		address.setAdds("xxx");
		address.setCall("13567124034");
		address.setName("杭州");
		address.setCode("310000");
		address.setInfrom("西湖区");
		address.setUserid("H7Mud3IiaWjWqdL4J4qEJA==");
		return address;
	}

	/*
	 * 编辑收获接口
	 */
	@Test
	public void testEditAddress() {
		Address address = getAddress();

		Map<String, String> p = new HashMap<String, String>();
		p.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");
		p.put("addsid", "2");
		p.put("name", "测试1");
		p.put("call", "1370000000");
		p.put("infrom", "浙江宁波");
		p.put("adds", address.getAdds());
		shopService.updateAddress(p);
	}

	/*
	 * 删除收获接口
	 */
	@Test
	public void testDeleteAddress() {
		Address address = getAddress();

		Map<String, String> p = new HashMap<String, String>();
		p.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");
		p.put("addsid", "1");
		shopService.deleteAddress(p);
	}

	/*
	 * 默认收获接口
	 * 
	 * 如果已是默认 会提醒失败
	 */
	@Test
	public void testDefaultAddress() {
		Address address = getAddress();

		Map<String, String> p = new HashMap<String, String>();
		p.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");
		p.put("addsid", "9");
		shopService.defaultAddress(p);
	}

	/*
	 * 默认收获接口
	 * 
	 * 如果已是默认 会提醒失败
	 */
	@Test
	public void testRoomQuery() {
		Address address = getAddress();
		Map<String, String> p = new HashMap<String, String>();
		p.put("userid", "H7Mud3IiaWjWqdL4J4qEJA==");
		p.put("shopid", "nba001");
		p.put("shopname", "不能发货，公司内部测试用");
		shopService.queryRoom(p);
	}

}
