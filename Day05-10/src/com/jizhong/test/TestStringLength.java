package com.jizhong.test;

import java.util.Scanner;

/**
 * int String.length()：获取字符串长度
 * @author BaiHongyu
 *
 */
public class TestStringLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String str = sc.next();
		//获取输入字符串长度
		int length = str.length();
		System.out.println("当前输入的字符串长度为：\"" + str.length() + "\"");
	}
}
