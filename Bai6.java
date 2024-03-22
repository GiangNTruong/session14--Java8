import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Bai6 {
    //Bài tập 6: Sử dụng phương thức map()
    //Đề bài: Chuyển danh sách các chuỗi thành chữ in hoa:
    //Bước 1: Tạo một danh sách chuỗi.
    //Bước 2: Sử dụng Stream API và phương thức map() để chuyển các chuỗi thành chữ in hoa.
    public static void main(String[] args) {
        //Tạo một danh sách chuỗi.
        List<String> stringList = Arrays.asList("abc","gaing","giang");
        //Sử dụng Stream API và phương thức map() để chuyển các chuỗi thành chữ in hoa.
        List<String> uppercaseList = stringList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("danh sach da chinh sua viet hoa"+uppercaseList);

    }
}
