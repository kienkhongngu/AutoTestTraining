package day5_inherritance;

public abstract class Nguoi {
    private String name;
    //hàm đi chơi
    public abstract void diChoi();
    public void setName(String specifyName)
	{
		this.name = specifyName;
	}
	public String getName()
	{
		return name;
	}
	 public int add(int a, int b) {
	    	return a + b;
	    	}

	   public double add(double a, double b) {
	    	return a + b;
	    	}
}





