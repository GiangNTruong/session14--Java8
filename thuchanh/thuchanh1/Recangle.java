package thuchanh.thuchanh1;

public class Recangle implements Shape{
    private final double width;
    private final double height;

    public Recangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double area(){
        return width*height;
    }
}
