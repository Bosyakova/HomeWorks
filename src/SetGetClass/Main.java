package SetGetClass;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(0, 5);
        Point point2 = new Point(0, 0);
        System.out.println();
        double result = distance(point1,point2);
        System.out.println(result);
    }

    public static double distance(Point p1, Point p2){
        int x1 = p1.getX();
        int x2 = p2.getX();
        int y1 = p1.getY();
        int y2 = p2.getY();
        double distance = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return distance;
    }
}