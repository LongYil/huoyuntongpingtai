package cn.lyl.ssm.utils;

import cn.lyl.ssm.po.Jbyh;

public class testCast {

	public static void main(String[] args) throws ReflectiveOperationException {

//		System.out.println(Jbyh.class.newInstance());
		
		getInstance(Jbyh.class);
	}
	public static void getInstance(Class type) throws InstantiationException, ReflectiveOperationException{
		System.out.println(type.newInstance());
	}

}
