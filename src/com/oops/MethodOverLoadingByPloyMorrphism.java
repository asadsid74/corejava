
package com.oops;

class Overload {
	public void printValue(long l, int h) {
		System.out.println("method1" );
	}

	public void printValue(int a, String s) {

		System.out.println("method2");
	}

	public void printValue() {

		System.out.println("method3");
	}
}

public class MethodOverLoadingByPloyMorrphism {

	public static void main(String[] args) {

		Overload overload = new Overload();
		overload.printValue(23,"434");

	}

}
