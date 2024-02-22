package q40;

public class Outer {
    private static int i =10;
    private int j = 20;

    static class Inner{
        void add(){
            System.out.println(i + 5); //j);
        }
    }
}
