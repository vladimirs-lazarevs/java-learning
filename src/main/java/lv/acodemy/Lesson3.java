package lv.acodemy;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean result = 1<2;
        if(isRaining) {
            System.out.println("Take an umbrella");
        }
        int temperature = 30;
        if (temperature>29){
            System.out.println("Its too hot");
        }
        //AND(&&)
        if (4>2 && 10>5){
            System.out.println("Both are equal!");
        }
        //OR(||)
        if (4>2 || 10>5) {
            System.out.println("Execute!");
        }
        boolean isWeekDay = true;
        if (isWeekDay){
            System.out.println("Working day today");
        } else {
            System.out.println("Will stay at home");
        }

        int number = 10;
        //% -
        //+ - / * (
        if (number % 2 ==0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        int age = 17;
        if (age >=18) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
        int hour = 7;
        if(hour == 5){
            System.out.println("Will go for run!");
        } else if (hour==7) {
            System.out.println("will have been breakfast");
        } else if (hour==9) {
            System.out.println("Will starn work");
        } else {
            System.out.println("Free time");
        }
        int score = 85;
        if(score>=90){
            System.out.println("Perfect");
        } else if (score>=70) {
            System.out.println("Good");
        } else if (score>=50) {
            System.out.println("OK");
        }else {
            System.out.println("NOT OK");
        }
        int agee = 22;
        if (agee>=0 && agee<=6){
            System.out.println("Baby");
        } else if (agee>=7 && agee<=17) {
            System.out.println("Shkila!!!!");
        } else if (agee>=18 && agee<=65) {
            System.out.println("Adult");
        }else {
            System.out.println("Pens");
        }
        for (int i = 1; i<=10; i++){
            if (i%2==0){
                System.out.println("Number:"+i+" is even number!");
            }
        }

        int[]numbers = {-2,-10,5,6,-100,3,0,20};
        int sum = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sum = sum + numbers[i];
            }
        }
        System.out.println("Sum of pozitive numbers: " + sum);

        int[] arr = new int[20];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        System.out.println(Arrays.toString(arr));

        for (int num : arr) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("Number: " + num + " can be divided by 3 and 5");
            } else if (num % 3 == 0) {
                System.out.println("Number: " + num + " can be divided by 3");
            } else if (num % 5 == 0) {
                System.out.println("Number: " + num + " can be divided by 5");
            } else {
                System.out.println("Numbers: " + num + "can't be divided by 3 or 5");
            }
        }
    }




}
