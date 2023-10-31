package day5_abstraction;

public abstract class Shape {
	private String color = "Red";
	
	public abstract void draw();
	
	public void setColor(String colorShape)
	{
		this.color = colorShape;
	}
	public String getColor()
	{
		return color;
	}
}

