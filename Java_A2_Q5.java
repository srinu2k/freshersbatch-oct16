abstract class Shape
{
	abstract void draw();
}

class Line extends Shape
{
	void draw() 
	{
		System.out.println("Draw a Line");
	}
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Draw a Rectange");
	}
}

class Cube extends Shape
{
	void draw()
	{
		System.out.println("Draw a Cube");
	}
}

public class Java_A2_Q5
{

	public static void main(String[] args) {
		Shape l = new Line();
		Shape r = new Rectangle();
		Shape c = new Cube();
		l.draw();
		r.draw();
		c.draw();
	}

}