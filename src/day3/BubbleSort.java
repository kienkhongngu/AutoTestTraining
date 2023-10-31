
package day3;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
	public static void BubbleSort(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			boolean sorte = true; // dat true de kiem tra mang da duoc sap xep
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					sorte = false;
				}
			}
			if (sorte)
				return;
		}
	}

	private static int[] CreateArray(int n) {
		int[] a = new int[n];
		Random rd = new Random();
		// random so
		for (int i = 0; i < n; i++) {
			a[i] = rd.nextInt(n);
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
		int a[] = CreateArray(n);
		/*
		 * for (int i = 0; i < n; i++) { a[i] = Validation.getInt(); }
		 */
		System.out.print("Unsorted array: ");
		System.out.print("[");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]);
			if (i < a.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		System.out.println();
		BubbleSort(a);
		System.out.print("Sorted Array  : ");
		System.out.print("[");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]);
			if (i < a.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		System.out.println();
	}

}