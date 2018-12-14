package Practicals;

public class Main {

    public static void main(String[] args) {
        Circle circle=new Circle(1.0);
        circle.setColor("red");
        circle.setRadius(12);
        circle.getArea();
        System.out.println(circle.toString());

        //for rectangle
        Rectangle rectangle= new Rectangle(1.0, 1.0) {
            @Override
            public double getSide() {
                return 0;
            }

            @Override
            public void setSide(double side) {

            }
        };
        rectangle.setColor("blue");
        rectangle.setLength(23);
        rectangle.setWidth(34);
        rectangle.getArea();
        rectangle.getPerimeter();
        System.out.println(rectangle.toString());

        //for Square
        Rectangle square=new Square();
        square.setSide(12);
        square.getPerimeter();
        square.getArea();
        System.out.println(square.toString());


    }
}
