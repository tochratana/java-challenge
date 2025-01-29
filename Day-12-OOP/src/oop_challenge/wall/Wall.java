package oop_challenge.wall;

public class Wall {
    private double width;
    private double height;

    Wall(){}
    Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    }


    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }
    public void setWidth(double width) {
        this.width = this.width < 0 ? this.width : 0;
    }
    public void setHeight(double height) {
        this.height = this.height < 0 ? this.height : 0;
    }

    public double getArea (double width, double height){
        return width * height;
    }
}
