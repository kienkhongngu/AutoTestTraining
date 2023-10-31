package Practice;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Hinhtron h = new Hinhtron();
        Hinhchunhat s = new Hinhchunhat();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap ban kinh:");
        double r = sc.nextDouble();
        h.setBankinh(r);
        System.out.println("Dien tich hinh tron: " + h.dientichhinhtron());
        
        System.out.println("Nhap chieu dai: ");
        double a = sc.nextDouble();
        s.setA(a);
        System.out.println("Nhap chieu rong:");
        double b = sc.nextDouble();
        s.setB(b);
        System.out.println("Dien tich hinh chu nhat: " + s.dientichchunhat());
    }
}
