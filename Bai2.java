import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bai2 {
    public static void main(String[] args) {
        List <Integer> arr = Stream.generate(()->new Random().nextInt(1000)).limit(100).filter(n->n%2==0).sorted().collect(Collectors.toList());
        System.out.println(arr);
    }

}
