package thuchanh.thuchanh2;

import java.util.ArrayList;
import java.util.List;

public class Thuchanh2 {
    //Đề bài: Viết một chương trình Java để sử dụng lambda expression để tìm các số nguyên chẵn từ một danh sách các số nguyên. Sử dụng một danh sách gồm các số nguyên, và sau đó sử dụng lambda để lọc ra các số chẵn và in chúng ra màn hình.
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("Cacs soos chawnx tuwf danh sachs");
        numbers.stream().filter(number-> number %2 == 0 ).forEach(System.out::println);
    }
}
