package day4;

import java.util.Scanner;

public class Developer extends Employees {//git comment
	private String dev;
	public Developer() {		
	}
    public Developer(String dev) {
		super();
		this.dev = dev;
	}
	public String getDev() {
		return dev;
	}
	public void setDev(String dev) {
		this.dev = dev;
	}
	
	public static void main(String[] args) {
    	// tạo lớp dev mới
        Developer d = new Developer();
        
        //tạo đối tượng nhập vào
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap id:");
        int id = sc.nextInt();
        sc.nextLine();
        d.setId(id);
        System.out.println("Nhap ten:");
        String name = sc.nextLine();
        d.setName(name);
        System.out.println("Nhap Dev Programming:");
        String dev = sc.nextLine();
        d.setDev(dev);
        System.out.println("Nhap luong:");
        double salary = sc.nextDouble();
//        d.setSalary(salary);
        
        //in ra thông tin
        System.out.println("ID nhan vien: " + d.getId());
        System.out.println("Ten nhan vien:" + d.getName());
        System.out.println("Developer programming:" + d.getDev());
        System.out.println("Luong nhan vien:"+ d.getSalary());
        sc.close();
	}
}
