import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhaapj gia tri bat dau");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhaapj gia tri ket thuc");
        int end = Integer.parseInt(scanner.nextLine());
        List<Integer> arrList = IntStream.range(start,end+1).boxed().collect(Collectors.toList());
        System.out.println(arrList);
    }
}
