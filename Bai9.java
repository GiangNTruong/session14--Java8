import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
//        Bài tập 1: Viết chương trình để lấy ngày hiện tại của hệ thống và các nơi bao gồm : Asia/Tokyo, Australia/Sydney ,America/Sao_Paulo
//Bài tập 2: Viết chương trình để lấy thời gian hiện tại (giờ phút giây).
//Bài tập 3: Viết chương trình để tính toán số ngày giữa hai ngày (LocalDate) nhập vào .
//Bài tập 4: Viết chương trình để tính toán số ngày trong tháng hiện tại.
//Bài tập 5: Viết chương trình để tính toán số ngày trong năm hiện tại.
//Bài tập 6: Viết chương trình để chuyển đổi một chuỗi ngày sang một đối tượng LocalDate.
//Bài tập 7: Viết chương trình để chuyển đổi một đối tượng LocalDate sang một chuỗi ngày (dd/MM/yyyy).
//Bài tập 8: Viết chương trình để chuyển đổi một đối tượng LocalDateTime sang một chuỗi ngày(dd/MM/yyyy HH:mm:ss).
//Bài tập 9: Viết chương trình để so sánh hai ngày LocalDate ( trả về int ).
//Bài tập 10: Viết chương trình để so sánh hai thời gian  LocalTime.
//Bài tập 11: Viết chương trình để thêm hoặc bớt một số ngày, giờ, phút, giây hoặc mili giây vào một ngày hoặc thời gian nhập vào.
//Bài tập 12: Viết chương trình để tính toán ngày (LocalDate) tiếp theo hoặc ngày trước đó của một ngày.
//Bài tập 13: Viết chương trình để tính toán thời gian (LocalTime) tiếp theo hoặc thời gian trước đó của một thời gian.
        //Bai1
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("ngay hien tai o he thong" + now);
        System.out.println("Ngày hiện tại ở Asia/Tokyo: "+now.withZoneSameInstant(ZoneId.of("Asia/Tokyo")));
        System.out.println("Ngày hiện tại ở Australia/Sydney: "+now.withZoneSameInstant(ZoneId.of("Australia/Sydney")));
        System.out.println("Ngày hiện tại ở America/Sao_Paulo: "+now.withZoneSameInstant(ZoneId.of("America/Sao_Paulo")));

        //Bai2
        LocalDate localDateNow = LocalDate.now();
        System.out.println(localDateNow);

        Scanner scanner = new Scanner(System.in);
        //Bai3
//        System.out.println("Nhap vao ngay thu nhat (dinh dang yyyy-mm-dd");
//        String firstDateString = scanner.nextLine();
//        LocalDate firstDate = LocalDate.parse(firstDateString);
//        System.out.println("Nhap vao ngay thu hai (dinh dang yyyy-mm-dd");
//        String secondDateString = scanner.nextLine();
//        LocalDate secondDate = LocalDate.parse(firstDateString);
//       long daysBetween = ChronoUnit.DAYS.between(firstDate,secondDate);
//        System.out.println("Khoang cachs: " + daysBetween);
//scanner.close();

        LocalDate date1 = LocalDate.of(2024, 1, 1);
        LocalDate date2 = LocalDate.of(2024, 2, 5);
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Số ngày giữa hai ngày: " + daysBetween);

        //Bai4
        YearMonth yearMonth = YearMonth.now();
        int dayMonth = yearMonth.lengthOfMonth();//Hàm lengthOfMonth trả về một số nguyên là số ngày trong tháng được chỉ định.
        System.out.println("So ngay trong thang hien tai : " + dayMonth);

        //Bai 5
        Year year = Year.now();
        int dayYear = year.length();
        System.out.println(" số ngày trong năm hiện tại. :" +dayYear);

        //Bai 6:
        String dateString = "2024-12-31";
        LocalDate dateFromString = LocalDate.parse(dateString);
        System.out.println("doi tuong localDate tu chuoi ngay : " + dateFromString);

        //bai 7
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateStringFromLocalDate = date.format(formatter);
        System.out.println("Chuoi ngay tu doi tuong LocalDate : "+dateStringFromLocalDate);

        //Bai 8
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dateTimeStringFormLocalDateTime = dateTime.format(dateTimeFormatter);
        System.out.println("Chuoi ngay tu doi tuong LocalDateTime : " +dateTimeStringFormLocalDateTime);

        //bai9
        LocalDate dateA = LocalDate.of(2024,1,1);
        LocalDate dateB = LocalDate.of(2024,12,31);
        int comparsion = dateA.compareTo(dateB);
        System.out.println("Keets qua so sanh 2 ngay localDate : " + comparsion);

        // Hai ngày
        LocalDate date3 = LocalDate.of(2024, 3, 20);
        LocalDate date4 = LocalDate.of(2024, 3, 21);

        // So sánh hai ngày
        int comparison = date1.compareTo(date2);

        // In ra kết quả so sánh
        if (comparison < 0) {
            System.out.println("date3 < date4");
        } else if (comparison > 0) {
            System.out.println("date3 > date4");
        } else {
            System.out.println("date3 == date4");
        }

        //bai10
        //2 thoi gian
        LocalTime time1 = LocalTime.of(10,30);
        LocalTime time2 = LocalTime.of(11,30);
        int comparsion1 = time1.compareTo(time2);
        if (comparsion1 < 0) {
            System.out.println("time1<time2");
        } else if (comparsion1 > 0) {
            System.out.println("time1 > time2");
        } else {
            System.out.println("time1 == time2");
        }

        //bai 11
        LocalDateTime timeNow = LocalDateTime.now();
        LocalDateTime dateTimeAfterAdding = timeNow.plusDays(1).plusHours(2).plusMinutes(30).plusSeconds(45).plusNanos(500);
        System.out.println("Thoi gian sau khi them vao " + dateTimeAfterAdding);

        //bai12
        LocalDate nextDay = LocalDate.now().plusDays(1);
        LocalDate previousDay = LocalDate.now().minusDays(1);
        System.out.println("Ngay next la : " + nextDay);
        System.out.println("Ngay trc la : " + previousDay);

        //Bai13
        LocalTime nextTime = LocalTime.now().plusHours(1);
        LocalTime previousTime = LocalTime.now().minusMinutes(222);
        System.out.println("Thoi gian next : " +nextTime);
        System.out.println("Thoi gian previous : "+previousTime);
    }
}
