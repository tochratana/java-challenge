package oop_challenge.floor;

public class Floor {
    private double width;
    private double height;

    Floor(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = this.width < 0 ? 0 : width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = this.height < 0 ? 0 : height;
    }

    public double getArea() {
        return width * height;
    }
}

//public class Floor {
//
//    private double width;
//    private double length;
//
//    public Floor(double width, double length) {
//
//        if (width < 0) {
//            width = 0;
//        }
//
//        if (length < 0) {
//            length = 0;
//        }
//
//        this.width = width;
//        this.length = length;
//    }
//
//    public double getArea() {
//        return width * length;
//    }
//}