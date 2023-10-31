package day2;

import java.util.Scanner;

public class number {
	public static void main(double n1,double n2) {
		if(n1>n2) {
			System.out.println("so lon hon la:"+n1);
		}else {
			System.out.println("so lon hon la:"+n2);
		}
	}
	public static void main(String[]args) {
		double n1,n2,n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so thu nhat:");
		n1 = sc.nextDouble();
		System.out.println("nhap so thu 2:");
		n2 = sc.nextDouble();
		System.out.println("nhap so thu 3:");
		n3 = sc.nextDouble();
		double sum = (n1*n2)/n3 ;
		System.out.println("Tong:"+sum);
		main(n1,n2);
	}
}
