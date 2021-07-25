package com.jizhong.test;
/**
 * StringBuilder：字符串缓冲区
 * 		用来定义一长串的字符串，每传入一个字符串本身不会在内存中重新开辟空间
 *
 */
public class TestStringBuffer {
	public static void main(String[] args) {
		//字符串不能发生变化，如果发生变化，需要重新开辟空间
		String s1 = "aaa";//1
		String s2 = "bbb";//2
		String s3 = s1 + s2;//3
		s3 += "ccc";//4
		
		//效率提升↓
		
		//字符串缓冲区
		//字符串如果发生变化，无需开辟新的空间
		//自动扩充机制
		StringBuffer buf = new StringBuffer();//char[16]
		//append(String s)：添加新的字符串到缓冲区的尾部
		buf.append(s1);
		buf.append(s2);
		buf.append("ccc");
		System.out.println(buf);
		
		//与StringBuffer对象作用一模一样
		/**
		 * 与StringBuffer对象区别：
		 * 		StringBuffer对象：
		 * 			线程安全的（效率慢）
		 * 		StringBuilder对象：
		 * 			线程不安全（效率快）
		 */
		StringBuilder bui = new StringBuilder();
		bui.append("aaa");
		bui.append("bbb");
		bui.append("ccc");
		System.out.println(bui);
		
		/**
		 * String类型与StringBuilder（StringBuffer）之间转换
		 * 		String -> StringBuilder：
		 * 			StringBuilder的构造方法进行转换
		 * 		StringBuilder -> String：
		 * 			StringBuilder.toString()：将缓冲区内字符串取出，并返回
		 */
		StringBuilder bui2 = new StringBuilder(s1);
		System.out.println(bui2);
		String str1 = bui2.toString();
		System.out.println(str1);
	}
}
