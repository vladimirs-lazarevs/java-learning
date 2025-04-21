package lv.acodemy;

public class ThirdLessonPartTwo {
    public static void main(String[] args) {

       int summa = add(10,30);
        System.out.println(summa);
        System.out.println(add(20,10));
        greet("Nikita");

    }
    public static int add(int a, int b){
        int result = a + b;
        return result;

    }

    public static int add(int a, int b, int c){
        return a+b+c;

    }
    public static void greet(String name) {}
    public static int max(int a, int b, int c){
        return Math.max(a,b);
    }
}


