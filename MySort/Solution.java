import java.util.*;

class MySortF implements Comparator<Point> {
    @Override
    public int compare(Point p1, Point p2) {
        if (p1.getX() == p2.getX()) {
            return p1.getY() - p2.getY();
        }

        return p1.getX() - p2.getX();
    }
}

class MySortS implements Comparator<Point> {
    @Override
    public int compare(Point p1, Point p2) {
        if (p1.getY() == p2.getY()) {
            return p1.getX() - p2.getX();
        }

        return p1.getY() - p2.getY();
    }
}

public class Solution {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<Point>();

        points.add(new Point(1, 2));
        points.add(new Point(-1, 3));
        points.add(new Point(19, -2));

        Collections.sort(points, new MySortS());
        System.out.println(points.toString());
    }
}