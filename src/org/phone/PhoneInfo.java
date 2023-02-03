package org.phone;

public class PhoneInfo {
	private void phoneName() {
		System.out.println("Phone Name = Apple");
		
	}
	private void phoneModelNumber() {
		System.out.println("Phone Model Number = 13 PRO");
	}
	
	private void phoneCamara() {
		System.out.println("Phone Camara = 50MP");
	}
	
	private void phoneStorage() {
		System.out.println("Phone Storage = 128GB");
	}
	public static void main(String args[]) {
		PhoneInfo P=new PhoneInfo();
		P.phoneName();
		P.phoneModelNumber();
		P.phoneCamara();
		P.phoneStorage();
	}
	
}




