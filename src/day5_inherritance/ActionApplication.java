package day5_inherritance;

import java.util.Scanner;

public class ActionApplication {

	    public static void main(String args[]){
	        SinhVien1 sv1 =  new SinhVien1();
	        Scanner sc = new Scanner(System.in);
	        
	        sv1.setName("Sinh vien"); 
	        

	        sv1.studentId = 1;
	        sv1.diHoc();
	        sv1.diChoi();
	        System.out.println("\n");
	        GiaoVien1 gv1 =  new GiaoVien1();
	        gv1.setName( "Giao vien");
	        
	        gv1.teacherId = 2;
	        gv1.diDay();
	        gv1.diChoi();
//	        
	    }
}
