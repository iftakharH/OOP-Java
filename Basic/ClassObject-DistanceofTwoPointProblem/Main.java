
public class Main
{
	public static void main(String[] args) {
	    Point point1 = new Point (4, 3);
	    Point point2 = new Point (7, 6);
	    double distance= Point.distanceCalc(point1, point2);
	    
		System.out.println("Distance Between the two points:  "+ distance);
	}
}