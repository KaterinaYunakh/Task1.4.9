import com.katerina.CircleProject.*;

public class Main {
    public static void main(String[] args){
	
		Point center1 = new Point(2,3);
		Circle circle1 = new Circle(center1, 3);
		
		System.out.println(circle1);
		
		Point center2 = new Point(2,3);
		Circle circle2 = new Circle(center2, 3);
		
		System.out.println(circle2);
		
		if (circle1.equals(circle2)){
			System.out.println("circles are equal");
		} else {
			System.out.println("circles are not equal");
		}
		
		System.out.println("Set a size of a circle to 12");
		
		circle1.setSize(12);
		System.out.println(circle1);
		
		
		System.out.println("Set a radius of a circle to 6");
		circle1.setRadius(6);
		System.out.println(circle1);
		
		if (circle1.equals(circle2)){
			System.out.println("circles are equal");
		} else {
			System.out.println("circles are not equal");
		}
		
		Point point1 = new Point(2,2);
		Point point2 = new Point(5,1);		
		circle2.isPointInCircle(point1);
		circle2.isPointInCircle(point2);
		
		
		
	}

}