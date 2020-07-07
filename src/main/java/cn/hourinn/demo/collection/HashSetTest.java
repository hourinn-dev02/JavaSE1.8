package cn.hourinn.demo.collection;

import java.util.Date;
import java.util.HashSet;


import cn.hourinn.demo.vo.Member;

public class HashSetTest {
	
	public static void main(String[] args) {
		Member member = null;
		HashSet<Member> set = new HashSet<Member>();
		for(int x=0;x<10;x++) {
			member = new Member("tom"+x,21,new Date());
			set.add(member);
		}
		System.out.println(set.size());
	}
}
