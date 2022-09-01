package com.technical;

class GetMoboleLastDigits {
	
	private GetMoboleLastDigits() {}

	public static String lastFour(String s) {
		StringBuilder lastFour = new StringBuilder();
		int check = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (Character.isDigit(s.charAt(i))) {
				check++;
			}
			if (check <= 4) {
				lastFour.append(s.charAt(i));
			} else {
				lastFour.append(Character.isDigit(s.charAt(i)) ? "*" : s.charAt(i));
			}
		}
		System.out.println(lastFour.reverse().toString());
		return lastFour.reverse().toString();
	}
}

public class GetPhoneInMasked {
	public static void main(String[] args) {
		GetMoboleLastDigits.lastFour("7458872341");
	}
}
