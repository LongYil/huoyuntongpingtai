package cn.lyl.ssm.utils;

public class testintcastfloat {

	public static void main(String[] args) {
		float a = 11.2f;

		int b = Float.floatToIntBits(a);
		System.out.println(Math.round(a));
	}

}
