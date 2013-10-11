package model;

public class ResultPeriod {

	private String periodsid;
	private String title;
	private String times;
	public String getPeriodsid() {
		return periodsid;
	}
	public void setPeriodsid(String periodsid) {
		this.periodsid = periodsid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTimes() {
		return times;
	}
	public void setTimes(String times) {
		this.times = times;
	}
	@Override
	public String toString() {
		return "ResultPeriod [periodsid=" + periodsid + ", title=" + title
				+ ", times=" + times + "]";
	}
	
	
}
