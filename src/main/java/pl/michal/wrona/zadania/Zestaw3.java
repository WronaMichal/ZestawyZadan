package pl.michal.wrona.zadania;

import java.util.ArrayList;

public class Zestaw3 {
    public static void zadanie1(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(i) < array.get(j)) {
                    int temp = array.get(j);
                    array.set(j, array.get(i));
                    array.set(i, temp);
                }

            }
        }
        System.out.println(array);
    }

    public static void zadanie2(String word) {
        int length = word.length();
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (i == length - 1) {
                sb.append(word.charAt(i)).append(count);
                break;
            }
            if (word.charAt(i) == word.charAt(i + 1)) {
                count++;
            } else {
                sb.append(word.charAt(i)).append(count);
                count = 1;
            }
        }

        System.out.println(sb);

    }

    public static void zadanie2a(String word) {
        int length = word.length();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < length; i++) {
            switch (word.charAt(i)) {
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '0':
                    count++;
            }

            if (count == 1) {
                sb.append(word.charAt(i - 1));
                int number = word.charAt(i);
            }
            if (count > 1) {
                sb.append(word.charAt(i - count+1));

            }


        }
    }
}
