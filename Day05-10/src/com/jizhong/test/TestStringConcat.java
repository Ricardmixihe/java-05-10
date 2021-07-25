package com.jizhong.test;
/**
 * String concat(String s)：
 * 		字符串拼接
 *
 */
public class TestStringConcat {
	public static void main(String[] args) {
		String s1 = "Hello ";
		String s2 = "World!!!";
		String s3 = s1 + s2;
		String s4 = s1.concat(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
