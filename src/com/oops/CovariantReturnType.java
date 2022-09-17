package com.oops;

class CheckCovariant {
	public void print() {
		System.out.println("print 1 ");
	}
}

class CheckCovariant2 extends CheckCovariant {

	public void print() {
		System.out.println("print 2 ");
	}

}

public class CovariantReturnType {

	public static void main(String[] args) {
		CheckCovariant covariant2 = new CheckCovariant2();
		covariant2.print();
	}
}
