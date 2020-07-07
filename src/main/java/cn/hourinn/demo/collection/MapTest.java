package cn.hourinn.demo.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Collectors;


import cn.hourinn.demo.vo.Company;
import cn.hourinn.demo.vo.Member;

public class MapTest {
	
	public static void main(String[] args) {
		Collection<Company> companies = new ArrayList<Company>();
		companies.add(new Company(1001,"company01"));
		companies.add(new Company(1002,"company02"));
		companies.add(new Company(1003,"company03"));
		
		Iterator<Company> iterator = companies.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().print());
		}
	}
}
