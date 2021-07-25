package com.jizhong.test;

import com.jizhong.pojo.Calc;

public class TestCalc {
	public static void main(String[] args) {
		Calc calc = new Calc();
		int sum = calc.add(1,6,3);//实参
		System.out.println(sum);
	}
}
