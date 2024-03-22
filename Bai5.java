import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bai5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri bat dau va ket thuc");
        System.out.println("Gia tri bat dau");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.println("Gia tri ket thuc ");
        int end = Integer.parseInt(scanner.nextLine());
        List<Integer> integerList = IntStream.range(start, end).boxed().collect(Collectors.toList());
        System.out.println("danh sach so nguyen tu " +start + "den " +end);
        System.out.println(integerList);
        System.out.println("Nhap gia tri muon nhap vao");
        int threShold = Integer.parseInt(scanner.nextLine());
        // Sử dụng Stream API và phương thức filter() để lọc các số lớn hơn giá trị đã nhập
        // Sử dụng phương thức forEach() để in các số đã lọc ra màn hình
        integerList.stream().filter(num->num>threShold).forEach(System.out::println);




    }
}
