package day5_abstraction;

public class Rectangle extends Shape{
	
	@Override
	public void draw()
	{
		System.out.println("Use color is "+super.getColor()+" to draw rectangle");
	}

}
