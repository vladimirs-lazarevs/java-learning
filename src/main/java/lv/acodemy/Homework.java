package lv.acodemy;

public class Homework {
    public static void main(String[] args) {

        //5*10

        int number = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + number + " = " + (i * number));
        }
        System.out.println("================");

        //Summa ot 1 do 100

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма чисел от 1 до 100 = " + sum);
        System.out.println("=================");

        //Ot 10 do 1

        int i = 10;

        while (i >= 1) {
            System.out.println(i);
            i--;




        }
    }
}
