package com.oops;

class Student {
	public void getStudentName() {
		System.out.println("my name is asad");
	}
}

class Teacher extends Student {

	public void getTeacher() {

		super.getStudentName();
		this.getTeachersName();
		System.out.println("I am Teacher Constructor");
	}
	
	public void getTeachersName() {
		System.out.println("My name is Asad Commerce Teacher");
	}
}
public class SuperDemo {

	public static void main(String[] args) {

		Teacher demo = new Teacher();
		// demo.getTeacherName();
		demo.getTeacher();
	}

}
