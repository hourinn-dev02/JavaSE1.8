package cn.hourinn.demo.util;

class Company {
	private String cno;
	private String cname;
	private String address;
	private int employNum;
	private double marketValue;
	private boolean isPublicly;
	public Company(String cno){
		this.cno = cno;
	}
	public Company() {}
	public Company(String cno, String cname, String address, int employNum, double marketValue, boolean isPublicly) {
		this.cno = cno;
		this.cname = cname;
		this.address = address;
		this.employNum = employNum;
		this.marketValue = marketValue;
		this.isPublicly = isPublicly;
	}
	@Override
	public String toString() {
		return "Company [cno=" + cno + ", cname=" + cname + ", address=" + address + ", employNum=" + employNum
				+ ", marketValue=" + marketValue + ", isPublicly=" + isPublicly + "]";
	}
	
	
	
	
	
}



