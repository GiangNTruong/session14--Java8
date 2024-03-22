package thuchanh.thuchanh1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0));
        shapes.add(new Recangle(4.0,6.0));
        for (Shape shape : shapes){
            System.out.println("Dien tich " + shape.area());
        }
    }
}
