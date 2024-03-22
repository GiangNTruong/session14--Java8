import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Bai8 {
    //Tạo 1 danh sach
    public static void main(String[] args) {
        // Tạo một danh sách
        List<Integer> numberList = Arrays.asList(1, 235,2,5, 7, 3);

        // Kiểm tra xem có số chẵn nào trong danh sách hay không
        boolean containsEvenNumber = numberList.stream().anyMatch(number -> number % 2 == 0);

        // Sử dụng Optional để xử lý trường hợp không tìm thấy số chẵn
        Optional<Boolean> optionalContainsEvenNumber = Optional.of(containsEvenNumber);

        // In ra kết quả hoặc thông báo nếu không tìm thấy số chẵn
//        optionalContainsEvenNumber.ifPresentOrElse(
//                containsEven -> System.out.println("Danh sách có chứa số chẵn: " + containsEven),
//                () -> System.out.println("Không có phần tử chẵn trong danh sách")
//        );
        //Nếu có số chẵn thì in ra soos đàu tiền nếu ko ném ra lỗi ko tìm thấy
        // Tìm số chẵn đầu tiên trong danh sách
        Optional<Integer> evenNumber = numberList.stream()
                .filter(number -> number % 2 == 0)
                .findFirst();

        // In ra số chẵn nếu có, nếu không thì hiển thị thông báo
        System.out.println(evenNumber.orElseThrow(() -> new RuntimeException("Không có phần tử chẵn trong danh sách")));
    }


}
