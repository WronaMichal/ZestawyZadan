package pl.michal.wrona.zadania;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.awt.*;
import java.util.*;

import static java.lang.Math.round;

public class Zestaw1 {
    public static void zadanie1a(int one, int two) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println("\nEnter action: \n 0. quit method \n 1. add \n 2. multiply \n 3. divide ");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Shut down method");
                    quit = true;
                    break;

                case 1:
                    int sum = one + two;
                    System.out.println("Sum is " + sum);
                    break;
                case 2:
                    int multiply = one * two;
                    System.out.println("Multiplication is " + multiply);
                    break;
                case 3:
                    int division = one + two;
                    System.out.println("Division is " + division);
                    break;

            }

        }
    }

    public static void zadanie2(double number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWprowadź liczbę przedziałów");
        int n = scanner.nextInt();
        for (int i = 1; i < n + 1; i++) {
            double newNumber = round(number * i);
            System.out.println(number + " * " + i + " = " + newNumber + " |");
        }

    }

    // używam Multimap
    public static void zadanie3(double r) {
        Multimap<Double, Double> map = ArrayListMultimap.create();
        double area = Math.PI * r * r;
        double radius = 2 * Math.PI * r;
        map.put(r, radius);
        map.put(r, area);
        System.out.println("\n" + map.values());
    }

    public static void zadanie4(double r) {
        Multimap<Double, Double> map = ArrayListMultimap.create();
        double circuit = 4 * r;
        double area = r * r;
        map.put(r, circuit);
        map.put(r, area);
        System.out.println(map.values());
    }

    public static void zadanie5(String one, String two) {
        String temp = "";
        String temp2 = "";
        temp2 = one;
        temp = two;

        System.out.println(temp + " " + temp2);

    }

    //używasz tutaj Treemap i recursion (funkcja sama siebie woła)

    public static String zadanie6(int number) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        int l = map.floorKey(number);
        if (number == l) {
            return map.get(number);
        }
        return map.get(l) + zadanie6(number - l);


    }

//    public static String zadanie6a(int number){
//        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
//        map.put("M", 1000);
//        map.put("CM", 900);
//        map.put("D", 500);
//        map.put("CD", 400);
//        map.put("C", 100);
//        map.put("XC", 90);
//        map.put("L", 50);
//        map.put("XL", 40);
//        map.put("X", 10);
//        map.put("IX", 9);
//        map.put("V", 5);
//        map.put("IV", 4);
//        map.put("I", 1);
//        int l = Integer.parseInt(map.floorKey(String.valueOf(number)));
//        if ( number == l ) {
//            return map.get(number);
//        }
//        return map.get(l) + zadanie6(number-l);

    public static String zadanie7(long num) {
        int decimalNumber = 0, i = 0;
        long remainder;
        String s = null;
        while (num != 0) {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder + Math.pow(2, i);
            s = String.valueOf(decimalNumber);
        }
        return s;
    }

    public static long zadanie7a(int num) {
        long binaryNumber = 0;
        int remainder, i = 1;

        while (num != 0) {
            remainder = num % 2;
            num /= 2;

            binaryNumber += remainder * Math.pow(10, i);
            i++;
        }

        return binaryNumber;
    }

    public static int zadanie7b(int decimalNumber) {
        int octalNumber = 0, i = 1, remainder;
        while (decimalNumber != 0) {
            remainder = decimalNumber % 8;
            decimalNumber /= 8;
            octalNumber += remainder * i;
            i *= 10;

        }
        return octalNumber;
    }

    public static int zadanie7c(int octal) {
        int decimalNumber = 0, i = 0, remainder;

        while (octal != 0) {
            remainder = octal % 10;
            octal /= 10;
            decimalNumber += remainder * Math.pow(8, i);
            i++;
        }
        return decimalNumber;
    }

    public static int zadanie7d(int decimal) {
        int hexadecimal = 0, i = 0, remainder;

        while (decimal != 0) {
            remainder = decimal % 16;
            decimal /= 16;
            hexadecimal += remainder * Math.pow(10, i);
            i++;
        }
        return hexadecimal;
    }

    public static int zadanie7e(int hexadecimal) {
        int decimal = 0, i = 0, remainder;

        while (hexadecimal != 0) {
            remainder = hexadecimal % 10;
            hexadecimal /= 10;
            decimal += remainder * Math.pow(16, i);
            i++;
        }
        return decimal;
    }

    public static int zadanie8(int num) {

        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;

    }

    public static int zadanie8a(int num) {
        int sum;

        for (sum = 0; num != 0; num /= 10) {
            sum += num % 10;
            num /= 10;

            if (sum > 9) {
                continue;
            }

        }

        return sum;


    }

    public static double zadanie9(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static String zadanie10(String word) {
        char[] in = word.toCharArray();
        int begin = 0;
        int end = in.length - 1;
        char temp;
        while (end > begin) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);

    }

    // here colon (:) means to set c to each value of word.toCharArray()
    public static void zadanie11(String word) {
        int whiteSpace = 0, commas = 0, dots = 0;
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (char c : word.toCharArray()) {
            if (c == ' ') {
                whiteSpace++;
            } else if (c == ',') {
                commas++;
            } else if (c == '.') {
                dots++;
            }


        }
        map.put("Whitespace", whiteSpace);
        map.put("Commas", commas);
        map.put("Dots", dots);
        System.out.println(map);

    }

    public static void zadanie12(int num) {
        int sum = 0, digit;
        for (int i = 0; i <= 1000000; i++) {
            digit = i % 10;
            if (digit == num) {
                sum += i;
            } else {
            }
        }

        System.out.println(sum);

    }

    public static void zadanie13() {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                integers.add(i);

            }

        }

        System.out.println(integers);
    }

    public static void zadanie14(){
        ArrayList<Integer> integers = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                integers.add(i);

            }

        }
        System.out.println(integers);

    }

    public static void zadanie15(int num){
        ArrayList<Integer> integers = new ArrayList<Integer>();
        for(int i =2;i<num; i++){
            if(i %num/2 ==0){
                integers.add(i);
            }

        }

        System.out.println(integers);
    }


}




