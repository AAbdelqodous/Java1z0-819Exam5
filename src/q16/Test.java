package q16;

import java.util.Optional;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Optional<String> optional = Stream.of("red", "green", "blue", "yellow")
                .sorted().findFirst();
        System.out.println(optional.get());
    }
}
