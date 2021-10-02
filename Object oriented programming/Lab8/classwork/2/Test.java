import java.util.ArrayList;


public class Test {
	public static boolean getDistance(Point p) {
		if (Math.sqrt(Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2)) < 1) {
			return true;
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		ArrayList<Point> points = new ArrayList<Point>();
		points.add(new Point(1, 1));
		points.add(new Point(0.5, 0.5));
		points.add(new Point(1, 0.2));
		points.add(new Point(0.5, 1));
		points.add(new Point(-0.2, 0.1));
		
		for (Point p : points) {
			if (getDistance(p)) {
				System.out.println(p);
			}
		}
	}
}