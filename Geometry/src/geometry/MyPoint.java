public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDistance(MyPoint point) {
        double deltaX = point.getX() - x;
        double deltaY = point.getY() - y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double getDistance(double x, double y) {
        return getDistance(new MyPoint(x, y));
    }

    public double getDistance() {
        return getDistance(new MyPoint(0, 0));
    }

    public void displayPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public String getQuadrant() {
        if (x == 0 && y == 0) {
            return "NULL";
        } else if (x > 0 && y > 0) {
            return "1";
        } else if (x < 0 && y > 0) {
            return "2";
        } else if (x < 0 && y < 0) {
            return "3";
        } else if (x > 0 && y < 0) {
            return "4";
        } else if (x == 0 && y != 0) {
            return "5"; // X-axis
        } else {
            return "6"; // Y-axis
        }
    }

    public double getAngle() {
        if (x == 0 && y == 0) {
            return 0;
        } else {
            return Math.toDegrees(Math.atan2(y, x));
        }
    }
}
