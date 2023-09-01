public class Main {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(5, 10);
        MyPoint point2 = new MyPoint(10, 5);

        System.out.println("Distance between point1 and point2: " + point1.getDistance(point2));
        System.out.println("Distance from point1 to origin: " + point1.getDistance());
        System.out.println("Quadrant of point1: " + point1.getQuadrant());
        System.out.println("Angle from positive x-axis for point1: " + point1.getAngle());

        point1.displayPoint();
        System.out.println(point1.toString());
    }
}
