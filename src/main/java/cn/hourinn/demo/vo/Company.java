package cn.hourinn.demo.vo;

public class Company {
	private int cno;
	private String cname;
	
	public Company(int cno, String cname) {
		super();
		this.cno = cno;
		this.cname = cname;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String print() {
		return "Company [cno=" + cno + ", cname=" + cname + "]";
	}
	
}
