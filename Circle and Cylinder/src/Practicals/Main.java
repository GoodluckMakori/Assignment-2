package Practicals;

public class Main {

    public static void main(String[] args) {
	Circle circle= new Circle(1.0);
	circle.setRadius(21);
	circle.setColor("blue");
	circle.getArea();

	Cylinder cylinder=new Cylinder(1.0);
	cylinder.setHeight(12);
	cylinder.getVolume();
	System.out.println(circle.toString()+"has the area of "+circle.getArea()+" square units");
	System.out.println("the volume of cylinder is "+cylinder.getVolume()+" cubic units");
    }
}
