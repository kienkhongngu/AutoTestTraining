package day5_abstraction;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rect = new Rectangle(); // 
		rect.setColor("Green");
		rect.draw();
		System.out.println("---------");
		Shape circle = new Circle();
		circle.draw();
	}
}
