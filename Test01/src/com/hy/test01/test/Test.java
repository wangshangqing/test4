package com.hy.test01.test;

import java.util.ArrayList;
import java.util.List;

import com.hy.test01.bean.Sp;

public class Test {

	public static void main(String[] args) {
		List<Sp> list=new ArrayList<Sp>();
		Sp sp1=new Sp();
		sp1.setSname("jsp");
		
		Sp sp2=new Sp();
		sp2.setSname("servlet");
		
		list.add(sp1);
		list.add(sp2);
		
		for (int i = 0; i <list.size(); i++) {
			Sp s=list.get(i);
			System.out.println(s.getSname());
		}
	}

}
