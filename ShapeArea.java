import java.util.Scanner;
class ShapeArea
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose Your Shape:");
		double Circlearea = 3.14*2*2;
		int Squarearea = 5*5;
		int Rectanglearea = 5*6;
		int Trianglearea = (1*6*5)/2;
		String Shape = sc.nextLine();
		switch (Shape)
		
		{
			case "Circle"->System.out.println("Area of Circle:"+Circlearea);
			case "Square"->System.out.println("Area of Square:"+Squarearea);
			case "Rectangle"->System.out.println("Area of Rectangle:"+Rectanglearea);
			case "Triangle"->System.out.println("Area of Triangle:"+Trianglearea);
			default->System.out.println("Invalid Shape");
		}
	}
}