package com.oops;

class OverRiding{
	void printValue(long  s) {
		System.out.println("asad");
	}
}

class OverRiding1 extends OverRiding{
	void printValue(byte b) {
		System.out.println("developer");
	}
}

public class OverrRidingPolyMorphism {

	public static void main(String[] args) {
 OverRiding1 riding1 = new OverRiding1();
 riding1.printValue(0);
 
 
 
	}

}
