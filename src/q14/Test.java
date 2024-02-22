package q14;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.asList(1,2,3,4,5).stream(); //Stream.of(1,2,3,4,5)
        System.out.println(stream.mapToInt(i -> i)
                .average()
                .getAsDouble() //.getAsInt()
        );
    }
}
