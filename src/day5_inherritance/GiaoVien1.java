package day5_inherritance;

public class GiaoVien1 extends Nguoi {
	public int teacherId;
	    //overriding lên phương thức diChoi của lớp Nguoi
	  public void diChoi(){
	        System.out.println(getName() + " chi di choi vao cac ngay ranh!");
	    }
	    //hàm đi dạy
	    public void diDay(){
	        System.out.println(getName() + " Ma so giao vien: " + teacherId );
	        System.out.println("Di day tu thu 2 den thu 7!");
	    }
	    
	  

}
