package day2;

import java.util.Scanner;

public class BTVN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; // khai báo mảng
        int sum = 0;

        // nhập số lượng phần tử của mảng
        System.out.println("Nhập số lượng phần tử của mảng:");

        // khởi tạo mảng với số lượng phần tử nhập vào
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập giá trị cho phần tử thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Tổng giá trị của mảng là: " + sum);

        sc.close();
    }
}