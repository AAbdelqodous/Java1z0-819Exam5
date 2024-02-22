package q6;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        char[] language = new char[] {'j', 'a', 'v', 'a'};
        Function<char [], String> obj = String::new; //Line n1
//        Function<char [], String> obj = arr -> new String(arr);
        String s = obj.apply(language); //Line n2
        language[0] = 'l';
        System.out.println(s);
        System.out.println(language);
    }
}
