package model;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author retryu E-mail:ruanchenyugood@gmail.com
 * @version create time：2013-8-26 下午2:32:15 declare:
 */
public class Product implements Serializable {

	private String id;
	private int cartid;
	private String name;
	private String simg;
	private String bimg;
	private String img;
	private String[] imgs;
	private String pid;
	private String number;
	private String title;
	private String pv;
	private Integer mun;
	private String price;

	private String format;
	private String summary;

	private int edmun;

	public String getProduct_id() {
		return id;
	}

	public void setProduct_id(String product_id) {
		this.id = product_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSimg() {
		return simg;
	}

	public void setSimg(String simg) {
		this.simg = simg;
	}

	public String getBimg() {
		return bimg;
	}

	public void setBimg(String bimg) {
		this.bimg = bimg;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPv() {
		return pv;
	}

	public void setPv(String pv) {
		this.pv = pv;
	}

	public int getMun() {
		return mun;
	}

	public void setMun(int mun) {
		this.mun = mun;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String[] getImgs() {
		return imgs;
	}

	public void setImgs(String[] imgs) {
		this.imgs = imgs;
	}

	public int getEdmun() {
		return edmun;
	}

	public void setEdmun(int edmun) {
		this.edmun = edmun;
	}

	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", cartid=" + cartid + ", name=" + name
				+ ", simg=" + simg + ", bimg=" + bimg + ", img=" + img
				+ ", imgs=" + Arrays.toString(imgs) + ", pid=" + pid
				+ ", number=" + number + ", title=" + title + ", pv=" + pv
				+ ", mun=" + mun + ", price=" + price + ", format=" + format
				+ ", summary=" + summary + ", edmun=" + edmun
				+ ", getProduct_id()=" + getProduct_id() + ", getName()="
				+ getName() + ", getSimg()=" + getSimg() + ", getBimg()="
				+ getBimg() + ", getPid()=" + getPid() + ", getNumber()="
				+ getNumber() + ", getTitle()=" + getTitle() + ", getPv()="
				+ getPv() + ", getMun()="  + ", getPrice()="
				+ getPrice() + ", getImg()=" + getImg() + ", getId()="
				+ getId() + ", getFormat()=" + getFormat() + ", getSummary()="
				+ getSummary() + ", getImgs()=" + Arrays.toString(getImgs())
				+ ", getEdmun()=" + getEdmun() + ", getCartid()=" + getCartid()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
