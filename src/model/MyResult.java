package model;

public class MyResult {

	private String maxmanagerlevel;
	private String standardmanagerlevel;
	private String groupevaluation;
	private String allexpense;
	private String allresale;
	private String resalepercent;
	public String getMaxmanagerlevel() {
		return maxmanagerlevel;
	}
	public void setMaxmanagerlevel(String maxmanagerlevel) {
		this.maxmanagerlevel = maxmanagerlevel;
	}
	public String getStandardmanagerlevel() {
		return standardmanagerlevel;
	}
	public void setStandardmanagerlevel(String standardmanagerlevel) {
		this.standardmanagerlevel = standardmanagerlevel;
	}
	public String getGroupevaluation() {
		return groupevaluation;
	}
	public void setGroupevaluation(String groupevaluation) {
		this.groupevaluation = groupevaluation;
	}
	public String getAllexpense() {
		return allexpense;
	}
	public void setAllexpense(String allexpense) {
		this.allexpense = allexpense;
	}
	public String getAllresale() {
		return allresale;
	}
	public void setAllresale(String allresale) {
		this.allresale = allresale;
	}
	public String getResalepercent() {
		return resalepercent;
	}
	public void setResalepercent(String resalepercent) {
		this.resalepercent = resalepercent;
	}
	@Override
	public String toString() {
		return "MyResult [maxmanagerlevel=" + maxmanagerlevel
				+ ", standardmanagerlevel=" + standardmanagerlevel
				+ ", groupevaluation=" + groupevaluation + ", allexpense="
				+ allexpense + ", allresale=" + allresale + ", resalepercent="
				+ resalepercent + "]";
	}
	
}
