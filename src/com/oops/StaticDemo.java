package com.oops;

class StaticKeywordUse{
	static int number = 3000;
	public static void getStaticValue() {
		System.out.println("static value is:" + number);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		System.out.println(StaticKeywordUse.number);
	}

}
