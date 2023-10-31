package day5_inherritance;

public class SinhVien1 extends Nguoi{
	   public int studentId;
	  
	    public void diHoc(){
	        System.out.println(getName() + " Ma so sinh vien: " + studentId);
	        System.out.println("Di hoc tu thu 2 den thu 7!");
	    }
	    
	    public void diChoi(){
	        System.out.println(getName() + " Di choi chu nhat!");
	    }
}
