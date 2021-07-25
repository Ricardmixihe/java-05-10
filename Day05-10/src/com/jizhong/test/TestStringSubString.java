package com.jizhong.test;
/**
 * 字符串截取：
 * String subString(int index)：
 * 		从字符串哪个索引开始截取，截取索引位置到字符串最后位置
 * String subString(int beginIndex,int endIndex)：（含头不含尾）
 * 		从字符串的beginIndex位置开始截取，一直截取到endIndex位置
 * String trim()：
 * 		消除字符串两边的空格
 * 
 */
public class TestStringSubString {
	public static void main(String[] args) {
		String str = "   abcde  fghijk   ";
		String sub = str.substring(3);//返回截取后的字符串
		System.out.println(sub);
		String sub2 = str.substring(0,6);
		System.out.println(sub2);
		String trim = str.trim();//消除字符串两边空格
		System.out.println(trim);
		String string = new String("abc");
	}
}
