import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Bai1 {
    public static void main(String[] args) {
//        Random random = new Random();
//        int [] arr = new int[100];
//        //Tạo 1 mảng số nguyên
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 1 + random.nextInt(1000);//random 1-1000
//        }

        List<Integer> random = Stream.generate(()->new Random().nextInt(1000)).limit(100).sorted().collect(Collectors.toList());
        Optional<Integer> max= random.stream().max(Comparator.naturalOrder());
        System.out.println("SỐ lớn nhất  " + max.orElseThrow(()->new RuntimeException("Ko có phan tu nao trong danh sach")));
    }
}
