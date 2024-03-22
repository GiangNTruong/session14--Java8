package bai4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai4 {
    public static void main(String[] args) {
        //Bài tập 4: Sử dụng phương thức sorted()
        //Đề bài: Sắp xếp danh sách chuỗi theo thứ tự bảng chữ cái
        List<String> stringList = new ArrayList<>();
        stringList.add("Bao");
        stringList.add("Tự");
        stringList.add("Tiep");
        stringList.add("QANH");
        stringList.add("Liem");
        stringList.add("Tien");
        System.out.println("Danh sách ban đầu : ");
        System.out.println(stringList + "\n");

        List<String> sortedList = stringList.stream().sorted((a, b) -> a.compareTo(b)).toList();
        System.out.println("Dnh sach dc sắp xếp");
        System.out.println(sortedList);
    }
}
