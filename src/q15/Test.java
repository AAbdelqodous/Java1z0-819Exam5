package q15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        var valDay = LocalDate.of(2022, 2, 14);
        var formatter = DateTimeFormatter.ofPattern("DD-MM-uuuu"); //DateTimeFormatter.ofPattern("dd-MM-uuuu");
        System.out.println(valDay.format(formatter));
    }
}
