package com.jizhong.test;

import java.util.Scanner;

/**
 * boolean String.equals(String s)：
 * 	字符串内容比较
 * boolean equalsIgnoreCase(String s):
 * 	字符串内容比较，忽略字母大小写
 * String String.toUpperCase() 将字符串中的英文部分转换为大写。
 * String String.toLowerCase() 将字符串中的英文部分转换为小写。 
 */
public class TestStringEquals {
	public static void main(String[] args) {
		//判断两个人喜欢的是否是同一个明星
		Scanner sc = new Scanner(System.in);
		System.out.println("小新喜欢的明星是：");
		String favName1 = sc.next();
		System.out.println("小明喜欢的明星是：");
		String favName2 = sc.next();
//		if(favName1.equals(favName2)){
//			System.out.println("这么巧，两人喜欢的明星是一样的");
//		}else {
//			System.out.println("两人喜欢的明星不一样");
//		}
		if(favName1.equalsIgnoreCase(favName2)){
			System.out.println("这么巧，两人喜欢的明星是一样的");
		}else {
			System.out.println("两人喜欢的明星不一样");
		}
//		System.out.println(favName1.toUpperCase());//ABC
//		System.out.println(favName2.toUpperCase());//ABC
//		System.out.println(favName1.toLowerCase());//abc
//		System.out.println(favName2.toLowerCase());//abc
		sc.close();
		
		
		
		
		
	}
}
