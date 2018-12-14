package Practicals;

public class Square extends Rectangle {
    public Square(){

    }
    public Square(double side){
        setLength(side);
    }
    public Square(double side,String color,boolean filled){

        this.setLength(side);
        this.setColor(color);
        this.setColor(color);
    }

    @Override
    public double getSide() {
        return this.getSide();
    }

    @Override
    public void setSide(double side) {
        setSide(side);
    }

    @Override
    public void setWidth(double width) {
        setWidth(width);
    }

    @Override
    public void setLength(double side) {
        setLength(side);
    }

    @Override
    public String toString() {
        String s = String.valueOf((super.getArea()));
        return s;
    }
}
