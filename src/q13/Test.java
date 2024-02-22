package q13;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("abc"));
        list.add(new StringBuilder("xyz"));
        list.stream()
                .map(x -> x.reverse())
                .forEach(System.out::println);
        System.out.println(list);
    }
}
