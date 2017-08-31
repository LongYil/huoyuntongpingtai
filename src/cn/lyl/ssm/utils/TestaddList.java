package cn.lyl.ssm.utils;

import java.util.ArrayList;
import java.util.List;

public class TestaddList {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		list1.add("a1");
		list1.add("a2");
		list1.add("a3");
		
		list2.add("a4");
		list2.add("a5");
		list2.add("a6");
		
		list1.addAll(list2);
		
		System.out.println(list1);
		
	}

}
