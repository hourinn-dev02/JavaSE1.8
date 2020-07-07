package cn.hourinn.demo.util;

public class TestCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company companys[] = new Company[100];
		for (int i = 1; i <= 100; i++) {
			companys[i-1] = new Company(i+"", "黑心企业"+i, "唐人街"+i+"号", 100+i, 5000*i, true);
			System.out.println(companys[i].toString());
		}
		
	}
}
