package q39;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Test {
    public static void main(String[] args) {
        try {
            new File("C:\\Test\\t1.txt"); //Line n1
            new FileWriter("C:\\Test\\t2.txt"); //Line n2
            new PrintWriter("C:\\Test\\t3.txt"); //Line n3
            new BufferedWriter(new FileWriter(new File("C:\\Test\\t4.txt"))); //Line n4
            Files.newBufferedWriter(Paths.get("C:", "Test", "t5.txt")); //Line n5
            Files.newBufferedWriter(Paths.get("C:", "Test", "t6.txt"), StandardOpenOption.CREATE); //Line n6
            Files.newBufferedWriter(Paths.get("C:", "Test", "t7.txt"), StandardOpenOption.CREATE_NEW); //Line n7
            Files.newBufferedWriter(Paths.get("C:", "Test", "t8.txt"), StandardOpenOption.WRITE); //Line n8
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(new File("C:\\Test").listFiles().length);
    }
}
