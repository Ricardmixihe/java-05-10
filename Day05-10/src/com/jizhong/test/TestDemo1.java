package com.jizhong.test;

import java.util.Scanner;

public class TestDemo1 {

	/**
	 * zhiZhuMM@pansidong.com这个类型。
	 * 在唐班长拦截计划中，首先要确认八戒是在发送邮件，
	 * 所以先要验证八戒是否在给某个邮箱发送邮件，确认之后，
	 * 从邮件地址中提出@符号后面的部分与pansidong.com进行匹配，
	 * 匹配成功后进行拦截。
	 */
	public static void main(String[] args) {
		//1. 拦截信息
		Scanner sc = new Scanner(System.in);
		String bajie = sc.next();//八戒发送的邮箱地址
		
		//2. 验证邮箱
		//zhiZhuMM@pansidong.com
		//2.1 获取@符号在字符串中出现的位置
		int index = bajie.indexOf("@");
		//2.2 截取@符号后的字符串
		String pan = bajie.substring(index + 1);
		//2.3 验证邮箱信息
		if(pan.equals("pansidong.com")){
			System.out.println("拦截八戒邮箱！！");
		}else {
			System.out.println("放行！！");
		}
		sc.close();
	}
}
