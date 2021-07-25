package com.jizhong.test;

/**
 * int indexOf(String s)：获取指定字符(串)在当前字符串中第一次出现的位置
 * int indexOf(int ch)：获取指定字符(串)在当前字符串中第一次出现的位置
 * 
 * int lastIndexOf(String s)：获取指定字符(串)在当前字符串中最后一次出现的位置
 * int lastIndexOf(int ch)：获取指定字符(串)在当前字符串中最后一次出现的位置
 *
 */
public class TestStringIndexOf {
	public static void main(String[] args) {
		String str = new String("abcabcabcabc");//char[] c = {'a','b','c'};
		int index = str.lastIndexOf("d");
		System.out.println(index);//9
		
	}
}
