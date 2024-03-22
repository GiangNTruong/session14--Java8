package thuchanh.thuchanh3;

import java.util.ArrayList;
import java.util.List;

public class Thuchanh3 {
    //Đề bài: Tạo một danh sách các từ, sau đó sử dụng Stream API để tìm và in ra tất cả các từ bắt đầu bằng chữ "a" và có độ dài bằng 3 ký tự. Sử dụng phương thức filter() và forEach() của Stream API.
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple Meo Meo");
        words.add("banana Wine");
        words.add("VodKa Russsia");
        words.add("all");
        System.out.println("Cacs tuwf bangwf a vaf cos do dai 3 ky tu");
        words.stream().filter(word -> word.startsWith("a") && word.length()==3).forEach(System.out::println);
    }
}
