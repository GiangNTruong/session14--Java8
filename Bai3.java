import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bai3 {
    public static void main(String[] args) {
        List<Integer> random = Stream.generate(()->new Random().nextInt(1000)).limit(100).sorted().collect(Collectors.toList());
        Integer sum = random.stream().reduce(0,Integer::sum);
        System.out.println(random);
        System.out.println(sum);;
    }


}
