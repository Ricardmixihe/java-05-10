package com.jizhong.test;

public class TestDemo02 {
	public static void main(String[] args) {
		//秋水长天
		//落霞与孤鹜齐飞，秋水共长天一色。
		//1. 判断"秋水长天"是否在文字中
		String str1 = "落霞与孤鹜齐飞，秋水共长天一色。";
		String str2 = "秋水共长天";
		if(str1.indexOf(str2) >= 0){
			System.out.println("秋水长天在文字中");
		}else{
			System.out.println("秋水长天不在文字中");
		}
		//2. 如果在，则把"秋水共长天"在文字中截取出来
		String str3 = str1.substring(
				str1.indexOf(str2),str1.indexOf(str2) + str2.length());
		System.out.println(str3);
	}
}
