package day5;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Scanner sc = new Scanner(System.in);
        int c;

        do {
            System.out.println("Nhap lua chon:\n1.Luong co ban\n2.Luong theo so nam kinh nghiem\n3.Luong chuyen khoa\n4.Luong da khoa\n5.Thoat");
            c = sc.nextInt();
            switch (c) {
                case 1: {
                    System.out.println("Nhap luong co ban:");
                    double l1 = sc.nextDouble();
                    d.setLuongcoban(l1);
                    System.out.println("Nhap he so luong:");
                    double h1 = sc.nextDouble();
                    d.setHesoluong(h1);
                    System.out.println("Luong bac si:" + d.Tinhluong1());
                    break;
                }

                case 2: {
                    System.out.println("Nhap luong co ban:");
                    double l2 = sc.nextDouble();
                    d.setLuongcoban(l2);
                    System.out.println("Nhap he so luong:");
                    double h2 = sc.nextDouble();
                    d.setHesoluong(h2);
                    System.out.println("Nhap so nam kinh nghiem:");
                    int n = sc.nextInt();
                    d.setSonamkinhnghiem(n);
                    System.out.println("Luong bac si:" + d.Tinhluong2());
                    break;
                }
                case 3: {
                    System.out.println("Nhap luong co ban:");
                    double l3 = sc.nextDouble();
                    d.setLuongcoban(l3);
                    System.out.println("Nhap he so luong:");
                    double h3 = sc.nextDouble();
                    d.setHesoluong(h3);
                    System.out.println("Nhap so nam kinh nghiem:");
                    int n2 = sc.nextInt();
                    d.setSonamkinhnghiem(n2);
                    System.out.println("Luong bac si chuyen khoa cong them:" + d.Tinhluong3(0.2));
                    break;
                }
                case 4: {
                    System.out.println("Nhap luong co ban:");
                    double l4 = sc.nextDouble();
                    d.setLuongcoban(l4);
                    System.out.println("Nhap he so luong:");
                    double h4 = sc.nextDouble();
                    d.setHesoluong(h4);
                    System.out.println("Nhap so nam kinh nghiem:");
                    int n3 = sc.nextInt();
                    d.setSonamkinhnghiem(n3);
                    System.out.println("Luong bac si da khoa cong them:" + d.Tinhluong4(0.45));
                    break;
                }
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("So khong hop le!");
            }
        } while (c != 5);
    }
}
