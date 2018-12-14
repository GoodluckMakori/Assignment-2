package Practicals;

public abstract class Rectangle extends Shape {
    private double width=1.0;
    private double length=1.0;
    public Rectangle(){

    }
    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width,double length,String color){
        this.width=width;
        this.length=length;
        this.setColor(color);
    }

    public double getWidth() {
        return width;
    }

    public abstract double getSide();

    public abstract void setSide(double side);

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.length*this.width;
    }
    public double getPerimeter(){
        return 2*(this.length + this.width);
    }

    @Override
    public String toString() {
        return ("the area is "+getArea()+" square units and Perimeter is "+getPerimeter()+" units");
    }
}
