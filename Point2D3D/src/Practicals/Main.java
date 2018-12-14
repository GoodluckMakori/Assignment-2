package Practicals;

public class Main {

    public static void main(String[] args) {
        Point2D p2a = new Point2D(1, 2);
        System.out.println(p2a);  // toString()
        Point2D p2b = new Point2D();  // default constructor
        System.out.println(p2b);


        p2a.setX(3);
        p2a.setY(4);
        System.out.println(p2a);  // toString()
        System.out.println(p2a.getX()+"," + p2a.getY());


        Point3D p3a = new Point3D(9, 18, 13);
        System.out.println(p3a);  // toString()
        Point2D p3b = new Point2D();  // default constructor
        System.out.println(p3b);


        p3a.setZ(27);
        System.out.println(p3a);  // toString()
        System.out.println( p3b.getX()+","+ p3b.getY()+","+ p3a.getZ());
    }
}
