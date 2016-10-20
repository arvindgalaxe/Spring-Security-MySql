package com.katte.galaxe;

public class Report {
   public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getImpression() {
		return Impression;
	}
	public void setImpression(String impression) {
		Impression = impression;
	}
	public String getClicks() {
		return Clicks;
	}
	public void setClicks(String clicks) {
		Clicks = clicks;
	}
	public String getEarning() {
		return Earning;
	}
	public void setEarning(String earning) {
		Earning = earning;
	}
	private String Date;
   private String Impression;
   private String Clicks;
   private String Earning;
}
